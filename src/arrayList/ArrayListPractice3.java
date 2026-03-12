package arrayList;

import java.util.ArrayList;

public class ArrayListPractice3 {
    public static void main(String[] args) {

        ArrayList<String> citylist = new ArrayList<>();
        citylist.add("Chicago");
        citylist.add("Los Angeles");
        citylist.add("Boston");

        char middleCharOfChicago = citylist.get(0).charAt(citylist.get(0).length()/2);
        System.out.println("Middle char of Chicago is : " + middleCharOfChicago);
        char middleCharOfLosAngeles = citylist.get(1).charAt(citylist.get(1).length()/2);
        System.out.println("Middle char of Los Angeles is : " + middleCharOfLosAngeles);
        char middleCharOfBoston = citylist.get(2).charAt(citylist.get(2).length()/2);
        System.out.println("Middle char of Boston is : " + middleCharOfBoston);
        System.out.println("=====================================");


        String firstCity = citylist.get(0);
        System.out.println("First city is :" + firstCity);
        char firstCharChicago = firstCity.charAt(0);
        System.out.println("First char of Chicago is: " + firstCharChicago);


        String secondCity = citylist.get(1);
        System.out.println(secondCity);
        char firstCharLosAngeles = secondCity.charAt(0);
        System.out.println("First char of Los Angeles is: " + firstCharLosAngeles);
    }
}
