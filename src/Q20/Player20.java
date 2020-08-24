package Q20;

public class Player20 implements Comparable<Player20>{
	int playerid;
	String name;
	String country;
	String team;
	
	Player20(int playerid,String name,String country,String team)
	{
		this.playerid=playerid;
		this.name = name;
		this.country = country;
		this.team = team;		
	}

	@Override
	public String toString() {
		return "Player20 [playerid=" + playerid + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}

	
	@Override
	public int compareTo(Player20 o) {
		// TODO Auto-generated method stub
		int i=(this.country.compareTo(o.country));
		
		if(i==0)
		{
	
			int j=(this.team.compareTo(o.team));
			if(j==0)
			{
				return playerid;
			}
		}
//		else
//		{
//			return playerid;
//		}
		return playerid;
	}	

}
