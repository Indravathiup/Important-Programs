package com.kodnest.training.SumOfSeries;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		calculateSumOfSeries(n);
		
	}
	public static void calculateSumOfSeries(int n)
	{
		double num=0.0;
		double i;
		for(i=1;i<=n;i++)
		{
			num=1/i+num;
			
		}
		System.out.println("sum of series"+num);
	}

}
