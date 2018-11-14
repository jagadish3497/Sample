package com.jagadish.ds;
import java.util .*;
public class Compund {

	public static void main(String[] args) {
		
		    double pr, rate, t, sim,com;
		    Scanner scanner=new Scanner (System. in);
		    System.out.println("Enter the amount:");
		    pr=scanner.nextDouble();
		    System. out. println("Enter the No.of years:");
		    t=scanner.nextDouble();
		    System. out. println("Enter the Rate of  interest");
		    rate=scanner.nextDouble();
		    sim=(pr * t * rate)/100;
		    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
		    System.out.println("Simple Interest="+sim);
		    System.out. println("Compound Interest="+com);
		   }
		

	}


