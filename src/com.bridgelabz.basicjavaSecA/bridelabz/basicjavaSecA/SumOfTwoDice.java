/******************************************************************************  
 *  Purpose: To get the sum of dice rolled
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridelabz.basicjavaSecA;

import com.bridgelabz.Utility.UtilityDice;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a  = Math.random()*6;
		double b  = Math.random()*6;
        UtilityDice.Dice(a, b);
	}

}
