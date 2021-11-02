package com.selenium;


import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int i,a=0,flag=0;
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check whether its prime number or not:");
		n = sc.nextInt();
		a=n/2;
		if(n==0||n==1)
		{
			System.out.println("Given number is not a prime number "+n);
		}
		else {
			for(i=2;i<=a;i++)
			{
				if(n%i==0)
				{
					System.out.println("Given number is not a prime number "+n);
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Given number is a prime number "+n);
			}
		}
		
	}

}
