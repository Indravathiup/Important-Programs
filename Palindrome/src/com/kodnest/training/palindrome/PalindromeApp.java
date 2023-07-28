package com.kodnest.training.palindrome;

import java.util.Scanner;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		Palindrome p=new Palindrome();
		int res=p.reversenumber(n);
		System.out.println("reverse the number"+res);
		if(n==res)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
