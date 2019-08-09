/******************************************************************************  
 *  Purpose: To determine the distance betwenn 2 points
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class UtilityDistance {
	public static double calculateDistance(int x, int y)
    {
        
        double result=((Math.pow(x, 2))+(Math.pow(y, 2)));
       
        result=Math.sqrt(result);
        System.out.println("the result is:"+result);
        return  result;
    }


}
