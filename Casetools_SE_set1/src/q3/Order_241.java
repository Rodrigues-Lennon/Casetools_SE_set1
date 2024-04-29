package q3;

public class Order_241 extends superClass {

	private static final double Discount = 0.1;
	private String productName;
	private int quantity;
	private double price;
	
	public Order_241(String customerName,String productName,int quantity,double price) {
		super();
		this.customerName=customerName;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
	}
	
	public double displayTtotalCost() {
		double total_price;
		total_price=quantity*price;
		total_price=total_price-total_price*Discount;
		return total_price;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
