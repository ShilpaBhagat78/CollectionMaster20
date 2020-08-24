package Q14;

import java.util.LinkedList;
import java.util.List;

/*"Given two LinkedList, we need to combine two LinkedList  in such a way that the combined aList has alternate elements of both. If one list has extra element, then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}
"
*/
public class Q14 {
	public static void main(String[] args)
	{
		List<Integer>al = new LinkedList();
		List<Integer>al2 = new LinkedList();
		List<Integer>al3 = new LinkedList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		al2.add(11);
		al2.add(22);
		al2.add(33);
		al2.add(44);
		
		if(al.size()>al2.size())
		{
			for(int f=0;f<al.size();f++)
			{
				al3.add(al.get(f));
				
				if(f<al2.size())
					al3.add(al2.get(f));				
			}
		}
		else
		{
			for(int f=0;f<al2.size();f++)
			{
				al3.add(al2.get(f));
				if(f<al.size())
					al3.add(al.get(f));
			}
		}
		System.out.println(al3);
	}

}



