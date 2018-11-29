package dom.order.com;

public class Order {
	
	int price;
	String status;
	
	public Order(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [price=" + price + ", status=" + status + "]";
	}
	
	

}
