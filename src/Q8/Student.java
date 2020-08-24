package Q8;

import java.util.List;

public class Student {
	int sid;
	String sname;
	List<String>hobby;
	
	public Student(int sid,String sname,List<String>hobby)
	{
		this.sid = sid;
		this.sname = sname;
		this.hobby = hobby;		
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", hobby=" + hobby + "]";
	}

}
