package map;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKeyMethodPractice1 {
    public static void main(String[] args) {

        // Task: given word "japanese" print out the number of times
        // each character appear
        // EX: j: 1, a: 2, p: 1, n: 1, e: 2, s: 1
        // EX: "colorado" -> c: 1, o: 3, l: 1, r: 1, a: 1, d: 1

        Map<Character, Integer> charFrequencyMap = new HashMap<>(); // { a=2, j=1 }
         String word = "ajapanaesseeeee";
         for (int i = 0; i < word.length(); i++) {
             char curCharacter = word.charAt(i); // a
             if (charFrequencyMap.containsKey(curCharacter)) {
                 //int currentValue = charFrequencyMap.get(curCharacter); // 1
                 charFrequencyMap.put(curCharacter, charFrequencyMap.get(curCharacter) + 1); // a=2
             } else {
                 charFrequencyMap.put(curCharacter, 1); // j=1
             }
        }
         System.out.println(charFrequencyMap);


    }
}
