package com.collection_20Q;

import java.util.*;
import java.util.Map.Entry;

/*Create a Map<String,String> where key is adharno  and value is voted casted
to which party(eg. BJP,ShivSena,NCP,Congress,Other) .From this create new map 
such that KEY is party name and value is count of votes casted */
public class Party_vote_12 {
	public static void main(String[] args) {

		HashMap<String,String>hashmap1=new HashMap<String,String>();
		hashmap1.put("20253068306415", "ShivSena");
		hashmap1.put("20253068306414", "NCP");
		hashmap1.put("20253068306416", "BJP");
		hashmap1.put("20253068306418", "ShivSena");
		
		hashmap1.put("20253068306412", "congress");
		hashmap1.put("20253068306413", "NCP");
		hashmap1.put("20253068306438", "other");
		hashmap1.put("20253068306789", "ShivSena");
		HashMap<String,Integer>hashmap2=new HashMap<String,Integer>();
		Set set1=hashmap1.entrySet();
		Iterator iteratorr=set1.iterator();
		while(iteratorr.hasNext())
		{
			Map.Entry entry1 =  (Entry) iteratorr.next();		
			int count1=0;
			String sval=(String)  entry1.getValue();
			Set sset=hashmap1.entrySet();
			
			Iterator iterator1=sset.iterator();
			while(iterator1.hasNext())
			{
				Map.Entry entry2 = (Entry) iterator1.next();		
				String string1=(String)  entry2.getValue();
			if(string1.compareTo(sval)==0)
			{
				count1++;
			}
			}
			hashmap2.put(sval, count1);
		}
		System.out.println(hashmap2);
		}

}
