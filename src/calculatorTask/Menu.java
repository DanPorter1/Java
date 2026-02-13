package calculatorTask;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    static HashMap<Integer, String> map = new HashMap<>();

     static void setMenu() {
        map.put(1, "add");
        map.put(2, "subtract");
        map.put(3, "Multiply");
        map.put(4, "Divide");
        map.put(5, "Enter new numbers");
        map.put(6, "Exit");
        System.out.println("=== Calculator ===");
    }

    static void getMenu() {
        System.out.println("\n--- Menu ---");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":  " + entry.getValue()); }
        System.out.println(" ");
    }

    static int getChoice() {
        return 1;
    }
}
