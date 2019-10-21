import java.util.ArrayList;
import java.util.List;

public class MySweetProgram { //class

	public static void main(String[] args) { //method
		User me = new User();
		me.setFirstName("Varun");
		me.setLastName("Chopra");
		User you = new User();
		you.setFirstName("Sub");
		you.setLastName("Scriber");
		
		List<User> users = new ArrayList<User>();
		users.add(you);
		users.add(me);
		System.out.println(users.get(1).getFullName());

	}
	
}

//class- contains everything and has members
//methods - they do something
//properties - store something
//statement - telling a computer something
//properties - store something
//variable - stores some value
//expression - evaluates to a value
//operator - work on operands to produce a value
//operand - the things operator works on
//literals - the value

//variable - 
//data type - the type of data. How computer evaluates the data.

//statically typed - variables are given types up front
//dynamically typed - variables do not have types

//objects- instance of a class (class the data types)
//access modifier (public) - who can use
//static - no instance of class is needed
//object - instance of a class
//arguments - what you pass to a method (Part of calling)
//parameters - Variables to store an argument (part of definition)