package lamda_expression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("RAM");
        list.add("SHYAM");
        list.add("HARI");
        list.sort((a,b)-> {
            System.out.println(a +"|" +b);
            return a.compareTo(b);
        });

        System.out.println(list);




    }
}
