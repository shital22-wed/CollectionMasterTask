package com.collection_20Q;
/*Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)*/
public class Movie {
  int mid;
  String mname;
  int rating;
public Movie(int mid, String mname, int rating) {
	super();
	this.mid = mid;
	this.mname = mname;
	this.rating = rating;
}
@Override
public String toString() {
	return "Movie [mid=" + mid + ", mname=" + mname + ", rating=" + rating + "]";
}
  
  
}
