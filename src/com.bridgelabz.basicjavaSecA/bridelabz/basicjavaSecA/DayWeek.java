package com.bridelabz.basicjavaSecA;
import java.util.Scanner;
public class DayWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter the info \n enter day=");
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        if ( day>31) {System.out.println("false statement");}
        System.out.println("enter month=");
        int month=scanner.nextInt();
        if (  month>12) {System.out.println("false statement");}
        System.out.println("enter year=");
       int year=scanner.nextInt();
        scanner.close();
	
       //int year;int month;int day;
         int yo=year-(14-month)/12;
        int x=yo+yo/4-yo/100+yo/100;
         int mo=month+12*((14-month)/12)-2;
         int d=(day+x+(31*mo/12))%7;
	     System.out.println("the day from the gregorian calendor is="+d);
	}

}
