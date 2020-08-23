package com.collection_20Q;

import java.util.*;

/*Consider List of T20 Players.
Player (playerid,Name,Country,team)
e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players.*/
public class Player_Q20 {

	int playerid;
	String Name;
	String Country;
	String Team;
	public Player_Q20(int playerid, String name, String country, String team) {
		super();
		this.playerid = playerid;
		Name = name;
		Country = country;
		Team = team;
	}
	@Override
	public String toString() {
		return "Player_Q20 [playerid=" + playerid + ", Name=" + Name + ", Country=" + Country + ", Team=" + Team + "]";
	}
	

	public static void main(String[] args) {
		ArrayList <Player_Q20>arraylist=new ArrayList<Player_Q20>();
		arraylist.add(new Player_Q20(101,"M.S.Dhoni","India","Chennai Super Kings"));
		arraylist.add(new Player_Q20(102,"virat kohli","Australia","kolkata knight riders"));
		arraylist.add(new Player_Q20(103,"suresh raina","India","mumbai indians"));
		arraylist.add(new Player_Q20(104,"David Warner","Australia","kolkata knight riders"));
		arraylist.add(new Player_Q20(105,"sachin tendulkar ","Australia","kolkata knight riders"));
		
		
//System.out.println(arraylist);		
		Iterator itrarraylist=arraylist.iterator();
		
		String string1="";
		int fcntemp=0;
		while(itrarraylist.hasNext())
		{
			Player_Q20 player1=(Player_Q20)itrarraylist.next();
			
			String tname=player1.Team;
			Iterator itr=arraylist.iterator();
			int cnt=0;
			while(itr.hasNext())
			{
				Player_Q20 p1=(Player_Q20)itr.next();
			if (p1.Country.compareTo("Australia")==0 &&tname.compareTo(p1.Team)==0)
			{
				cnt++;
			}
							
				
			}
			if(cnt>fcntemp)
			{
				fcntemp=cnt;
				string1=player1.Team;
			}
			
		}		
		
		System.out.println(string1);
		
	}
}
