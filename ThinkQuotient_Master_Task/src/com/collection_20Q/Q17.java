package com.collection_20Q;

import java.util.*;
import java.util.Map.Entry;


public class Q17 {
	/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
	map which has alphabets as keys and integers as values. If alphabet is
	repeated add integer to old value*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<String>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		

	 HashMap<String,Integer>hashmap1=new HashMap<String, Integer>();
		Iterator iterator1=al.iterator();
		while(iterator1.hasNext())
		{
			String string_1=(String)iterator1.next();
			String sarr[]=string_1.split("\\+");
			 String set_1=sarr[0];
			hashmap1.put(set_1,0);
		}
	
		Iterator itr=al.iterator();
		 
		while(itr.hasNext())
		{
		
			String string_1=(String)itr.next();
			String strArray[]=string_1.split("\\+");
			 String set_1=strArray[0];
			 Integer Number_0=Integer.parseInt(strArray[1]);
		
			Set set=hashmap1.entrySet();
			Iterator iterator2=set.iterator();
			while(iterator2.hasNext())
			{
				Map.Entry entry_1=(Entry)iterator2.next();
				String tmp=(String)entry_1.getKey();
				if(set_1.compareTo(tmp)==0)
				{
					int Number_1=(int)entry_1.getValue();
					Number_0=Number_1+Number_0;
					hashmap1.put(set_1,Number_0);
					Number_0=0;
				}			
		}
	
	}

		System.out.println(hashmap1);
}		
	}


