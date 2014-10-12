/**
*
* Prompts user to enter a value, checks if negative -- if not, prints out the square root
*
* @author <Shaurya Prakash>
* @version <12th October 2014>
*
*/

import java.util.Scanner;
public class SquareRootChecker {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
      
      System.out.println("Enter an number.");
      double sqrtInteger = 0.0;
      
      double integer = scnr.nextDouble();    
      
      if (integer >= 0) {      
      sqrtInteger = Math.sqrt(integer);      
      System.out.println("The square root of " + integer + " is " + sqrtInteger);      
                        }
                        
      else {
      System.out.println("CAN NOT COMPUTE SQUARE ROOT OF A NEGATIVE INTEGER.");
           }
           
      return;
	}

}
