package com.collection_20Q;

import java.util.*;
/*Assume that there is already  arraylist of members of Society
Member{memberid,Wing_flatNo,name}.  Write a program which creates Map where 
key is Wing_FlatNo and value is List of all  names of family members */
public class SocietyMember_Q15 {

	int membarid;
	String Wing_Fno;
	String name;
	public SocietyMember_Q15(int membarid, String wing_Fno, String name) {
		super();
		this.membarid = membarid;
		Wing_Fno = wing_Fno;
		this.name = name;
	}
	public static void main(String[] args) {
ArrayList<SocietyMember_Q15>array_List=new ArrayList<SocietyMember_Q15>();
array_List.add(new SocietyMember_Q15(101,"A201","shital") );
array_List.add(new SocietyMember_Q15(102,"A201","priyanka") );
array_List.add(new SocietyMember_Q15(103,"A301","nayan") );
array_List.add(new SocietyMember_Q15(104,"A401","gul") );
array_List.add(new SocietyMember_Q15(105,"A301","rasika") );
array_List.add(new SocietyMember_Q15(106,"A201","Ram Charan") );
		
HashMap<String,ArrayList>hashMap_1= new HashMap<String,ArrayList>();
Iterator iterator1=array_List.iterator();

	while(iterator1.hasNext())
	{
		SocietyMember_Q15 society_member=(SocietyMember_Q15)iterator1.next();
		String Wing=society_member.Wing_Fno;
		
		Iterator iterator2=array_List.iterator();
		ArrayList<String> array_List2=new ArrayList<String>();
      while(iterator2.hasNext())
			
		{
			SocietyMember_Q15 society_member2=(SocietyMember_Q15)iterator2.next();
			if(Wing.compareTo(society_member2.Wing_Fno)==0)
			{
				array_List2.add(society_member2.name);
			}
			
		}
		hashMap_1.put(Wing,array_List2);
	}

	System.out.println(hashMap_1);
	}

}


