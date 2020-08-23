package com.collection_20Q;
/*Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)*/

public class Theater {
int tid;
String tname;
String location;
Movie m;
public Theater(int tid, String tname, String location, Movie m) {
	
	this.tid = tid;
	this.tname = tname;
	this.location = location;
	this.m = m;
}
@Override
public String toString() {
	return "Theater [tid=" + tid + ", tname=" + tname + ", location=" + location + ", m=" + m + "]";
}


}
