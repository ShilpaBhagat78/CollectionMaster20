package Q7;



public class Movie {
	
	int movieid;
	String moviename;
	Rating rating;
	
	public Movie(int movieid,String moviename,Rating rating)
	{
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.rating = rating;	
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", rating=" + rating + "]";
	}
}



