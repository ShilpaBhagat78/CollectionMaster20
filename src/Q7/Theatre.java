package Q7;



public class Theatre {
	int Theatreid;
	String Theatrename;
	String location;
	Movie movie; 
	
	public Theatre(int theatreid,String theatrename,String location,Movie movie)
	{
		super();
		Theatreid = theatreid;
		Theatrename = theatrename;
		this.location = location;
		this.movie = movie;		
	}

	@Override
	public String toString() {
		return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location
				+ ", movie=" + movie + "]";
	}
}


