package com.kodnest.training.GCD1;

import java.util.Scanner;

public class GcdApp2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two number");
		int m=scan.nextInt();
		int n= scan.nextInt();
		Gcd2 gcd=new Gcd2();
		int res=gcd.findGCd2(m,n);
		System.out.println("gcd of two numbers"+" "+ res);
		
	}

}
