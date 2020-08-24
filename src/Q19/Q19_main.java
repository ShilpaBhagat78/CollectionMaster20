package Q19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*"There is a HashSet which has student objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)"
*/
public class Q19_main {
	public static void main(String[] args)
	{
		HashSet<Student19>hs = new HashSet<>();
		hs.add(new Student19(1,"reena","BE",2018,true));
		hs.add(new Student19(2,"jaya","BSC",2015,false));
		hs.add(new Student19(3,"nita","MSC",2017,true));
		hs.add(new Student19(4,"manisha","BCA",2016,false));
		hs.add(new Student19(5,"pranita","MCA",2014,true));
		
		ArrayList<Student19> placedStudents = new ArrayList<>();
		ArrayList<Student19> unplacedStudents = new ArrayList<>();
		
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			Student19 studentData = (Student19) itr.next();
			Boolean placedAndunplaced = studentData.placing;
			
			if(placedAndunplaced==true)
			{
				placedStudents.add(studentData);				
			}
			else {
				unplacedStudents.add(studentData);				
			}
		}
		System.out.println(placedStudents);
		System.out.println(unplacedStudents);
	}

}
