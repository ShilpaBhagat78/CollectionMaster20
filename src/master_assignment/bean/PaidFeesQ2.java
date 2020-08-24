package master_assignment.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*find our students who paid all fees, use LinkedHashMap in order to
 *  find out those first 3 students across courses who paid full fees
 *   ( note student can pay fee in part installment or one time as well)
*/
public class PaidFeesQ2 {
	public static void main(String[] args)
	{
		HashMap<Student,Transaction> map = new HashMap<>();
		map.put((new Student(101, "pqr", 456321, "test1@gmail.com")),new Transaction(5000,101,new Date(2018 - 06 - 3)));
		map.put((new Student(102, "bittu", 4741251, "test2@gmail.com")),new Transaction(10000,102,new Date(2019 - 8 - 3)));
		map.put((new Student(101, "pqr", 456321, "test1@gmail.com")),new Transaction(5000,101,new Date(2018 - 06 - 3)));
		map.put((new Student(103, "abc", 457469, "test3@gmail.com")),new Transaction(10000,103,new Date(2018 - 06 - 3)));
		map.put((new Student(104, "xyz", 4741251, "test4@gmail.com")),new Transaction(5000,104,new Date(2018 - 06 - 3)));
		map.put((new Student(104, "xyz", 4741251, "test4@gmail.com")),new Transaction(5000,104,new Date(2020 - 06 - 3)));
		
		LinkedHashMap<List<Student>,List<Transaction>> map1 = new LinkedHashMap<>();
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			//incomplete
			Student studentData = (Student) itr.next();
			int studentId = studentData.getStudent_id();
			String studentName = studentData.getstudent_name();
			System.out.println(studentName);
			
//			Transaction transactionDetails = (Transaction) itr.next();
//			int paidFees = transactionDetails.paidfees;
//			System.out.println(paidFees);
			
		}
	}
	

}
