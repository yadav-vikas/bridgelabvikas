package com.bridelabz.basicjavaSecA;
import java.util.Scanner;
public class Flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter the times of toss");
     Scanner scanner=new Scanner(System.in);
     int n=scanner.nextInt();
     int toss;
     int H=0; int T=0;
    double count=0.0;
    for(int i=1; i<=n;i++) {
      count=Math.random(); 
    if(count<=0.5) { H++; }  
    else { T++; }
    }
    //System.out.println("count="+count);
	 
    System.out.println("head count="+H);
	System.out.println("tail count"+T);
	double Percentage_head=(H/n)*100;
	System.out.println("percentage of head is="+Percentage_head);
	double Percentage_tail=100-Percentage_head;
	System.out.println("percentage of tail"+Percentage_tail);
	}

}
