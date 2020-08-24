package master_assignment.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/*show poor performing students (marks <40%) across all tests for a course id.
*/
public class PoorPerformanceQ3 {
	public static void main(String[] args) {
		int average = 0;

		HashMap<Integer, List<TestResult>> test_map = new HashMap<Integer, List<TestResult>>();

		ArrayList<TestResult> list = new ArrayList();
		list.add(new TestResult(new Date(2019 - 03 - 05), 1, 101, 75, 100));
		list.add(new TestResult(new Date(2019 - 03 - 05), 1, 102, 30, 100));
		list.add(new TestResult(new Date(2019 - 03 - 05), 1, 103, 39, 100));
		list.add(new TestResult(new Date(2019 - 03 - 10), 1, 101, 65, 100));
		list.add(new TestResult(new Date(2019 - 03 - 18), 1, 101, 80, 100));

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			TestResult testDetails = (TestResult) itr.next();
			int testId = testDetails.testid;
			int testMark = testDetails.marks;
			int outOfMark = testDetails.out_of_marks;
			int studentId = testDetails.studentId;
			
			
		
//			while(itr.hasNext())
//			{
//				TestResult testDetails1 = (TestResult) itr.next();
//				
//				 average = testMark / outOfMark;
//
//				if (average < 40) {
////					System.out.println("Poor Performance Students: " + studentId + " " + average);
//				} else {
////					System.out.println("performance is good: " + average);
//				}
//				
//			}
//			System.out.println(average+" "+studentId);

			

		}

	}
}
