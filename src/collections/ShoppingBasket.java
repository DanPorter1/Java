package collections;

import java.util.ArrayList;

public class ShoppingBasket {
	
	private ArrayList<ShoppingBasketItem> basketItems = new ArrayList<>();
	
	public void add(ShoppingBasketItem item) {
		basketItems.add(item);
	}
	
	public ArrayList<ShoppingBasketItem> getItems() {
		return basketItems;
	}
	
	public double getTotal() {
		double t = 0;
		for (ShoppingBasketItem i : basketItems) {
			t += i.getPrice();
		}
		return t;
	}
} 
