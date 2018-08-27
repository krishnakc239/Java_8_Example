package constructor_reference;

public class Person {
    private String name;

    public Person(){
        System.out.println("Person class object created using constructor reference !!!!");

    }
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        FunctionalInterface funcInf = Person::new;
        funcInf.createObject();

        FunctionalInterfaceWithArgument functInfArg = Person::new;
        System.out.println("reference to parameterized constructor, person name set to-"+functInfArg.getPerson("Ram").getName());
    }
}
