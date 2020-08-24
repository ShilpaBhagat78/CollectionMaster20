package Q2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.swing.Spring;

/*"Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {
“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”
If given list is (“abc” ) (“pqr” ) then output should be “false”"
*/
public class HashMapExample2 {
	private static final Object String = null;

	public static void main(String[] args)
	{
		//create LinkedHashMap Object with values
		LinkedHashMap<String,Integer>lm = new LinkedHashMap<String, Integer>();
		
		lm.put("rst", 43);
		lm.put("abc", 4);
		lm.put("mno", 2);
		lm.put("pqr",12);
		
		//Copied lm Object values into HashMap
		HashMap<String,Integer>hm = new HashMap<String, Integer>();
		hm.put("pqr",12);
		hm.put("rst", 43);
		hm.put("mno", 2);
		hm.put("abc", 4);
		
		
		List keys = new ArrayList(lm.keySet());
		List keys1 = new ArrayList(hm.keySet());
		for (int i = 0; i < keys.size(); i++) {
		    Object obj = keys.get(i);
		    
		    System.out.println("lm object: "+obj);
		    System.out.println("hm keys: "+keys1.get(i));
		    
		    //Compare hm key to lm key
		    if(keys.get(i).equals(keys1.get(i)))
		    {
		    	System.out.println("True");
		    }
		    else
		    {
		    	
		    	System.out.println("Insertion order not maintained: "+"False");
		    	break;
		    }
		}
				
		

	}

}
