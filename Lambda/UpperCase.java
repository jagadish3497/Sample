package dom.upper.com;

import java.util.*;
import java.util.stream.Collectors;


public class UpperCase {

	 
		  public static void main(String[] args) {
			  

			List<String> list = Arrays.asList("krishna", "arjuna", "krishna arjuna");

			list.replaceAll(String::toUpperCase);
			System.out.println(list);
			  
			  
//List<String> list1 = list2.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
//System.out.println(list1);
			  
			  

	
}
}
