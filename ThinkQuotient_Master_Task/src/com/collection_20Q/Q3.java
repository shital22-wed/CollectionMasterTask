package com.collection_20Q;

import java.util.Scanner;

/*
Given a linked list of integers , find out number of missing elements in linked list.
E.g. list contains { 2 , 3, 7} missing elements are 4, 5, 6. If list
contains { 3 , 13 , 7 , 2 } . missing elements are 4,5,6,8,9,10,11,12 and so on.
Write a logic which will work for any list.
*/
public class Q3 {

	public static void main(String[] args) {
		//int[] input = { 4,5,6,8,9,6,3,2,5 };
		int[] input = { 1, 2, 2, 3, 5, 5, 7, 9, 9, 9};
	int[] a = new int[input.length]; 

		for (int i : input) 
		{ 
			a[i] = 1; 
		}  
		System.out.println("missing numbers in given array"); 
		for (int i = 1; i < a.length; i++)
		 { 
			if (a[i] == 0) 
			{
				System.out.println(i); 
		      } 
		}



	}
}