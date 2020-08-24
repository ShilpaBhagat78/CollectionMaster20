package Q19;

public class Student19 {
	int studid;
	String name;
	String qualification;
	int yearOfPassing;
	boolean placing;
	
	Student19(int studid,String name,String qualification, int yearOfPassing,boolean placing)
	{
		this.studid = studid;
		this.name = name;		
		this.qualification = qualification;
		this.yearOfPassing = yearOfPassing;
		this.placing = placing;		
	}

	@Override
	public String toString() {
		return "Student19 [studid=" + studid + ", name=" + name + ", qualification=" + qualification
				+ ", yearOfPassing=" + yearOfPassing + ", placing=" + placing + "]";
	}

	
}
