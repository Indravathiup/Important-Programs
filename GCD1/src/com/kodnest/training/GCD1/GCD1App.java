package com.kodnest.training.GCD1;

import java.util.Scanner;

public class GCD1App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res=GCD1.findGCD1(m, n);
		System.out.println(res);
		
	}

}
