
package com.bridelabz.basicjavaSecA;

import java.util.Scanner;
class TempratureConversion
{
	public static void main(String arg[])	
	{ 
	  //String Celsius;  String Fahreheit;
             	    Scanner scanner=new Scanner(System.in);	   	 
	    System.out.println("Enter temperature form:\n 1:Fahrenheit \n 2:Celsius");
                 int a=scanner.nextInt();
                 System.out.println("enter temprature=");
                 double t=scanner.nextDouble();
                   scanner.close();
                   if(a==1) {
	    System.out.println("Celsius temperature is = "+celsius(t));		  	  	     
	}
                   else if(a==2) {System.out.println("fahrenheit temprature is= "+fahreheit(t));}
                   else { System.out.println("false statement");}
	}
	static double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
	static double fahreheit(double C) {
		return (C*9/5)+32;
	}
}


