package com.jagadish.ds;

import java.util.Scanner;

class Armstrong
{
   public static void main(String args[])
   {
      int n, sum = 0, temp, remainder, digits = 0;
 
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input a number to check if it is an Armstrong number");      
      n = scanner.nextInt();
 
      temp = n;
      while (temp != 0) {
         digits++;
         temp = temp/10;
      }
      temp = n;
      while (temp != 0) {
         remainder = temp%10;
         sum+= Math.pow(remainder, digits);
         temp = temp/10;
      }
      if (n == sum)
         System.out.println(n + " is an Armstrong number.");
      else
         System.out.println(n + " isn't an Armstrong number.");        
   }     
}