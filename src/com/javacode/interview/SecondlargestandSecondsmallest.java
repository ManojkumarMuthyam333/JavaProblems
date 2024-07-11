package com.javacode.interview;

public class SecondlargestandSecondsmallest {
	
	public static void main(String[] args) throws Exception
	{
		int[] a= {1,7,5,8,4,3,2,8,10};
		int n=a.length;
		int slargest=secondlargest(a,n);
		int ssmallest=secondsmallest(a,n);		
		
		System.out.println("Second large and second small is  " + slargest  + "  "  + ssmallest);
	}
	
	public static int secondlargest(int[] a, int n)
	{
		int flarge=a[0];
		int slarge=a[1];
		for(int i=0;i<n;i++)
		{
			if(a[i]>flarge)
			{
				slarge=flarge;
				flarge=a[i];
			}
			else if(a[i]>slarge)
				slarge=a[i];
		}
		return slarge;
	}

	public static int secondsmallest(int[] a, int n)
	{
		int fsmall=a[0];
		int ssmall=100;
		for(int i=0;i<n;i++)
		{
			if(a[i]<fsmall)
			{
				ssmall=fsmall;
				fsmall=a[i];
			}
			else if(a[i]!=fsmall&& a[i]<ssmall)
			{
				ssmall=a[i];
			}
		}
		return ssmall;
	}

}
