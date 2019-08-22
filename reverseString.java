package com.bridgelabz.basicjavasectionB;

public class ReverseString {
	  public static void main(String[] args) {
	String str="Dream big";
String reversedstr = "";   
  
   for(int i=str.length()-1; i>=0; i--) {
	   reversedstr=reversedstr+str.charAt(i);
   }
       
    	   System.out.println("the reverse is="+reversedstr);
       
	  
	  }
}
