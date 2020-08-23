package com.Day2;

import java.util.Scanner;

public class Star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);;
	System.out.println("enter no");
	int r=sc.nextInt();
	for(int i=0;i<=r;i++)
	{
		for(int j=r;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<i*2-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}	}
}
