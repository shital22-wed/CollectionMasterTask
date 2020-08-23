package com.collection_20Q;

import java.util.ArrayList;

public class Employee {

	String name;
	int eid;
	int mgrid;
	public Employee(String name, int eid, int mgrid) {
		super();
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}
	public static void main(String[] args) 
	{
ArrayList<Employee>al=new ArrayList<Employee>();
al.add(new Employee("shital",11,15));
al.add(new Employee("kajal",12,13));
al.add(new Employee("sayali",14,12));
al.add(new Employee("nayan",13,11));
al.add(new Employee("sayu",15,14));

	
for(int i=0;i<al.size();i++)
{
	Employee e1=al.get(i);
	int empID=e1.eid;
	int mngrId=e1.mgrid;
	 for(int j=0;j<al.size();j++)
	 {
		 Employee e2=al.get(j);
		 if(mngrId==e2.eid)
		 {
			 System.out.println(e1.name+" "+e2.name);
		 }
	 }
}



	
	
	}
}
