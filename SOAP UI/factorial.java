package com.selenium;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int i, fact=1;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		n = sc.nextInt();
		for(i=1; i<=n;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
