package com.collection_20Q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Q18 {
	/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
	method which accepts a String eg D in input and will return
	associated number value eg in this case 4 by looping the arraylist and
	finding matching pattern
    */	
static HashMap<String,Integer>hm=new HashMap<String, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		ArrayList<String>al=new ArrayList<String>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		
      Iterator iterator1=al.iterator();
		
		while(iterator1.hasNext())
		{
			String inutString=(String)iterator1.next();
			String StrArray[]=inutString.split("\\+");
			Integer n=Integer.parseInt(StrArray[1]);
			hm.put(StrArray[0], n);
			
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter char or String");
		String inutString=scanner.next();
		System.out.println(find(inutString));
	}
	public static int find(String inutString)
	{
		Set set1=hm.entrySet();
		Iterator iterator1=set1.iterator();
		while(iterator1.hasNext())
		{
			Map.Entry entry=(Entry)iterator1.next();
			String temp_String=(String)entry.getKey();
			if(temp_String.compareTo(inutString)==0)
			{
				return (int) entry.getValue();
			}
			
			
		}
		
		return 0;
	}
}