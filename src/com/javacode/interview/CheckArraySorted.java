package com.javacode.interview;

public class CheckArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,2,4,5,7,8,9,10};
		
		String s=ArraySortcheck(a);
		System.out.println(s);

	}
	
	public static String ArraySortcheck(int[] a)
	{
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>=a[i-1])
			{
			}
			else
			{
				return "it is not sorted";
			}
		}
		
		return "it is sorted";
	}

}
