package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCopy {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Mercedes");
        originalList.add("BMW");
        originalList.add("Lexus");
        originalList.add("Porsche");
// create a shallow copy of an existing array List
//we have to pass that as an argument into  the new arraylist object

        ArrayList<String> copiedList = new ArrayList<>(originalList);
        System.out.println("Original: " + originalList);
        System.out.println("Copy: " + copiedList);

        copiedList.set(2, "Fiat");
        System.out.println("Original after: " + originalList);
        System.out.println("Copy after: " + copiedList);


        ArrayList<String> copy2 = originalList;
        System.out.println("Copy #2: " + copy2);

        copy2.set(1, "Toyota");
        System.out.println("Original after: " + originalList);
        System.out.println("Copy #2 after: " + copy2);

        ArrayList<String> newList = new ArrayList<>();
        for (String car : originalList) {
            newList.add(car);
        }
        System.out.println("New list: " + newList);

        newList.set(0, "Lincoln");
        System.out.println("Original after adding Lincoln: " + originalList);
        System.out.println("NewList after adding Lincoln: " + newList);


        // addAll() -> method adds elements from one list to another list's end
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Pear");
        List<String> tropicalFruits = Arrays.asList("Banana", "Pineapple", "Kiwi", "Mango", "Orange");
        System.out.println("Fruits list: " + fruitList);
        System.out.println("Tropical fruits list: " + tropicalFruits);

        // adding all tropical fruits list to fruits list 
        fruitList.addAll(tropicalFruits);
        System.out.println("After Fruits list: " + fruitList);
        System.out.println("After Tropical fruits list: " + tropicalFruits);
        for (String fruit : fruitList) {
            if (fruit.contains("p") || fruit.contains("P"))
                System.out.println("Fruit with 'p' char: " + fruit);
        }

        // print the names of the fruits where fruit name length is greater than or equal to 6
        for (String fruitName : fruitList) {
            if (fruitName.length() >= 6)
                System.out.println(fruitName + " name length is: " + fruitName.length());
        }


        // Task: create an arraylist of years in Integer type and then print each year using     enhanced for loop
        // EX: ArrayList<Integer> years = Arrays.asList(1877, 2034, 1978, 1961, 1944);
        // Task2: if the year is even then divide it by 2 and if odd year then add 3 to it
        // EX: List<Integer> years = Arrays.asList(1877, 2034, 1978, 1961, 1944);       // 1877 -> 1877 + 3 -> 1880 <- odd
        // 2034 -> 2034/2 -> 1017 <- even       // Task: given arrayList of Character objects
        // List<Character> chars = Arrays.asList('a', 'a', 'd', 'f', 'e', 'd', 'c', 'e');
        // Create a new ArrayList by copying the elements from 'chars' list
        // by skipping duplicate elements       // Expected List: ['a', 'd', 'f', 'e', 'c']

        List<Character> chars = Arrays.asList('a', 'a', 'd', 'f', 'e', 'd', 'c', 'e');
        ArrayList<Character> newChars = new ArrayList<>();
        for (Character currentChar : chars) { // 'a'
            //  if (newChars.indexOf(currentChar) == -1) newChars.add(currentChar);
            // indexOf() -> returns the index of the element we are searching fo
            // and if the element does not exist then it returns -1 [negative one
            if (!newChars.contains(currentChar)) {
                newChars.add(currentChar);
            }
        }
    }
}
