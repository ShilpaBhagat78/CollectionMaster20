package Q8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*"Consider an array of Student 
Student (int sid, String sname, List<String> hobby)
From this list create a Map<String,List<Student>> where key is hobby name and list of
student objects having same hobby. Also find out most common hobby among students"
*/
public class Q8 {

	public static void main(String[] args) {
		ArrayList<String> hobby = new ArrayList();
		hobby.add("hocky");
		hobby.add("Football");

		ArrayList<String> hobby1 = new ArrayList();
		hobby.add("Cricket");
		hobby.add("Football");

		ArrayList<Student> list = new ArrayList();
		list.add(new Student(1, "Shilpa", hobby));
		list.add(new Student(2, "Nilesh", hobby1));

		HashMap<String, List<Student>> map = new HashMap<>();

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Student s1 = (Student) itr.next();
			String names = s1.sname;
			List<String> HobbyStudents = s1.hobby;

//			if (map.get(names) == null) {
//				map.put(HobbyStudents, names);
//			} else {
//				map.put(HobbyStudents, names);
//
//			}

		}
		System.out.println(map);

	}

}
