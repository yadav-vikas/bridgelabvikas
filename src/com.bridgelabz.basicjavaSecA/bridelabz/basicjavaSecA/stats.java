/******************************************************************************  
 *  Purpose: To get the max,min and avg of all numbers
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridelabz.basicjavaSecA;

import com.bridgelabz.Utility.Utilitystats;

public class stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double first_number=Math.random()*1;
        System.out.println("first number:"+first_number);
        double second_number=Math.random()*1;
        System.out.println("second number:"+second_number);
        double third_number=Math.random()*1;
        System.out.println("third number:"+third_number);
        double fourth_number=Math.random()*1;
        System.out.println("fourth number:"+fourth_number);
        double fifth_number=Math.random()*1;
        System.out.println("fifth number:"+fifth_number);
        Utilitystats.Stats(first_number, second_number, third_number, fourth_number, fifth_number);
	}

}
