/******************************************************************************  
 *  Purpose: To determine whether the year is leap year or not
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridelabz.basicjavaSecA;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
     System.out.println("enter the year:");
     Scanner scanner= new Scanner(System.in);
     year=scanner.nextInt();
  //  Utility leapyear =new Utility();
     Utility.leapyear(year);
    scanner.close();  
}
}