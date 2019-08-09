package com.bridgelabz.Utility;

public class UtilityQuadratic {
	public static void quadratic(int first_number, int second_number,int third_number) 
	{
		float delta=second_number*second_number-4*first_number*third_number;
		double root1=(-second_number+Math.sqrt(delta))/(2*first_number);
		double root2=(-second_number-Math.sqrt(delta))/(2*first_number);
		System.out.println("Roots of Quadratic Equation is:"+root1+" and "+root2);
	}

}
