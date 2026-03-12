package map;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsPractice {
    public static void main(String[] args) {

        Map<String,Double> avgTempMap = new HashMap<>();
        avgTempMap.put("Chicago", 43.0);
        avgTempMap.put("San Francisco", 57.0);
        avgTempMap.put("Boston", 43.0);
        avgTempMap.put("Los Angeles", 63.7);
        avgTempMap.put("Miami", 83.5);
        //int size() -> method returns the number of elements in the map

        int mapSize = avgTempMap.size();
        System.out.println("Map has: " + mapSize + " elements.");

        // boolean isEmpty() -> returns whether the map is empty or not using tru or false
        boolean isMapEmpty = avgTempMap.isEmpty();
        System.out.println("Is our map empty? " + (isMapEmpty ? "Yes" : "No"));

        // boolean containsKey(Object key) -> checks whether the map contains the key being searched
        boolean doesBostonExist = avgTempMap.containsKey("Boston");
        System.out.println("Does the collection contain info for Boston? " + doesBostonExist);


        Map<String, Integer> cakeMap = new HashMap<>();
        cakeMap.put("HoneyCake", 3); // 7
         cakeMap.put("Tiramisu", 4); // 6
         cakeMap.put("Vanilla", 7); // 3
         cakeMap.put("Cheesecake", 8); // 2
        System.out.println("Before Asan brought more cakes: " + cakeMap);


        if (cakeMap.containsKey("HoneyCake")) {
            cakeMap.put("HoneyCake", cakeMap.get("HoneyCake") + 7);
        }
            System.out.println("After Asan brought more cakes: " + cakeMap);
    }
}
