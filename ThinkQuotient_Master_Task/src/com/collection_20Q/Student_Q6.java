package com.collection_20Q;

import java.util.*;

/*WAP wherein Set<Student>containing { introllno , String name , intmarks } 
are changed to Map where key will be marks and value will be List of RollNos 
where all those students who have same marks are together.*/
public class Student_Q6 {
      int rollno;
      String name;
      int marks;
      	
	public Student_Q6(int rollno, String name, int marks) {
	
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student_Q6 [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student_Q6>s=new HashSet<Student_Q6>();
		s.add(new Student_Q6(1,"shital",85));
		s.add(new Student_Q6(2,"nayan",75));
		s.add(new Student_Q6(3,"priyanka",85));
		s.add(new Student_Q6(4,"sayali",75));
		s.add(new Student_Q6(5,"riya",65));
		System.out.println(s);
		
HashMap<Integer,ArrayList<Integer>>hm=new HashMap<Integer,ArrayList<Integer>>();
		
		
		Iterator iterator1=s.iterator();
		while(iterator1.hasNext())
		{
			Student_Q6 stud1=(Student_Q6) iterator1.next();
	
			Iterator iterator2=s.iterator();
			ArrayList<Integer>arraylist1=new ArrayList<Integer>();
			while(iterator2.hasNext())
			{
				
				Student_Q6 stud2=(Student_Q6) iterator2.next();
				if(stud1.marks==stud2.marks)
				{
				arraylist1.add(stud2.rollno);	
				}
			}
			hm.put(stud1.marks,arraylist1);
			
		}
		
System.out.println(hm);
		
		
	}

}
