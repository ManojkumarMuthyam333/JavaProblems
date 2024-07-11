package com.javacode.interview;

import java.util.Arrays;

public class FindSecndLargestNum {

	public static void main(String[] args)throws Exception
	{
		
		//Finding the second large number from array
		int[] a= {1,2,2,7,5,3,8};
		int length=a.length;
		System.out.println("length is " + length);
		System.out.println("First and easy method sort the array and get the second large");
		Arrays.sort(a);
		
		  for(int i=length-2; i>=0;i--) { 
			  if(a[i]!=a[length-1]) {
		      System.out.println("second largest is "+ a[i]);
		      break;
		    } 
		  }
		 
		  int[] b= {1,2,2,7,5,3,8};
		  System.out.println("second way to identy the second largest Number");
		  int firstlarge=b[0];
		  int secondlarge=b[1];
		  for(int i=0;i<b.length;i++)
		  {
			  if(a[i]>firstlarge)
			  {
			   secondlarge=firstlarge;
			   firstlarge=a[i];
			   }
			  else if (a[i]>secondlarge)
			  {
				  secondlarge=a[i];
		       }
			  
		  }
		  System.out.println("first large is " + firstlarge);
		  System.out.println("second large is " + secondlarge);
		
	}
}
