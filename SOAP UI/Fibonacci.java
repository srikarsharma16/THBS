package com.selenium;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i;
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to get fibonaci of given count: ");
		count = sc.nextInt();
		
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
