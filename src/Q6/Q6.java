package Q6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*"WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
Map where key will be marks and value will be List of RollNos where all those students who have same marks are together."
*/
public class Q6 {

	public static final Integer mark = null;

	public static void main(String[] args) {
		Set<Student> set = new HashSet();
		set.add(new Student(1, "abc", 85));
		set.add(new Student(2, "xyz", 70));
		set.add(new Student(3, "mno", 65));
		set.add(new Student(4, "pqr", 50));
		set.add(new Student(5, "cfg", 70));
		set.add(new Student(6, "lkj", 65));
		set.add(new Student(7, "opp", 50));

		HashMap<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> listRollno = new ArrayList();

		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			// Map.Entry e = (Entry) itr.next();
			Student str = (Student) itr.next();
			Integer mark = str.marks;
			int rno = str.rollno;
			ArrayList<Integer> listRollno1 = new ArrayList();
			listRollno1.add(rno);

			if (map.get(mark) == null) {
				map.put(mark, listRollno1);

			} else {

				listRollno1.addAll(map.get(mark));
				map.put(mark, listRollno1);

			}

		}
		System.out.println(map);
	}
}
