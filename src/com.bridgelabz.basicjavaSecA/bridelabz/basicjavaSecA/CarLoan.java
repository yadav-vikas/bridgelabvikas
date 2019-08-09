package com.bridelabz.basicjavaSecA;
import com.bridgelabz.Utility.Utilitycarloan;
import java.util.Scanner;
public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter the following info: \n enter P=");
      Scanner scanner=new Scanner(System.in);
      double P=scanner.nextDouble();
      System.out.println("enter Y=");
      double Y=scanner.nextDouble();
      System.out.println("enter R=");
      double R=scanner.nextDouble();
      scanner.close();
      Utilitycarloan.loan(P,R,Y);
	}

}
