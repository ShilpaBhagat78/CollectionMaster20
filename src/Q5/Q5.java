package Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*"Assume that there is already aarraylist of Customer objects. Customer { intcid , String name ,
int[] items }. Write a program which creates hashset of customer objects. If there are
multiple customer object for same customer in arraylist ,then items should be added to previous customer’s items.                                                                                                                Once set is created sort that set based on no. of items purchased by that customer.Customer with maximum items should be first."
*/
public class Q5 {
	
	

	
	public static void main(String[] args)
	{
		int[]ar = {5,6,9};
		ArrayList<Customer>list = new ArrayList<>();
		list.add(new Customer(1,"Nilesh",ar));
		list.add(new Customer(2,"nimu",ar));
		list.add(new Customer(3,"Anavika",ar));
		
		int[]arr= {1,2,3};
		HashSet<Customer> hs = new HashSet<>();
		hs.add(new Customer(1,"Nilesh",arr));
		hs.add(new Customer(2,"nimu",arr));
		hs.add(new Customer(3,"Anavika",arr));
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Customer cs = (Customer) itr.next();
			int cid = cs.cid;
			int[]itm1 = cs.items;
			
			Iterator<Customer> set = hs.iterator();
			while(itr.hasNext())
			{
				Customer hst = (Customer) itr.next();
				int[] itm2 = hst.items;
//				int[]items=itm1+ itm2;
				int a = itm1.length;
		        int b = itm2.length;
		        System.out.println("itm2"+itm2.toString());
		        int[] result = new int[a + b];
		        System.arraycopy(itm1, 0, result, 0,a);
		        System.arraycopy(itm2, 0, result, a,b);//not getting proper outut
		        
		         
		        
//		        System.arrays.deepcopy(itm2, 0, result, a,b);
//		        System.arrays.deepToString(itm2,0,result,0,b));
		       
		        
		        System.out.println(Arrays.toString(result));
//		        Arrays.toString(result);
				int cid1 = hst.cid;
				String nm = hst.name;
//				if(cid==cid1)
//				{
//					list.add(cid,hst.name,int[]result);
//				}
			}
		}		
		
	}

}
