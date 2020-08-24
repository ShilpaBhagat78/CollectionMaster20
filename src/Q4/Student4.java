package Q4;

import java.util.HashSet;

public class Student4 {
	int sid;
	String name;
	String course;
	
	
	
	Student4(int sid,String name,String course)
	{
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student4 [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}

}
