package arrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); // to add elements into an ArrayList we use add() method which takes a parameter as element
         list1.add(3);
         list1.add("Word");
         list1.add(true);
         list1.add('c');
         System.out.println(list1);


         int a = (int) list1.get(0) + 2; // String str = list1.get(1).concat("Hello");
         ArrayList<String> names = new ArrayList<String>();
         names.add("Dinara");
         names.add("Ziada");
         names.add("Injee"); // names.add(1); -> since our names arraylist is String type, we cannot add() int
         System.out.println("The names: " + names);
         System.out.println("First person name: " + names.get(0));
         System.out.println("Second person name: " + names.get(1));

         ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(13);
         numbers.add(24);

         int firstNumber = numbers.get(0); // unboxing -> java automatically converts 'Integer' to 'int'
        // ArrayList<int> nums = new ArrayList<int>(); -> ArrayList supports only wrapper classes (objects)
        ArrayList<Double> temperatureList = new ArrayList<>();
        temperatureList.add(74.3);
        temperatureList.add(67.8);
        temperatureList.add(45.3); // get() method is used to retrieve the elements of an ArrayList by it's index

         double secondDayTemp = temperatureList.get(1);
         System.out.println("The second day temp: " + secondDayTemp);


         // to get the length/size of the ArrayList we use size() method
        int sizeOfTemperatureList = temperatureList.size();
        System.out.println("The size of temperature list is: " + sizeOfTemperatureList);

        // to add elements at desired index I can use add() method by providing the data and index
        temperatureList.add(1, 55.8);
        System.out.println("After adding 55.8 at index 1: " + temperatureList);


    
    }
}
