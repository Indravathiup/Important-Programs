package com.kodnest.training.Armstrong;

import java.util.Scanner;

public class ArmstrongApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int original=n;
		int count=0;
		Armstrong a=new Armstrong();
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		int res=a.findArmstrong(original,count);
		System.out.println(res);

		
	if(original==res)
	{
	System.out.println("armstrong number");	
	}
	else
	{
		System.out.println("not a armstrong number");
	}
	}
}
