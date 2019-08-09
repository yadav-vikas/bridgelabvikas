/******************************************************************************  
 *  Purpose: To determine the Eucleadian distance
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridelabz.basicjavaSecA;
import java.util.Scanner;

import com.bridgelabz.Utility.UtilityDistance;

public class Distance {
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the x coordinate:");
	    int x=scanner.nextInt();
	    System.out.println("enter the y coordinate:");
	    int y=scanner.nextInt();
	    scanner.close();
	    UtilityDistance.calculateDistance(x, y);
	
	}
    }



