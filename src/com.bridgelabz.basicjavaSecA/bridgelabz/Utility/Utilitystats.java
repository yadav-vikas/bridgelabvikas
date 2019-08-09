/******************************************************************************  
 *  Purpose: method to get avg ,max and min number 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class Utilitystats {
	public static void Stats(double first_number,double second_number, double third_number,double fourth_number,double fifth_number) {
		double avg=(first_number+second_number+third_number+fourth_number+fifth_number)/5;
        System.out.println("the avg of all is:::"+avg);
         double array1[]= {first_number,second_number,third_number,fourth_number,fifth_number};
       double max=array1[0];
       double min=array1[0];
         for(int i=0;i<=array1.length;i++) {
         if(array1[i]>max) {max=array1[i]; } break;}
         for(int i=0;i<=array1.length;i++) {
         if(array1[i]<min) { min=array1[i];} break;}
    System.out.println("the maximum value is:"+max);
    System.out.println("the minimum value is:"+min);
         
        }
      }
	


