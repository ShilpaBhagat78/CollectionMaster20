package Q12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*Create a Map<String,String> where key is adharno  and
 *  value is voted casted to which party(eg. BJP,ShivSena,NCP,Congress,Other) .
 *  From this create new map such that KEY is party name and value is count of votes casted 
*/
public class Q12 {

	public static void main(String[] args) {

		String value1 = null;

		Map<String, String> vote = new HashMap();
		vote.put("1234567", "BJP");
		vote.put("74859612", "ShivSena");
		vote.put("85210369", "Congress");
		vote.put("654123987", "BJP");
		vote.put("7412369850", "BSP");
		vote.put("852369", "BJP");
		vote.put("8521003", "Congress");
		vote.put("753692", "BJP");
		vote.put("102365", "Congress");
		vote.put("9630255", "BSP");

		Map<String, Integer> m = new HashMap();
		
		//apply iterator over MAP
		Set set = vote.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			String adharNo = (String) e.getKey();
			value1 = (String) e.getValue();
			System.out.println(adharNo + " " + value1);
			
			//Checked if key exist or not
			if (m.get(value1) == null) {
				m.put(value1, 1);
			}
			
			else {
				//if already exist take previous value add 1
				int previousValue = m.get(value1);
				m.put(value1, previousValue + 1);
			}

		}
		System.out.println(m);

	}
}
