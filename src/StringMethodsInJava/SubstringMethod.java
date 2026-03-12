package StringMethodsInJava;

public class SubstringMethod {
    public static void main(String[] args) {

        String name = "Salman";

        String beginningTwoLetters = name.substring(0, 2);
        System.out.println(beginningTwoLetters);

        String secondHalf = name.substring(2);
        System.out.println(secondHalf);

        String city = "Los Angeles";
        System.out.println(city.substring(0, city.indexOf(" ")));
        System.out.println(city.substring(0, city.length()));

        String combinedStr = name.substring(0, 2)+ " " + city.substring(city.indexOf('A'));
        System.out.println(combinedStr);


    }
}
