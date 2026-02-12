package collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class RunnerSB {
	
	public static Deque<ShoppingBasket> basketsList = new LinkedList<>();
	
	
	public static void main(String[] args) {
		// Zoo
		Zoo z = new Zoo();	
		String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
		String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
		
		z.addAnimals(originalAnimals);
		z.addAnimals(newAnimals);
		
		z.displayAnimalData();
		
//		ShoppingBasket b1 = new ShoppingBasket();
//		b1.add(new ShoppingBasketItem("Apple", 1, 0.8));
//		b1.add(new ShoppingBasketItem("Banana", 1, 0.9));
//		
//		ShoppingBasket b2 = new ShoppingBasket();
//		b2.add(new ShoppingBasketItem("Orange", 2, 5));
//		b2.add(new ShoppingBasketItem("Mango", 1, 1.2));
//		b2.add(new ShoppingBasketItem("Grape", 1, 1.4));
//		
//		basketsList.add(b1);
//		basketsList.add(b2);
//		
//		processBaskets();
	}
	
	public static void processBaskets() {
		int totalBaskets = basketsList.size();
		int num = 1;
		while (!basketsList.isEmpty()) {
			System.out.println(String.format("Checking Basket %d out of %d", num, totalBaskets));
			ShoppingBasket b = basketsList.poll();
			ArrayList<ShoppingBasketItem> items = b.getItems();
			for (ShoppingBasketItem i: items) {
				System.out.println(i.getDetails());
			}
			System.out.println(String.format("Your Total is: £%.2f\n", b.getTotal()));
			num++;
		}
		System.out.println("No more baskets in que");
	}
}
