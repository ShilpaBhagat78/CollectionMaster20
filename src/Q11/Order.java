package Q11;

public class Order {
	int orderid;
	String MenuName;
	Float price;
	int qtyOrdered;
	
	public Order(int orderid,String MenuName,Float price,int qtyOrdered)
	{
		this.orderid = orderid;
		this.MenuName = MenuName;
		this.price = price;
		this.qtyOrdered = qtyOrdered;		
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", MenuName=" + MenuName + ", price=" + price + ", qtyOrdered="
				+ qtyOrdered + "]";
	}	

}
