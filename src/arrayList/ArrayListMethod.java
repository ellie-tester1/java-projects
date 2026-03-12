package arrayList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<String> classes = new ArrayList<>();
        classes.add("Algebra");
        classes.add("Chemistry");
        classes.add("Physics");
        classes.add("Geography");
        System.out.println("Available classes: " + classes);
        System.out.println("Is the arraylist empty? " + classes.isEmpty());

        // boolean contains(Object obj) -> checks whether the element exists in the arraylist
        // and of it exists then it returns true

        boolean hasHistoryClass = classes.contains("History");
        System.out.println("Does History exist as a class? " + hasHistoryClass);

        boolean hasGeographyClass = classes.contains("Geography");
        System.out.println("Does Geography exist as a class? " + hasGeographyClass);
        //void clear() -> removes and discards all the elements of the arraylist

        classes.clear();
        System.out.println("Is the arraylist empty after clearing? " + classes.isEmpty());


        //*** Task: Create an ArrayList for Fruits names and practice the following methods:
        // * - add()* - get() -> element at 3rd index
        // * - size() -> store it into int variable called 'fruitsSize'
        // * - remove(Object obj) -> remove 'Apple'
        // * - contains(Object obj)-> check if the fruitsList contains 'DragonFruit'


        ArrayList<String> vehicles1 = new ArrayList<>();
        vehicles1.add("Ford");
        vehicles1.add("Tesla");
        vehicles1.add("Nissan");
        vehicles1.add("BMW");
        System.out.println("Vehicles 1: " + vehicles1);

        ArrayList<String> vehicles2 = new ArrayList<>();
        vehicles2.add("Ford");
        vehicles2.add("Tesla");
        vehicles2.add("Nissan");
        vehicles2.add("BMW");
        System.out.println("Vehicles 2: " + vehicles2);
        System.out.println("Are vehicles list equal? " + vehicles1.equals(vehicles2));

        vehicles2.set(1, "Nissan");
        vehicles2.set(2, "Tesla");
        System.out.println("Vehicles1: After swapping Tesla and Nissan: " + vehicles1);
        System.out.println("Vehicles2: After swapping Tesla and Nissan: " + vehicles2);
        System.out.println("Are vehicles list equal after swapping? " + vehicles1.equals(vehicles2));


    }
}
