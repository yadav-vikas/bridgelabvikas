/******************************************************************************  
 *  Purpose: perform checking  between march-20 to june-20
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class UtilitySpringSeason {
	public static void springSeason(int date, int month){
		
switch(month) {
case 3: if(date>=20) {System.out.println ("true"); break;} 
//this is a spring season
case 4: if(date>=30) {System.out.println ("true"); break;} 
//this is a spring season
case 5: if(date>=31) {System.out.println ("true"); break;} 
//this is a spring season
case 6: if(date<=20) {System.out.println ("true"); break;} 
//this is a spring season
default: System.out.println ("false");   
  }		
 }
}

