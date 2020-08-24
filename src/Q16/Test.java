package Q16;

public class Test {
	int tid;
	int sid;
	int marks;
	
	public Test(int tid,int sid,int marks)
	{
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;		
	}

	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + marks + "]";
	}

}
