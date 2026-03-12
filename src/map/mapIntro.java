package map;

import java.util.HashMap;
import java.util.Map;

public class mapIntro {
    public static void main(String[] args) {

        // Map interface is a collection of data for key-value paired information
        // it has 3 implementations that's mostly used: HashMap, TreeMap and LinkedHashMap
        // all the keys in a map are unique, values can be repeated
        // only one null key is allowed

        Map<String, String> stateAndCapital = new HashMap<>();
        // put(Key, Value) -> adds entry or key-value pair data into a map

         stateAndCapital.put("CA", "Sacramento");
         stateAndCapital.put("WI", "Madison");
         stateAndCapital.put("UT", "Salt Lake City");
         stateAndCapital.put("MA", "Boston");
         stateAndCapital.put("LA", "Baton Rouge");
         stateAndCapital.put("TX", "Austin");
         stateAndCapital.put("CA", "San Diego");
               System.out.println(stateAndCapital);

         //get(Key) -> returns us the Value associated with the passed Key
          System.out.println(stateAndCapital.get("UT"));
          String capitalOfUT = stateAndCapital.get("UT");     // assigning the Value associated with Key "UT" to a String variable

        System.out.println("The capital of state Utah is: " + capitalOfUT);


        Map<Long, String> ssnWithName = new HashMap<>();
        ssnWithName.put(1234567890L, "Mike Madison");
        ssnWithName.put(6434537890L, "Jessica Alba");
        ssnWithName.put(2234547890L, "Megan Kelly");
        ssnWithName.put(7224567890L, "Eminem Jameson");
        ssnWithName.put(9344567890L, "Jennifer Aniston");
        System.out.println(ssnWithName.get(1234567890L));
        System.out.println(ssnWithName.get(9344567890L));


    }
}
