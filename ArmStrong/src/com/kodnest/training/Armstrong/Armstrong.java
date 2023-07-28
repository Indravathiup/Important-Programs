package com.kodnest.training.Armstrong;

public class Armstrong {
	public int findArmstrong(int n,int count)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			//sum=sum+rem*rem*rem;
			int res=(int)Math.pow(rem,count);
			sum=sum+res;
			n=n/10;
		}
		return sum;
	}

}
