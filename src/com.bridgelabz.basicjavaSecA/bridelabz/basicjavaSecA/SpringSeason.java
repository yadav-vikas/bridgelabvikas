/******************************************************************************  
 *  Purpose: checking the dates between march-20 to june-20
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridelabz.basicjavaSecA;
import java.util.Scanner;

import com.bridgelabz.Utility.UtilitySpringSeason;
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date,month;
      System.out.println("enter the month as int:");
      Scanner scanner=new Scanner(System.in);
      month=scanner.nextInt();
      System.out.println("enter the date as int:");
      date=scanner.nextInt();
      UtilitySpringSeason springSeason= new UtilitySpringSeason();
      UtilitySpringSeason.springSeason(date, month);
	  scanner.close();
	}
}
