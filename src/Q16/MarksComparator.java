package Q16;

import java.util.Comparator;

public class MarksComparator implements Comparator< Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.totalMarks-o1.totalMarks;
	}

}
