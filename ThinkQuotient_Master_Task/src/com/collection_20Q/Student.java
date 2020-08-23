package com.collection_20Q;

import java.util.ArrayList;

/*Consider an array of Student Student (int sid, String sname, List<String> hobby)
From this list create a Map<String,List<Student>> where key is hobby name
and list of student objects having same hobby. Also find out most 
common hobby among students*/

public class Student 
{

	int sid;
	String name;
	ArrayList<String>hobby;
	
	public Student(int sid, String name, ArrayList<String> hobby) {
	
		this.sid = sid;
		this.name = name;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", hobby=" + hobby + "]";
	}
	
	
}
