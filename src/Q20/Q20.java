package Q20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*"20. Consider List of T20 Players.
Player (playerid,Name,Country,team)
e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players."
*/
public class Q20 {
	public static void main(String[] args) {
		ArrayList<Player20> list = new ArrayList<>();
		list.add(new Player20(1, "MSDhoni", "India", "Chennai Super Kings"));
		list.add(new Player20(2, "Shane watson", "Australia", "Chennai Super Kings"));
		list.add(new Player20(3, "Kieron Pollard", "West India", "Mumbai Indians"));
		list.add(new Player20(4, "Alex Carey", "Australia", "Delhi Capitals"));
		list.add(new Player20(5, "Virat", "India", "Royal Challengers"));
		list.add(new Player20(6, "Josh Hazlewood", "Australia", "Chennai Super Kings"));

		// Collections.sort(list);
		// System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Player20 players = (Player20) itr.next();
			String contryName = players.country;
			String teamName = players.team;
			System.out.println(contryName + " " + teamName);

		}

	}

}
