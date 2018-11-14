package dom.jai.ds;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		int marks[]=new int[3];
		int Totalmarks,n=0;
    System.out.println("enter number of students");
    Scanner s=new Scanner(System.in);
    int numberOfStudents=s.nextInt();
    for(int i=0;i<numberOfStudents;i++) {
    	 for(int j=0;j<3;j++) {
    		marks[i]= s.nextInt();
    		 Totalmarks=+marks[i];
    		 if(marks[i]> 60) {
        		 n++;
    		 
    	 }
    	if(n>2) {
    		System.out.println("passed");
    	}
    	else if(n==2) {
    		System.out.println("promoted");
    	}
    	else {
    		System.out.println("failed");
    	}
    	 }    		 
    	 }
    	
    }
    
	}


