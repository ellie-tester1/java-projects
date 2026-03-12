package map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("Apple", 30);
        fruitsMap.put("Banana", 20);
        fruitsMap.put("Pear", 16);
        fruitsMap.put("Strawberry", 41);
        fruitsMap.put("Cherry", 14);
        System.out.println("How many apples I have? " + fruitsMap.get("Apple"));
        for (String fruitName : fruitsMap.keySet()) {
            int quantity = fruitsMap.get(fruitName);
            if (quantity >= 20) {
                System.out.println(fruitName + " quantity is: " + quantity);
            }
        }

    }

}
