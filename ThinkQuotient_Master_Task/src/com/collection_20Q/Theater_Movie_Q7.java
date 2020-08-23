package com.collection_20Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Theater_Movie_Q7 {
	/*Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
	same rating then according to Theatrename (use Anonymous class for sorting) 
	Theatre (Theatreid,Theatrename,location,Movie)
	Movie (Movieid,Moviename,Rating)*/
	public static void main(String[] args) {
		
		ArrayList<Theater>al=new ArrayList<Theater>();
	
			al.add(new Theater(1,"city pride","kothrud",new Movie(11,"Avengers",4)));
			al.add(new Theater(2,"E Square","Shivaji nager",new Movie(12,"Dil Bechara",5)));
			al.add(new Theater(3,"PVR","Sinhgad Road",new Movie(13,"Jocker",3)));
		
		
			System.out.println(al);
		
			
			Collections.sort(al, new Comparator<Theater>()
					{
				
                   @Override
						public int compare(Theater o1, Theater o2) {
							if(o1.m.rating==o2.m.rating)
						  return o1.m.mname.compareTo(o2.m.mname);
							else
							{
								return o2.m.rating-o1.m.rating;
							}
						}
				
					});
			
	System.out.println("=======After Sorting======");		
			Iterator itr1=al.iterator();
			while(itr1.hasNext())
			{
			System.out.println(itr1.next());
			}

	}

}
