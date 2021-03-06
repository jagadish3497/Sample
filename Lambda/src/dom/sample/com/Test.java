package dom.sample.com;
import java.util.*; 
import java.util.function.Predicate; 

	
 public class Test { 
	    public static void main(String args[]) 
	    { 
	  
	        // create a list of strings 
	        List<String> names = Arrays.asList("Gowtham"," Krishna"); 
	  
	        // declare the predicate type as string and use 
	        // lambda expression to create object 
	        Predicate<String> p = (s)->s.startsWith("K"); 
	  
	        // Iterate through the list 
	        for (String st:names) 
	        { 
	            // call the test method 
	            if (p.test(st)) 
	                System.out.println(st); 
	        } 
	    } 
	}

