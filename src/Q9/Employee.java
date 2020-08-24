package Q9;

public class Employee {
	String name;
	int eid;
	int mgrid;
	
	Employee(String name,int id,int mgrid)
	{
		this.name= name;
		this.eid = id;
		this.mgrid = mgrid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	}	

}
