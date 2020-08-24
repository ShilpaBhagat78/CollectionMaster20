package Q9;
import java.util.ArrayList;
import java.util.Iterator;

/*"Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and print all Employee along with their Manager name."
*/
public class Q9 {
	private static final String mgrid = null;

	public static void main(String[] args)
	{
		ArrayList<Employee>list = new ArrayList<>();
		list.add(new Employee("Nilesh",1,3));
		list.add(new Employee("Divya",2,4));
		list.add(new Employee("Anavika",3,1));
		list.add(new Employee("Sanu",4,2));
		list.add(new Employee("Deepa",5,4));
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Employee emp = (Employee) itr.next();
			String employeeName = emp.name;
//			int employeeId = emp.eid;
			int managerId = emp.mgrid;
			System.out.println("Employee: "+employeeName+" "+"ManagerName: "+list.get(managerId).name);

		}
		
		
	}

}
