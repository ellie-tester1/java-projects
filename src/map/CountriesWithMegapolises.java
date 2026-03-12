package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountriesWithMegapolises {
    public static void main(String[] args) {

        Map<String, String[]> countriesAndMegapolises = new HashMap<>();

        String[] usaCities = {"Chicago", "New York", "San Francisco", "Los Angeles"};
        String[] turkeyCities = {"Istanbul", "Ankara", "Izmir"};
        String[] russianCities = {"Moscow", "Saint Petersburg", "Ekaterinburg", "Samara"};
        String[] koreanCities = {"Busan", "Seoul", "Inch-hong"};
        String[] ukranianCities = {"Kiev", "Lyviv", "Odessa"};

        countriesAndMegapolises.put("USA", usaCities);
        countriesAndMegapolises.put("Turkey", turkeyCities);
        countriesAndMegapolises.put("Russia", russianCities);
        countriesAndMegapolises.put("South Korea", koreanCities);
        countriesAndMegapolises.put("Ukraine", ukranianCities);
        countriesAndMegapolises.put("Mongolia", new String[]{"Ulaan Baatar"});

        // since each key has a value as an Array we have to use Arrays.toString() to print the values
        System.out.println(Arrays.toString(countriesAndMegapolises.get("USA")));

        // in order to access the elements of the array for each key, we have to use index for element accessing
        System.out.println(countriesAndMegapolises.get("Turkey")[0]);
        
        // in order to access the last element of the array from the map we have to first
        // access the value by key then only we can access the element using index
        int lengthOfRussianCitiesArray = countriesAndMegapolises.get("Russia").length;

            String citySamara = countriesAndMegapolises.get("Russia")[lengthOfRussianCitiesArray-1];}

    }

