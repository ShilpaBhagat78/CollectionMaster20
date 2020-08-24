package Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*There is arraylist which contains objects of class BookSale{Book b,int copiesSold}
 * Book{int bookid,String author,float price}
 * There is also a hashMap which contains information about business done by each book.
 * Map<int bookid,float amount>Map already has information about all books and business
 * done till now.you can take hardcoded values in map.write a program to update  map using
 * new information in given array.if book is present in map calculate its business amount(price*copiessold)
 * and add to existing amount in map. if book is not present add its entry in map.*/
public class BookSale {
	Book b;
	int copiesSold;

	public BookSale(Book b, int copiesSold) {
		super();
		this.b = b;
		this.copiesSold = copiesSold;
	}

	public static void main(String[] args) {
		ArrayList<BookSale> List = new ArrayList();
//		List of book
		List.add(new BookSale(new Book(1, "Shiv Khera", 150.30f), 3));
		List.add(new BookSale(new Book(2, "Shakespear", 200.15f), 5));
		List.add(new BookSale(new Book(3, "Chetan Bhagat", 300.00f), 7));
		List.add(new BookSale(new Book(4, "Arundhati Roy", 100.45f), 6));
//		Books existing amount
		HashMap<Integer, Float> map = new HashMap<>();
		map.put(1, 100.90f);
		map.put(2, 200.75f);
		map.put(3, 300.00f);
		// map.put(1, 602.70f);
		System.out.println("map:" + map);
		Iterator<BookSale> iterator = List.iterator();
		//	Iterate over book	
		while (iterator.hasNext()) {
			BookSale bs = iterator.next();
			Integer i = bs.b.bookid;
			// Calculate book sold amount			
			Float amount = bs.b.price * bs.copiesSold;
			Set set = map.entrySet();
			Iterator itr = set.iterator();
			//	Iterate over MAP		
			while (itr.hasNext()) {
				Map.Entry e = (Entry) itr.next();
				int i1 = (int) e.getKey();
				// Check book is exist in map or not
				if (i1 == i) {
					// Get amount from MAP & add with multiplied value
					float amt = (float) e.getValue();
					float businessAmount = amount + amt;
					//if exist add to MAP with business amount
					map.put(i1, businessAmount);
				}
			}
			//	IF NOT exist add to MAP
			map.put(i, amount);
			System.out.println(":" + map);
			// System.out.println(map);
		}
	}

}
