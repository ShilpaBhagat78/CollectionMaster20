package Q7;

import java.util.ArrayList;
import java.util.Collections;



/*"Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)"
*/
public class Q7 {
	public static void main(String[] args)
	{
		ArrayList<Theatre>al = new ArrayList<Theatre>();
		al.add(new Theatre(11,"PVR","pune",new Movie(111,"ABCD",new Rating(2,"Two"))));
		al.add(new Theatre(12,"TVR","Mumbai",new Movie(112,"ABCD2",new Rating(3,"Three"))));
		al.add(new Theatre(13,"SVR","Delhi",new Movie(113,"ABCD3",new Rating(4,"four"))));
		al.add(new Theatre(14,"DVR","Chennai",new Movie(114,"ABCD4",new Rating(4,"four"))));
		
		Collections.sort(al,new RatingComparator());
	System.out.println(al);		
	}}


