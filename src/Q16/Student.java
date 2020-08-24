package Q16;

public class Student {
	int sid;
	int totalMarks;
	
	 public Student(int sid,int totalMarks)
	{
		 this.sid = sid;
		 this.totalMarks = totalMarks;		
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", totalMarks=" + totalMarks + "]";
	}	 

}
