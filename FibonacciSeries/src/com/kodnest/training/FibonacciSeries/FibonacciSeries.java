package com.kodnest.training.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to find fibonacci series");
		int n= scan.nextInt();
		int fib1=0;
		int fib2=1;
		if(n==1)
		{
			System.out.println(fib1);
		}
		else if(n==2)
		{
			System.out.println(fib1 +" "+fib2);
		}
		else
		{
			System.out.print(fib1+ " "+fib2);
		for(int i=3;i<=n;i++)
		{
			int nextnumber=fib1+fib2;
			System.out.print(" "  +nextnumber + " ");
			fib1=fib2;
			fib2=nextnumber;
		}
	}
}
}
		
