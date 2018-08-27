package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //Creating an empty optional object
        Optional<User> user = Optional.empty();

        //Create an Optional with a non-null value
        User user1 = new User("102", "Ram Thapa","MALE");
        Optional<User> userOptional_non_null = Optional.of(user1);

        //Create an Optional with a value which may or may not be null
        Optional<User> userOptional = Optional.ofNullable(user1);

        //check the presence of value
        //isPresent()
        if (userOptional_non_null.isPresent()){
            System.out.println("value found ==="+ userOptional_non_null.get().getId());
        }else {
            System.out.println("Optional is empty");
        }
        if (userOptional.isPresent()){
            System.out.println("value found ==="+ userOptional.get().getName());
        }else {
            System.out.println("Optional is empty");
        }

        //ifPresent()
       userOptional.ifPresent(value -> {
           String name = value.getName().toUpperCase();
           System.out.println("Name found with ifPresent() - " + name);
       });

        //Retrieving the value from Optional
        //orElse()
        User finalUser = userOptional.orElse(new User("100", "Unknown User","Unknown gender"));
        System.out.println("retriving data through orElse() method==="+ finalUser.getId() +" "+ finalUser.getName());

        //orElseGet()
        User finalUser1 = userOptional.orElseGet(() -> {
            return new User("0", "Unknown User","Unknown gender");
        });
        System.out.println("retriving data through orElseGet() method==="+ finalUser1.getId() +" "+ finalUser.getName());

        //Filtering values
        Optional<User> new_user =Optional.ofNullable(new User("1","Hari","MALE"));
        new_user.filter(user3 -> user3.getGender().equalsIgnoreCase("MALE"))
                .ifPresent(
                (value)-> System.out.println("gender  matched for "+ value.getName()));

        //Extracting and transforming values using map():
        Address userAddress = new Address("Nepal");
        Optional<Address> addressOptional = Optional.ofNullable(new Address("Nepal"));
        //using conventional method
        if(userAddress != null) {
            String address = userAddress.getAddress();
            if(address != null && address.equalsIgnoreCase("Nepal")) {
                System.out.println("conventional method >>> User belongs to Nepal");
            }
        }

        //using optional map method
        addressOptional.map(Address::getAddress)
                .filter(address -> address.equalsIgnoreCase("Nepal"))
                .ifPresent( country-> {
                    System.out.println("map() method >>>> User belongs to :"+ country);
                });



    }
}
