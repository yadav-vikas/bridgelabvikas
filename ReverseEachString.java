package com.bridgelabz.basicjavasectionB;

public class reverseOfeachString {

	public static void main(String[] args) {
		String  str="hello world";
	    String 	reversestr="";
	    String[] change=str.split(" ");
        
	    for(int i=0; i<change.length; i++) {
	    	int temp=change[i].length();
	    	for(int j=temp-1; j>=0; j--) {
	    	
	    			reversestr=reversestr+change[i].charAt(j);
	    	}
	    	reversestr=reversestr+" ";
	    }
	    System.out.println("string="+reversestr+" ");
	}

}
