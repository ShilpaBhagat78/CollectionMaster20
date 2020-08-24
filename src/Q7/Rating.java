package Q7;

public class Rating {
	int r;
	String rateinwrd;
	
	public Rating(int r,String rateinwrd)
	{
		this.r = r;
		this.rateinwrd = rateinwrd;	
	}

	@Override
	public String toString() {
		return "Rating [r=" + r + ", rateinwrd=" + rateinwrd + "]";
	}

}
