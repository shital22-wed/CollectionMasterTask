package com.collection_20Q;

import java.util.*;

/*Hotel serves delicious Menus to its Customers. It maintains list of Orders
given on daily basis. Order list is maintained as ArrayList<Order>. Each Order 
contains orderid, MenuName, price,  qtyOrdered. (Price of same Menu may vary 
according hours).From ArrayLsit of Orders create a map <String,Float> where Menu 
Name is key and total sale in a day for theMenu as Value. (sale for the menu is
Price*qty ordered).Eg. Order List for a day is :
[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10),  
 (92,”Hakka Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8),      
 (101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440},
{“Grilled Sandwitch”,860}}*/
public class Order_11 {
	int ordid;
	String menuName;
	float price;
	int QtyOrd;
	
	public Order_11(int ordid, String menuName, float price, int qtyOrd) {
		super();
		this.ordid = ordid;
		this.menuName = menuName;
		this.price = price;
		QtyOrd = qtyOrd;
	}

	public static void main(String[] args) {
HashMap <String ,Float>hashmap1=new HashMap <String ,Float>();

	ArrayList<Order_11>arraylist=new ArrayList<Order_11>();
	arraylist.add(new Order_11(101,"Paav-Bhaji",120.00f,5));
	arraylist.add(new Order_11(102,"Grilled-Sandwitch",72.00f,10));
	arraylist.add(new Order_11(103,"Hakka-Nuddles",220.00f,2));
	arraylist.add(new Order_11(104,"Paav-Bhaji",125.00f,8));
	arraylist.add(new Order_11(105,"Grilled-Sandwitch",70.00f,02));
	
	Iterator iterator1=arraylist.iterator();
	while(iterator1.hasNext())
	{
		Order_11 o=(Order_11) iterator1.next();
		String string1=o.menuName;
		int sum=0;
		
		Iterator iterator2=arraylist.iterator();
		while(iterator2.hasNext())
		{
			Order_11 o2=(Order_11) iterator2.next();
		if(string1.equals(o2.menuName))
{
      sum=(int) (sum+(o2.price*o2.QtyOrd));
}
				
		}
		hashmap1.put(string1, (float) sum);
		
	}
	System.out.println(hashmap1);
}
}
