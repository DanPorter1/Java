package collections;

public class ShoppingBasketItem {
	
	private String productName;
	private int quantity = 1;
	private double price;
	
	public ShoppingBasketItem(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public ShoppingBasketItem(String productName, int quantity) {
		this.productName = productName;
		this.quantity = quantity;
	}
	
	public ShoppingBasketItem(String productName) {
		this.productName = productName;
	}
	
	public String getDetails() {
		return String.format("Items: %s - Amount %d - Price £%.2f", this.productName, this.quantity, this.price);
	}
	
	public double getPrice() {
		return this.price;
	}

}
