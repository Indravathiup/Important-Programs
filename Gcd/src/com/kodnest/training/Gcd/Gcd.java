package com.kodnest.training.Gcd;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		Gcd(m,n);
	}
		public static void Gcd(int m,int n)
		{
		while(n!=0)
		{
			int rem=m%n;
			m=n;
			n=rem;	
		}
		int GCD=m;
		System.out.println("GCD of two numbers is" +" " +GCD);
		
	}

}
