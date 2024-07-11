package com.javacode.interview;

public class RemoveDuplicates {

	public static void main(String[] args) throws Exception
	{
		
		int[] a= {1,1,3,2,2,4,5,6,4};
		
		int i=0;
		
		for(int j=1;j<a.length;j++)
		{
			if(a[i]!=a[j])
			{
				a[i+1]=a[j];
				i++;
			}
		}
	System.out.println("number of unique elements is " +i);
	}
	
}
