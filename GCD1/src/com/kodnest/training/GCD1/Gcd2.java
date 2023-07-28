package com.kodnest.training.GCD1;

public class Gcd2 {
int findGCd2(int m, int n)
{
	while(n!=0)
	{
		int rem=m%n;
		m=n;
		n=rem;
	}
	 int gcd=m;
	return gcd;
}
}
