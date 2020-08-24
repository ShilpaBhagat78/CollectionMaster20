package Q16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*11.	Consider an ArrayList<Test>and  test has  {tid,sid,marks} .
 * Create a Set<Student> Student{sid,totalmarks}  from the list and sort the set in descending order of totalmarks. [2M]

*/

public class Demo {
	public static void main(String[] args) {
		ArrayList<Test> al = new ArrayList();
		al.add(new Test(10, 101, 65));
		al.add(new Test(15, 102, 80));
		al.add(new Test(8, 103, 50));

		Set<Student> s = new TreeSet<Student>(new MarksComparator());
		s.add(new Student(101, 55));
		s.add(new Student(102, 80));
		s.add(new Student(103, 40));
		System.out.println(s);

	}

}
