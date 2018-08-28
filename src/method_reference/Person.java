package method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Person  {
     private String name;

    public void setName(String name) {
        this.name = name;
    }
    //instance method
    void display(){
        System.out.println("instance method called");
    }
    //static method
    public static String displayInfo(String pname){
        return pname;
    }

    void displayName(){
        System.out.println("supplied person name =="+ name);
    }
    public static void main(String[] args) {

         //reference to static method
        FunInfInstanceMethod staticRef = Person::displayInfo;
        System.out.println("reference to static method getName-"+ staticRef.interfaceGetName("Hari"));

        //reference to instance method
        Person p =new Person();
        FunctionalInterface ref = p::display;
        ref.display();

        //reference to an instance method of an arbitrary object of a particular type
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person();
        p1.setName("RAM");

        Person p2 = new Person();
        p2.setName("HARI");

        personList.add(p1);
        personList.add(p2);
        System.out.println("reference to an instance method of an arbitrary object of a particular type->");
        personList.forEach(Person::displayName);
        /*Here it should be noted that display is an instance method
         which will be called for each object of type Person
         in the list. As we know the fact that
         instance methods can be called only on an object reference.
         Here the object reference is an arbitrary one.*/
    }


}
