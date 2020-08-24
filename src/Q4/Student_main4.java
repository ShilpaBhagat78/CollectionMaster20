package Q4;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*A hashmap contains information about students and his marks. 
 * Student object is key and marks is value.
 *  Write a method to create 2 hashset which will have passed students of java course and passed students of angular course. 
 *  Passing marks for java is 50 and passing marks for angular is 60.
 *   Student class is as follows. Student { int sid , String name, String course }
*/
public class Student_main4 {

	private static final char[] markValue = null;

	public static void main(String[] args) {
		HashMap<Student4, Integer> hashmap = new HashMap<>();
		hashmap.put(new Student4(1, "Shilpa", "Java"), 50);
		hashmap.put(new Student4(2, "Jyoti", "Angular"), 40);
		hashmap.put(new Student4(3, "Anvika", "Java"), 70);
		hashmap.put(new Student4(4, "Madhavi", "Angular"), 80);
		hashmap.put(new Student4(5, "Rakhi", "Java"), 30);
		hashmap.put(new Student4(6, "rima", "Angular"), 90);

		Set set = hashmap.entrySet();
		Iterator itr = set.iterator();
		// Iterate over MAP
		while (itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			Student4 str = (Student4) e.getKey();
			String course = str.course;
			Integer i = (Integer) e.getValue();
			// System.out.println(i);
			// System.out.println(course);

			Student_main4(str, course, i);
		}

	}

	public static void Student_main4(Student4 str, String course, Integer i) {
		if (course == "Java") {
			if (i >= 50) {

				HashSet<Student4> passedStudentJava = new HashSet<>();
				passedStudentJava.add(str);
				System.out.println("Passed Student Java: " + passedStudentJava);

			}

		}

		if (course == "Angular") {
			if (i >= 60) {

				HashSet<Student4> passedStudentJava = new HashSet<>();
				passedStudentJava.add(str);
				System.out.println("Passed Student Angular: " + passedStudentJava);

			}

		}

	}

}
