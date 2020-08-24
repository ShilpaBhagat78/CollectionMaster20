package Q7;

import java.util.Comparator;

public class RatingComparator implements Comparator<Theatre>{
	@Override
	public int compare(Theatre o1, Theatre o2) {
		
		int i = o1.movie.rating.r - o2.movie.rating.r;
		if(i==0)
		{
			return o1.Theatrename.compareTo(o2.Theatrename);
		}
		else
		{
			return o1.movie.rating.r - o2.movie.rating.r;
		}
		
	}

}
