package com.collection_20Q;

import java.util.Arrays;

/*Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
Create a Set<Student> Student{sid,totalmarks}  from the list and sort the set
in descending order of totalmarks*/
public class Test {
	int tid;
	int sid;
	int marks[];
	public Test(int tid, int sid, int[] marks) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	

}
