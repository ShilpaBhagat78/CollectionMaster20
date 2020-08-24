package Q13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*Create two Set of students objects where insertion order in maintained.
 *  Now accept Studentid from user and check whether in both sets have student with given id at same position
*/
public class Q13 {
	public static void main(String[] args) {

		LinkedHashSet<Student> set = new LinkedHashSet();
		set.add(new Student(1, "Shilpa"));
		set.add(new Student(2, "Rakhi"));

		List<Student> details = new ArrayList<>(set);
		Student id11 = details.get(0);
		Student Name = details.get(1);

		LinkedHashSet<Student> set1 = new LinkedHashSet();
		set1.add(new Student(1, "Shilpa"));
		set1.add(new Student(2, "Rakhi"));

		List<Student> details1 = new ArrayList<>(set);
		Student id12 = details.get(0);
		Student Name2 = details.get(1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student1 id: ");
		int id1 = sc.nextInt();

		System.out.println("Enter Student2 id: ");
		int id2 = sc.nextInt();
		
		//Checked First id of user to set First id
		Iterator itr = details.iterator();
		while (itr.hasNext()) {
			Student var = (Student) itr.next();
			int studid = var.id;
			if (id1 == studid) {
				System.out.println("first student id matched: " + "True");
			} else {
				System.out.println("first student id  not matched: " + "False");

			}
			//Checked Second id of user to set Second id
			while (itr.hasNext()) {
				Student var1 = (Student) itr.next();
				int studid1 = var1.id;
				if (id2 == studid1) {
					System.out.println("second student id matched: " + "True");
				} else {
					System.out.println("second student id  not matched: " + "False");

				}
				
				//Checked Both id from user to Set Both ids
				while (itr.hasNext()) {

					if (id1 == studid && id2 == studid1) {
						System.out.println("Both student id matched: " + "True");
					} else {
						System.out.println("Both student id  not matched: " + "False");

					}
				}
			}

		}

	}

}
