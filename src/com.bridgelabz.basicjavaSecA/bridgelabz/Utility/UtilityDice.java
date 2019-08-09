/******************************************************************************  
 *  Purpose: created a method to add 2 random numbers
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class UtilityDice {
	public static void Dice(double a,double b) {
		 a = Math.round(a);
		 b = Math.round(b);
		 int result=(int) (a+b);
		 System.out.println("the roll sum of dice is: "+result);
	}

}
