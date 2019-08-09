/******************************************************************************  
 *  Purpose: To calculate the effective temprature
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridelabz.basicjavaSecA;
import java.util.Scanner;
import com.bridgelabz.Utility.UtilityWindchill;
public class WindChil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the temperature(in fahrenheit):");
        int temp=scanner.nextInt();
        System.out.println(" enter the speed of wind(in miles per hour):");
        int  velocity=scanner.nextInt();
        UtilityWindchill.windchill(temp,velocity);
        scanner.close();
	}

}
