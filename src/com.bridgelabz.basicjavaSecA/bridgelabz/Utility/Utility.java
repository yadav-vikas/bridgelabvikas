/******************************************************************************  
 *  Purpose: perform whether the year is leap year or not
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class Utility {
	public static void leapyear(int year) {
		 if (year<1582) {
	    	 System.out.println("the year is not in list:");
	     }
	    else if(((year%4==0) && (year%100!=0) || (year%400==0))) 
	    { System.out.println("the year is  leap year");}
		
		else { System.out.println("the year is not a leap year");
	}
 }
}
