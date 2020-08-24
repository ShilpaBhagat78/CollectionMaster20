package master_assignment.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*show most favoured course based on number of students enrolled.
 *  (Course with maximum students)
*/

public class FavoredCourseQ1 extends Academy {
	

	public static void main(String[] args) {

		HashMap<Integer, List<Student>> studentMap = new HashMap<Integer, List<Student>>();

		ArrayList<Student> List = new ArrayList<Student>();
		List.add(new Student(101, "pqr", 456321, "test1@gmail.com"));
		List.add(new Student(102, "bittu", 4741251, "test2@gmail.com"));
		List.add(new Student(103, "abc", 457469, "test3@gmail.com"));
		List.add(new Student(104, "xyz", 4741251, "test4@gmail.com"));

		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course(1, "java", new Date(2018 - 06 - 3), "java", 10000, "6Month"));
		courseList.add(new Course(2, "python", new Date(2018 - 11 - 06), "python", 10000, "3Month"));
		courseList.add(new Course(3, "php", new Date(2018 - 11 - 06), "php", 10000, "5Month"));
		courseList.add(new Course(1, "java", new Date(2018 - 11 - 06), "java", 10000, "6Month"));

		Iterator itr = courseList.iterator();
		int counter = 0;
		while (itr.hasNext()) {
			Course courseData = (Course) itr.next();
			int courseid = courseData.courseId;
			String courseName = courseData.course_name;
			ArrayList<Student> List1 = new ArrayList<Student>();
			
			//list1 access by index based
			List1.add(List.get(counter));

			//Checked CorseId exist or not
			if (studentMap.get(courseid) == null) {
				studentMap.put(courseid, List1);
			} else {
				List1.addAll(studentMap.get(courseid));

				studentMap.put(courseid, List1);
			}
			counter++;

		}
		System.out.println(studentMap);

	}
}
