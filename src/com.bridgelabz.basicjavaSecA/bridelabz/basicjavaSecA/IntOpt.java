/******************************************************************************  
 *  Purpose: Perfrom  calculas operations from user inputs 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridelabz.basicjavaSecA;
import java.util.Scanner;
public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,c,d; 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the no a:");
		 a=sc.nextInt();
		 System.out.println("enter  the no b:");
		 b=sc.nextInt();		 
		 System.out.println("enter the no c:");
		 c=sc.nextInt();
		 System.out.println("enter the no d:");
		 d=sc.nextInt();
		   double f1=a+(b*c);
		   double f2=(a*b)+c;
		   double f3=c+(a/b);
		   double f4=(a%b)+c;
		    System.out.println("first_operation="+f1); 
		    System.out.println("first_operation="+f2);
		    System.out.println("first_operation="+f3);
		    System.out.println("first_operation="+f4);
	}

}
