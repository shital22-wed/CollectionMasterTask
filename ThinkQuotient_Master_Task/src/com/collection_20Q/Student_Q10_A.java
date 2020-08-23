package com.collection_20Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Student_Q10_A {
	int sid;
	String name;
	public Student_Q10_A(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student_Q10_A [sid=" + sid + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		HashMap<Student_Q10_A,ArrayList<Course_10>>hmap1=new HashMap(); 
		hmap1.put(new Student_Q10_A(101,"shital"),new ArrayList<Course_10>(Arrays.asList(new Course_10(1,"java") )));
		hmap1.put(new Student_Q10_A(102,"nayan"),new ArrayList<Course_10>(Arrays.asList(new Course_10(2,"python"))));
		hmap1.put(new Student_Q10_A(103,"ranjeet"),new ArrayList<Course_10>(Arrays.asList(new Course_10(3,"java")) ));
		hmap1.put(new Student_Q10_A(104,"sahil"),new ArrayList<Course_10>(Arrays.asList(new Course_10(4,"SQL")) ));
				
				System.out.println(hmap1);
				ArrayList<Student>finalArrayList=new ArrayList<Student>();
				Set <Integer>hashset1=new  LinkedHashSet<Integer>();
				HashMap<Integer,ArrayList<Student>>hmapIstud= new HashMap<Integer,ArrayList<Student>>();
				Set set2=hmap1.entrySet();
				Iterator itr1=set2.iterator();
				while(itr1.hasNext())
				{
					Map.Entry entry= (Entry) itr1.next();
					ArrayList<Course_10>al=(ArrayList<Course_10>) entry.getValue();
					Iterator itral=al.iterator();
					while(itral.hasNext())
					{
						Course_10 cust=(Course_10) itral.next();
						hashset1.add(cust.cid);
					}
					
				}
					System.out.println(hashset1);
					
					ArrayList<Integer>arrayList1=new ArrayList<>(hashset1);
					for(int i=0;i<hashset1.size();i++)
					{
						int cust_id=arrayList1.get(i);
						Set set1=hmap1.entrySet();
						Iterator itrhmap2=set1.iterator();
						while (itrhmap2.hasNext()) {

							Map.Entry entry2=(Entry) itrhmap2.next();
							Student stud1=(Student)entry2.getKey();
							ArrayList<Course_10>al=(ArrayList<Course_10
									
									>) entry2.getValue();

				finalArrayList.clear();			
							for(int number=0;number<al.size();number++)
			{
				if(cust_id==al.get(number).cid)
				{
					finalArrayList.add(stud1);
				}
			}
			hmapIstud.put(cust_id, finalArrayList);
						}

					}
					System.out.println(hmapIstud);

}
}
