package method_reference;

import java.util.function.Function;


public class Util extends ParentUtil{

public Util(){
	Function<String,  String> strFunc = this::append;
	String s=  strFunc.apply("this::append >> Current class append() called.");
	System.out.println(s);

	strFunc = Util.super::append;
	s=  strFunc.apply("Util.super::append >> Super class append() called.");
	System.out.println(s);

}

@Override
public String append(String s1){
	return s1;
}

public static void main(String[] args) {
	new Util();
}
}
