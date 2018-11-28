package dom.sample.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingJava8 {

	public static void main(String[] args) {
		
		List<Person> people=Arrays.asList(
				new Person("Arjuna","Krishna",22),
				new Person("Arjun","Deddy",25),
				new Person("Chenna","Aeddy",24),
				new Person("Rahul","Chowdary",28),
				new Person("Lokesh","Rahul",22)
				);
		//1.Sort list by sort Name...
		System.out.println("Sorting");
		Collections.sort(people, (p1,p2)->p2.getLastName().compareTo(p1.getLastName()));
		System.out.println(people+"\n");
		System.out.println();
		//2.Create methods that prints all elements in list....
		System.out.println("Printing all persons");
		printConditionally(people, p -> true);
		System.out.println();
		
		//3.Create a method that prints all people that have last name beginning with R.......
		System.out.println("Printing all names with letter R");
		printConditionally(people, p-> p.getLastName().startsWith("R"));
		
	}



	private static void printConditionally(List<Person> people, Condition condition) {
		// TODO Auto-generated method stub
		for(Person p : people){
			if(condition.test(p))
				System.out.println(p);
			}
		}				
		
	}


interface Condition{
	boolean test(Person p);
}
