package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapCollectionPractice {
    public static void main(String[] args) {

        Map<String, Integer> ageData = new HashMap<>();

        // entry in a map collection means -> key-value pair
        ageData.put("Donal Trump", 77);
        ageData.put("Bill Gates", 68);
        ageData.put("Justin Bieber", 30);
        ageData.put("Kimberly Kardashian", 43);
        ageData.put("Sam Altman", 39);
        ageData.put("Mark Zuckerberg", 39);

        System.out.println("Sam Altman is: " + ageData.get("Sam Altman") + " years old");


        // Create a function/method that takes the age of the person
        // as a parameter and return the year
        // person was born in.
        // EX: findYearBorn(68)

        int kimsBornYear = (ageData.get("Kimberly Kardashian")); //find Born Year
        System.out.println("Kim Kardashian was born in: " + kimsBornYear);
        // keySet() -> method is used for returning the list of keys from a
        // map collection, and it stores the keys in a Set collection
        //Set<String> keysOfAgeDataMap = ageData.keySet();
        //System.out.println(keysOfAgeDataMap);
        System.out.println("All the keys in 'ageData' map: \n" + ageData.keySet());
        for (String name : ageData.keySet()) {
            System.out.println(name + " is " + ageData.get(name) + " years old.");
        }
        // Task: Write a method which takes a map of String, Integer entry data
        // and prints out the keys whose values are even number
        printEvenAgeNames(ageData);
    }

    public static void printEvenAgeNames(Map<String, Integer> mapOfNamesWithAge) {
        for (String nameOfPerson : mapOfNamesWithAge.keySet()) {
            int age = mapOfNamesWithAge.get(nameOfPerson);
            if (age % 2 == 0) {
                System.out.println(nameOfPerson + " is " + age);
            }
        }
    }

        public static int findYearBorn ( int age){
            int currentYear = 2024;
            return currentYear - age;
        }
    }







