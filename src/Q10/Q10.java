package Q10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*"An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>  
Create another map in which course id is a key and list of student objects of that 
"
*/
public class Q10 {
	private static final Integer cid = null;
	private static final List<Student> str = null;

	public static void main(String[] args)
	{
		List<Course>li = new ArrayList();
		li.add(new Course(101,"java"));
		li.add(new Course(102,"angular"));
		li.add(new Course(103,"c++"));
		li.add(new Course(104,"c"));
		HashMap<Student,List<Course>>map = new HashMap<>();
		map.put(new Student(1, "abc"),li);
		map.put(new Student(2, "pqr"),li );
		map.put(new Student(3, "rst"),li);
		map.put(new Student(4, "mno"),li);
		
		HashMap<Integer,List<Student>>map1 = new HashMap<>();
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Student str = (Student) itr.next();
			Course crs = (Course) itr.next();
			int cid = crs.courseid;			
		}
		map1.put(cid, str);
		System.out.println(map1);		
		
	}

}
