package com.bridelabz.basicjavaSecA;
import java.util.Scanner;
public class Trig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter the angle(in degree's)=");
        Scanner scanner=new Scanner(System.in);
        double angle=scanner.nextDouble();
        double radian=Math.toDegrees(angle);
        double sin=Math.sin(angle);
        double cos=Math.cos(angle);
         System.out.println("angle in radians is="+radian);
         System.out.println("sin is=="+sin);
         
         System.out.println("cos is=="+cos);
         
	}

}
