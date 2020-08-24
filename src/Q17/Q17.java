package Q17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



/*"An arraylist has strings ""A+2"" , ""B+12"" , ""D+4"", ""DD+5"" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value"
*/
public class Q17 {
	private static final Integer Integer = null;

	public static void main(String[] args)
	{
		
		ArrayList<String>al = new ArrayList();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		
		HashMap<String,Integer>hmap = new HashMap<>();
		
		for(int i=0;i<al.size();i++)
		{			
			String s = al.get(i);
			String s1[] = s.split("\\+");			
			hmap.put(s1[0], Integer.parseInt(s1[1]));
		}
		System.out.println(hmap);
	
	}

}
