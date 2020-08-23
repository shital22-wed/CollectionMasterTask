package com.collection_20Q;

import java.util.*;
import java.util.Map.Entry;

/*An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>  
Create another map in which course id is a key and list of student objects of that */

public class Student_Q10 {

	int sid;
	String name;
	public Student_Q10(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student_Q10 [sid=" + sid + ", name=" + name + "]";
	}
	public static void main(String[] args) {
HashMap<Student_Q10,ArrayList<Course_10>>hmap=new HashMap(); 
hmap.put(new Student_Q10(101,"shital"),new ArrayList<Course_10>(Arrays.asList(new Course_10(1,"java") )));
hmap.put(new Student_Q10(102,"nayan"),new ArrayList<Course_10>(Arrays.asList(new Course_10(2,"python"))));
hmap.put(new Student_Q10(103,"ranjeet"),new ArrayList<Course_10>(Arrays.asList(new Course_10(3,"java")) ));
hmap.put(new Student_Q10(104,"sahil"),new ArrayList<Course_10>(Arrays.asList(new Course_10(4,"SQL")) ));
		
		System.out.println(hmap);
		Set <Integer>hset=new  LinkedHashSet<Integer>();
		
		Set ss=hmap.entrySet();
	Iterator itr1=ss.iterator();
	while(itr1.hasNext())
	{
		Map.Entry ee=(Entry) itr1.next();
		ArrayList<Course_10>al=(ArrayList<Course_10>) ee.getValue();
		Iterator itral=al.iterator();
		while(itral.hasNext())
		{
			Course_10 c=(Course_10) itral.next();
			hset.add(c.cid);
		}
		
	}
		System.out.println(hset);
		HashMap<Integer,ArrayList<Student>>hmapIstud= new HashMap<Integer,ArrayList<Student>>();
		ArrayList<Student>finalal=new ArrayList<Student>();
		
			Iterator hsetitr=hset.iterator();
			while(hsetitr.hasNext())
			{
				int tno=(int) hsetitr.next();
				Set ss2=hmap.entrySet();
				Iterator itrhmap2=ss2.iterator();
	
				while(itrhmap2.hasNext())
				{
					Map.Entry mm=(Entry) itrhmap2.next();
					Student stud1=(Student)mm.getKey();
					ArrayList<Course_10>al=(ArrayList<Course_10>) mm.getValue();
					Iterator itral=al.iterator();
						while(itral.hasNext())
					{
						Course_10 c=(Course_10) itral.next();
						int ccid=c.cid;
					if(ccid==tno) {
						finalal.add(stud1);
					                   }	
					}
						System.out.println(finalal);

			}
				hmapIstud.put(tno,finalal);
				finalal.clear();
			
		}
			System.out.println(hmapIstud);
		
	}
	
}
