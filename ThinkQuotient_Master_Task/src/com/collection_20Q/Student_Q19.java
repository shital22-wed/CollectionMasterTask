package com.collection_20Q;

import java.util.*;

/*There is a HashSet which has student objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)*/
public class Student_Q19 {

	int sid;
	String name;
	String qualification;
	int yearOfPassing;
	static boolean placed;
	
	
		
	public Student_Q19(int sid, String name, String qualification, int yearOfPassing, boolean placed) {
		super();
		this.sid = sid;
		this.name = name;
		this.qualification = qualification;
		this.yearOfPassing = yearOfPassing;
		this.placed = placed;
	}

		

	@Override
	public String toString() {
		return "Student_Q19 [sid=" + sid + ", name=" + name + ", qualification=" + qualification + ", yearOfPassing="
				+ yearOfPassing + ", placed=" + placed + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student_Q19>hs=new HashSet<Student_Q19>();
		hs.add(new Student_Q19(1,"shital","BCA",2019,true));
		hs.add(new Student_Q19(2,"Annu","MCA",2017,false));
		hs.add(new Student_Q19(3,"Nayan","BE",2018,true));
		hs.add(new Student_Q19(4,"rasika","ETC",2019,true));
		hs.add(new Student_Q19(5,"siya","BCA",2020,false));
		
		
		ArrayList<Student_Q19>placedStudents=new ArrayList<Student_Q19>();
		ArrayList<Student_Q19>unplacedStudents=new ArrayList<Student_Q19>();
		
		Iterator iterator1=hs.iterator();
		while(iterator1.hasNext())
		{
			Student_Q19 stud1=(Student_Q19)iterator1.next();
			if(stud1.placed)
			{
				placedStudents.add(stud1);
			}
			else
			{
				unplacedStudents.add(stud1);
			}
			
		}
		
	
	System.out.println("placed Student");
	System.out.println(placedStudents);
	
	System.out.println("unplaced Student");
	System.out.println(unplacedStudents);
	
	}
	}
	

