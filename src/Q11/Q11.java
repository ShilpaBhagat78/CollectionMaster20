package Q11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*"Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis. Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,  qtyOrdered. 
 * (Price of same Menu may vary according hours).
From ArrayLsit of Orders create a map <String,Float> where Menu Name is key and total sale in a day for theMenu as Value. 
(sale for the menu is Price*qty ordered).
Eg. Order List for a day is :
[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10), 
  (92,”Hakka Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8), (101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}
"
*/
public class Q11 {
	public static void main(String[] args) {
		ArrayList<Order> list = new ArrayList<>();
		list.add(new Order(80, "Pav Bhajee", 120.00f, 5));
		list.add(new Order(90, "Grilled Sandwitch", 72.00f, 10));
		list.add(new Order(92, "Hakka Noodles", 220.00f, 2));
		list.add(new Order(96, "Pav Bhajee", 125.00f, 8));
		list.add(new Order(101, "Grilled Sandwitch", 70.00f, 2));

		HashMap<String, Float> map = new HashMap<>();

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Order orderlist = (Order) itr.next();
			String menu = orderlist.MenuName;
			int quantity = orderlist.qtyOrdered;
			float menuPrice = orderlist.price;
			//Add newPrice 
			float newPrice = quantity * menuPrice;
			
			//Checked key if exist or not
			if (map.get(menu) == null) {
				map.put(menu, quantity * menuPrice);
			} else {//if key is exist then its add its previous value
				float priviousNo = map.get(menu);

				map.put(menu, (newPrice) + (priviousNo));
			}

		}
		System.out.println(map);

	}
}
