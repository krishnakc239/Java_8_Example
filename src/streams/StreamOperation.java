package streams;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    List<Transection> transectionList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        StreamOperation so = new StreamOperation();
        so.doOperation();
        so.violation();
    }

    private void doOperation() throws IOException {
        InputStream is = asStream("C,hello,salary\nX,0,rent\nD,800,general");
        manipulateStream(is);
    }

    private void manipulateStream(InputStream inputStream) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            transectionList = reader.lines().map(getTransection).collect(Collectors.toList());
        }
//        transectionList.stream().forEach(System.out::println);

    }

    private void violation(){
        List<Violation> violationList1 = new ArrayList<>();

        List<Violation> violationList = transectionList.stream().filter(transection ->
            !(transection.getType().equalsIgnoreCase("C")) && !(transection.getType().equalsIgnoreCase("D")) || transection.getAmount().equals(BigDecimal.ZERO))
                .map(t -> new Violation(1,t.getType()))
                .collect(Collectors.toList());
//            int order = 1;
//            String property = "";

//            if (!(transection.getType().equalsIgnoreCase("C") && transection.getType().equalsIgnoreCase("D"))){
//                property = "type";
//                violationList.add(new Violation(order,property));
//            }
//            if (transection.getAmount().equals(BigDecimal.ZERO)){
//                property = "amount";
//                violationList.add(new Violation(order,property));
//            }
//            order++;
//            return violationList;
//        });
        System.out.println(violationList);

    }
    private Function<String, Transection> getTransection = (line) -> {
        String[] p = line.split(",");// a CSV has comma separated lines
        Transection transection = new Transection(getRquiredValue(p[0]),getRequiredAmount(p[1]),getRquiredValue(p[2]));
        return transection;
    };
    private String getRquiredValue(String value){
        return !isNull(value)? value.trim(): "";
    }

    private BigDecimal getRequiredAmount(String value){
        Optional<String> amountValue = Optional.ofNullable(value);
        return (amountValue.isPresent() && isNumeric(value))? new BigDecimal(value) : new BigDecimal("0");
    }

    public static boolean isNumeric(String str) {
        return !isNull(str) && (str.trim().matches("[-\\+]?\\d+(\\.\\d+)?") || str.trim().matches("[-\\+]?+(\\.\\d+)?") || /*match a -ve number that ends with (.) */ str.trim().matches("[-\\+]?\\d+(\\.)?"));  //match a number with optional '-' and decimal.
        //or match a number with optional '-' and start with '.'
    }

    public static boolean isNull(String field) {
        if (field == null)
            return true;
        else
            field = field.trim();

        return (field.equalsIgnoreCase("NULL") || field.equalsIgnoreCase("") || field.isEmpty());
    }


    private InputStream asStream(String s) {
        return new ByteArrayInputStream(s.getBytes());
    }
}
