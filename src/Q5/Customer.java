package Q5;

import java.util.Arrays;

public class Customer {
	int cid;
	String name;
	int[]items;
	
	public Customer(int cid,String name,int[] items)
	{
		this.cid = cid;
		this.name = name;
		this.items = items;		
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", items=" + Arrays.toString(items) + "]";
	}
	
	

}
