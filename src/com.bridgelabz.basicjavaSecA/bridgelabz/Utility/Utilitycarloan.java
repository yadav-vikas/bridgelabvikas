package com.bridgelabz.Utility;

public class Utilitycarloan {
	public static void loan(double P,double R,double Y) {
		double n=12*Y;
		double r=R/(12*100);
		double payment= (P*r)/1-(Math.pow((1+r),(-n)));
        System.out.println("the  payment=="+payment);	
	}
	

}
