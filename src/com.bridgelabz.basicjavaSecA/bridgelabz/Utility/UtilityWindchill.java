/******************************************************************************  
 *  Purpose: method to get 'w as effective temprature'
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class UtilityWindchill {
	public static void windchill(int temp,int velocity) {
		// to calculate effective temprature refers as w
		double w=35.74+0.6215*(temp)+(0.4275*(temp)-35.75)*Math.pow(velocity, 0.16);
	System.out.println("the effective temprature is:::"+w);
	}
}
