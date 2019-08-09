
/******************************************************************************  
 *  Purpose: obtaining the quadratic expression
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridelabz.basicjavaSecA;
import java.util.Scanner;

import com.bridgelabz.Utility.UtilityQuadratic;

public class Quadratic {
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Co-ordinates of quadratic equation");
System.out.println("enter first number:");
int first_number=scanner.nextInt();
System.out.println("enter second number:");
int second_number=scanner.nextInt();
System.out.println("enter third number:");
int third_number=scanner.nextInt();

UtilityQuadratic.quadratic( first_number, second_number, third_number);
scanner.close();
  }
}
