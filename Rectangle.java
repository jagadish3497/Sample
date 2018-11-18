package Shapes;

import java.util.Scanner;


public class Rectangle extends Shape {
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter breadth to rectangle");
		int breadth=sc.nextInt();
		System.out.println("enter length to rectangle");
		int length=sc.nextInt();
		
		
		System.out.println("Rectrangle drawn with length "+length+" and breadth"+breadth);
		
		
	}

}