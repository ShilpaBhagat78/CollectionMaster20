package Q3;
/*"Given a linked list of integers , find out number of missing elements in linked list. E.g. list
contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list."
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Q3_1 {

	public static void printMissing(ArrayList<Integer> list, int min, int max) {
		{
			HashSet<Integer> hs = new HashSet<>();
			// Insert all elements of arraylist in set
			for (int i = 0; i < list.size(); i++)
				hs.add(list.get(i));
			// Traverse throught the range an print all
			// missing elements
			for (int i = min; i <= max; i++) {
				if (!hs.contains(i)) {
					System.out.print(i + " ");
				}
			}
		}

	}

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList();
		list1.add(2);
		list1.add(6);
		list1.add(4);
		list1.add(8);
		list1.add(10);
		ArrayList<Integer> list = new ArrayList(list1);
		
		List<Integer> sortedlist = new ArrayList<>(list);
		Collections.sort(sortedlist);
		//Get Min & Max value
		int min = sortedlist.get(0);
		int max = sortedlist.get(sortedlist.size() - 1);

		// System.out.println("max: "+findMax(list));
		// System.out.println("min: "+findMin(list));

		printMissing(list, min, max);
	}

}
