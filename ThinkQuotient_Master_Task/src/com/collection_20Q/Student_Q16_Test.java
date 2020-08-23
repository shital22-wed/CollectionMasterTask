package com.collection_20Q;

import java.util.*;

public class Student_Q16_Test {
	/*Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
	Create a Set<Student> Student{sid,totalmarks}  from the list and sort the set
	in descending order of totalmarks*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// {tid,sid,int marks[]}
		ArrayList <Test>al=new ArrayList();
		al.add(new Test(101,1,new int[] {30,40}));
		
		al.add(new Test(102,2,new int [] {50,70}));
		al.add(new Test(103,3,new int [] {60,80}));
		al.add(new Test(104,4,new int [] {60,90}));
		
		//System.out.println(al);
		
		Set<Student_Q16> s=new HashSet();
		Iterator itr1=al.iterator();
		while(itr1.hasNext())
		{
			Test test=(Test)itr1.next();
			
			int ssid=test.sid;
			int [] arr=test.marks;
			int total=0;
			for(int i=0;i<arr.length;i++)
			{
				total=total+arr[i];
			}
			s.add(new Student_Q16(ssid,total));
		
	}
		System.out.println(s);
	ArrayList<Student_Q16>al1 =new ArrayList<Student_Q16>(s);
		Collections.sort(al1);
		
		for(int j=0;j<al1.size();j++) {
			System.out.println(al1.get(j));
		}
	}
}
