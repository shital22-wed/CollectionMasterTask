package com.collection_20Q;

import java.util.*;

/* Q4 
 A hashmap contains information about students and his marks. Student object is key 
and marks is value. Write a method to create 2 hashset which will have passed students of 
java course and passed students of angular course. Passing marks for java is 50 and passing 
marks for angular is 60. Student class is as follows. 
Student { intsid , String name, String course }
*/
public class Student_Q4 
{
//static HashMap<Student_Q4,Integer>hm=new HashMap<Student_Q4,Integer>();
	int sid;
	String name;
	String course;
	
	
public Student_Q4(int sid, String name, String course) {
		
		this.sid = sid;
		this.name = name;
		this.course = course;
	}


@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
}


/*public void pass_student() {
	HashSet<Student_Q4> hs=new HashSet<Student_Q4>();
	HashSet<Student_Q4> hs1=new HashSet<Student_Q4>();
	
	for(Map.Entry<Student_Q4,Integer> m:hm.entrySet())
	{
		if(m.getValue()>50 && m.getKey().course.equals("java"))
		{
			hs.add(m.getKey());
		}
		else if(m.getValue()>60 && m.getKey().course.equals("angular"))
			{
				hs1.add(m.getKey());
			}
		
		}
		System.out.println(hs);
		System.out.println(hs1);
	}
}*/
public static void main(String[] args) 
{
	HashMap<Student_Q4,Integer>hm=new HashMap<Student_Q4,Integer>();
		hm.put(new Student_Q4(1,"shital","java"),75);
		hm.put(new Student_Q4(2,"riya","angular"),55);
		hm.put(new Student_Q4(3,"nayan","angular"),65);
		hm.put(new Student_Q4(4,"priyanka","java"),65);
		
		
		HashSet<Student_Q4> hs=new HashSet<Student_Q4>();
		HashSet<Student_Q4> hs1=new HashSet<Student_Q4>();
		
		for(Map.Entry<Student_Q4,Integer> m:hm.entrySet())
		{
			if(m.getValue()>50 && m.getKey().course.equals("java"))
			{
				hs.add(m.getKey());
			}
			else if(m.getValue()>60 && m.getKey().course.equals("angular"))
			{
				hs1.add(m.getKey());
			}
		
		}
		System.out.println(hs);
		System.out.println(hs1);

	}

}
