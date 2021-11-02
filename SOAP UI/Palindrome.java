package com.selenium;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n,remainder,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check given number is palindrome:");
		n=sc.nextInt();
		
		temp=n;
		while(n>0)
		{
			remainder=n%10;
			sum=(sum*10)+remainder;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Given number is a palindrome "+temp);	
		}
		else
		{
			System.out.println("Given number is not a palindrome  "+temp);
		}
		
	}

}
