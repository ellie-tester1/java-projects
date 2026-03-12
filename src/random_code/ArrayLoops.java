package random_code;

import java.util.HashMap;
import  java.util.Map;

public class ArrayLoops {
    public static void main(String[] args) {

        String[] words = {"Hello", "Hi", "Goodbye"};
        System.out.println(assignWordLength(words));
    }

    public static Map<String, Integer> assignWordLength(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : arr) {
            int len = word.length();
            map.put(word, len);
        }
        return map;
    }

}

