package com.collection_20Q;

import java.util.*;

/*Given two LinkedList, we need to combine two LinkedList  in such a way that 
the combined aList has alternate elements of both. If one list has extra element, 
then these elements are appended at the end of the combined list.
Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}
*/
public class Q14 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(4);
		list1.push(5);
		list1.push(6);
	      
  LinkedList list2 = new LinkedList();    
	   list2.push(11);
		list2.push(22);
		list2.push(33);
		list2.push(44);
LinkedList joind = new LinkedList();  
		
		Iterator itr1=list1.iterator();
		Iterator itr2=list2.iterator();
		while(itr1.hasNext()||itr2.hasNext())
		{
			if(itr1.hasNext())
				joind.add((Integer) itr1.next());
			if(itr2.hasNext())
				joind.add((Integer) itr2.next());
			
			
		}
		System.out.println(joind);
	
	}

}
