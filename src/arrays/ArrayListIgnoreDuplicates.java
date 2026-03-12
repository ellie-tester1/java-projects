package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIgnoreDuplicates {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Chicago",
                "San Francisco",
                "Los Angeles",
                "Chicago",
                "San Francisco",
                "San Francisco",
                "Los Angeles"
        );
        System.out.println("First element: "  + cities.get(0));
        System.out.println("Second element: " + cities.get(1));
        System.out.println("Third element: " + cities.get(2));

        ArrayList<String> citiesNew = new ArrayList<>();
        for (String city : cities){
            if (citiesNew.contains(city))continue;
            else citiesNew.add(city);
        }
System.out.println(citiesNew);

    }
}
