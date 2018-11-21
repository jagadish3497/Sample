package dom.jai.com;

import java.util.Scanner;

public class Caluclator {

		
	public static void main(String[] args) {
	
		float FirstNumber;
		float SecondNumber;
		int number;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the Number:");
			FirstNumber=scanner.nextFloat();
			System.out.println("Enter the Number:");
			SecondNumber=scanner.nextFloat();
			System.out.println("1:Addition  2.Substraction  3.Multiplication  4.Divison  5.Modulus  6.Exit");
			number=scanner.nextInt();
				
		if(number==1) {
			
			System.out.println("The Addition of Numbers:-" + addition(FirstNumber,SecondNumber));
			
		}else if(number==2) {

			System.out.println("The Substraction of Number:-" + substraction(FirstNumber,SecondNumber));
			
		}else if(number==3) {
			
			System.out.println("The Multiplication of Numbers:-" + multiplication(FirstNumber,SecondNumber));
	
		}else if(number==4) {
			
			System.out.println("The Divison of Numbers:-" + divison(FirstNumber,SecondNumber));
		
		}else if(number==5) {
		
			System.out.println("The Modulus of Numbers:- " + modulus(FirstNumber,SecondNumber));
		}else if(number==6) {
			
			System.out.println("Thank You");
		}else {
			
			System.out.println("Enter Valid Number ");
		}
	}
	public static  float addition(float FirstNumber,float SecondNumber) {
        
		return FirstNumber+SecondNumber ;
    }
	public static float substraction(float FirstNumber,float SecondNumber) {
		return FirstNumber-SecondNumber ;
    }
	
	public static float multiplication(float FirstNumber,float SecondNumber) {
		return FirstNumber*SecondNumber ;
    }
	public static float divison(float FirstNumber,float SecondNumber) {
		return FirstNumber/SecondNumber ;
    }
	public static float modulus(float FirstNumber,float SecondNumber) {
		return FirstNumber%SecondNumber ;
    }

	
}
