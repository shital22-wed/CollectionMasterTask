package com.collection_20Q;

import java.util.Comparator;

/*Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
Create a Set<Student> Student{sid,totalmarks}  from the list and sort the set
in descending order of totalmarks*/
public class Student_Q16 implements Comparable{

	int sid;
	int totalmarks;
	
	public Student_Q16(int sid, int totalmarks) {
        this.sid = sid;
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student_Q16 [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student_Q16 s=(Student_Q16) o;
		return s.totalmarks-this.totalmarks;
	}


	
	
}
