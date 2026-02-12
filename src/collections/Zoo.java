package collections;

import java.util.HashMap;

public class Zoo {
	
	private HashMap<String, Integer> animalMap = null;
	
	
	public Zoo() {
		animalMap = new HashMap<>();
	}
	
	public void addAnimals(String[] animal) {
		for (String animals : animal) {
			if (animalMap.containsKey(animals)) {
				int count = animalMap.get(animals);
				animalMap.put(animals, count + 1);
			}
			else {
				animalMap.put(animals, 1);
			}
		}
	}
	
	public void displayAnimalData() {
	    int lenMax = 0;
	    for (String key : animalMap.keySet()) {
	        if (key.length() > lenMax) {
	            lenMax = key.length();
	        }
	    }

	    for (String key : animalMap.keySet()) {
	        System.out.println(String.format("%-" + (lenMax + 2) + "s %d", key, animalMap.get(key)));
	    }
	}
}