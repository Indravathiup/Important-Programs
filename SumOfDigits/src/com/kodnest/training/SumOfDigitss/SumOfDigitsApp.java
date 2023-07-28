package com.kodnest.training.SumOfDigitss;

import java.util.Scanner;

public class SumOfDigitsApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number to find sum of digits");
		int n=scan.nextInt();
		SumOfDigits sd=new SumOfDigits();
		int res=sd.findSumOfDigits(n);
		System.out.println(res);
		
	}

}
