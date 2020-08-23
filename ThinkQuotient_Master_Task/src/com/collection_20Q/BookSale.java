package com.collection_20Q;

import java.util.*;

/*There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given array. If book is present in map calculate its business amount 
(price* copiessold) and add to existing amount in map. If book is not present add
 its entry in map.*/
public class BookSale {
	 Book b; 
	int copiesSold;
    
   public BookSale(Book b,int copiesSold) {
		this.b = b;
		this.copiesSold = copiesSold;
		
	}


	@Override
	public String toString() {
		return "BookSale [copiesSold=" + copiesSold + "]";
	}


	
	public static void main(String[] args) {
	
	ArrayList<BookSale>al=new ArrayList<BookSale>();
	  al.add(new BookSale(new Book(1,"E.Balgurusamy",5.00f),3));
	  al.add(new BookSale(new Book(2,"Yashwant Kanetkar",3.00f),4));
	  al.add(new BookSale(new Book(3,"James Gosling",2.00f),6));

	  HashMap<Integer,Float>hm=new HashMap();
	  hm.put(1,10f);
	  hm.put(2,20f);
	  hm.put(3,5f);
	 // System.out.println(hm);
	  
	  int key;
	  Iterator itr=al.iterator();
	  while(itr.hasNext())
	  {
		  BookSale b1=(BookSale)itr.next();
		  key=b1.b.bid;
		  
		  if(hm.containsKey(key))
		  {
			  hm.put(key, hm.get(key)+b1.b.price*b1.copiesSold);
		  }
		  else
		  {
			  hm.put(b1.b.bid, b1.b.price*b1.copiesSold);
		  }
	  }
	  System.out.println(hm);
	}

}
