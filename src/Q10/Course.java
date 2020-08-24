package Q10;

public class Course {
	int courseid;
	String coursename;

	public Course(int courseid, String coursename) {
		this.courseid = courseid;
		this.coursename = coursename;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + "]";
	}

}
