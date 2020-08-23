package com.collection_20Q;

import java.util.*;

public class Student_Hobbies {

	/*Consider an array of Student Student (int sid, String sname, List<String> hobby)
	From this list create a Map<String,List<Student>> where key is hobby name
	and list of student objects having same hobby. Also find out most 
	common hobby among students*/

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		ArrayList <Student>s=new ArrayList();
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter id: ");
			int sid=sc.nextInt();
			System.out.println("Enter name: ");
			String name=sc.next();
			
		ArrayList<String>hobby=new ArrayList();
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter your hobbies: ");
				String h=sc.next();
				hobby.add(h);
			}
		s.add(new Student(sid,name,hobby));		
					
		}
	HashMap<String,ArrayList<Student>> hm=new HashMap();
	   for(int i=0;i<s.size();i++)
	   {
		   Student ss= s.get(i);
		   for(int j=0;j<2;j++)
		   {
			   String s3=ss.hobby.get(j);
	     ArrayList<Student>al2=new ArrayList();
	         for(int k=0;k<s.size();k++)
	         {
	        	 Student sss=s.get(i);
	        	 if(sss.equals(s3))
	        	 {
	        		 al2.add(sss);
	        	 }
	         }
	         hm.put(s3, al2);
		   }
		   
	   }
	System.out.println(hm);
	int max=0;
	String maxhobby=" ";
	for(Map.Entry m:hm.entrySet())
	{
		ArrayList<Student>al2=new ArrayList();	
		if(al2.size()>max)
		{
			max=al2.size();
			maxhobby=(String) m.getKey();
			
		}
	}
System.out.println(maxhobby);

	


}
}
