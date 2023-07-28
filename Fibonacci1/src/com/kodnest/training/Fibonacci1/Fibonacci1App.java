package com.kodnest.training.Fibonacci1;

import java.util.Scanner;

public class Fibonacci1App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		Fibonacci1 fibonacci1=new Fibonacci1();
		fibonacci1.Fibonacciseries(n);
		
	}

}
