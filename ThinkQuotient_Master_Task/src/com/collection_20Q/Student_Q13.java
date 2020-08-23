package com.collection_20Q;

import java.util.*;

//Create two Set of students objects where insertion order in maintained. Now accept
//Studentid from user and check whether in both sets have student with given id at 
//same position
public class Student_Q13 {
	int sid;
	String name;

	public Student_Q13(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student_Q13 [sid=" + sid + ", name=" + name + "]";
	}


	public static void main(String[] args) {

		LinkedHashSet<Student_Q13> l1=new LinkedHashSet<Student_Q13>();
		LinkedHashSet<Student_Q13> l2=new LinkedHashSet<Student_Q13>();
		l1.add(new Student_Q13(101,"shital"));
		l1.add(new Student_Q13(102,"priyanka"));
		l1.add(new Student_Q13(103,"nayan"));
		l1.add(new Student_Q13(104,"ranjeet"));
		l1.add(new Student_Q13(105,"rasika"));

		
		l2.add(new Student_Q13(101,"shital"));
		l2.add(new Student_Q13(102,"kajal"));
		l2.add(new Student_Q13(103,"nayan"));
		l2.add(new Student_Q13(104,"priyanka"));
		l2.add(new Student_Q13(105,"swara"));
		System.out.println(l1);
		System.out.println(l2);
		Scanner scanner1=new Scanner(System.in);
		System.out.println("enter Sid");
		int number=scanner1.nextInt();
		
		Iterator iterator1=l1.iterator();
		Iterator iterator2=l2.iterator();
		int pos1=0,pos2=0;
		while(iterator1.hasNext()||iterator2.hasNext())
		{ 
			if(iterator1.hasNext())
			{
			Student_Q13 stud1=(Student_Q13) iterator1.next();
			pos1++;
			if(stud1.sid==number)
			{
				System.out.println("position in="+pos1);
			}
			}
			if(iterator2.hasNext())
			{
				pos2++;
				Student_Q13 stud2=(Student_Q13) iterator2.next();
			
			if(stud2.sid==number)
			{
				System.out.println("position in="+pos2);
			}
			}
		
		}
	}

}
