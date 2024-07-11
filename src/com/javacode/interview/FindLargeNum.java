package com.javacode.interview;

import java.util.Arrays;

public class FindLargeNum {

	public static void main(String[] args) throws Exception {
		int[] a = { 1, 2, 3, 4, 7, 5, 2, 1 };
		System.out.println("input array is " + Arrays.toString(a));
		System.out.println("first method using streams");
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Max value using stream is  Array.stream(a).max().getAsInt() " + max);
		System.out.println("second method by sorting  streams");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("max value is " + a[a.length-1]);
		
		int large=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>large)
				large=a[i];
		}
		System.out.println("large number with out sorting is "  + large);
	}

}
