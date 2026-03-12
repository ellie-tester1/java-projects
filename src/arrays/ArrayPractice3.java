package arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {
        String[] cities = {"Bishkek", "Ulaan Baatar", "Tokyo", "Osh"};

        int a = cities[2].length();
        System.out.println("The length of Tokyo: " +a);

        int cityLength = cities.length;
        System.out.println("The length of cities array is: " +cityLength);

        System.out.println(cities[1].charAt(6)); // B
        System.out.println(cities[0].charAt(2)); // from Bishkek   s
        System.out.println(cities[2].charAt(0)); //Tokyo  -> T
        System.out.println(cities[1].toLowerCase()); //ulaan baatar

        String city = cities[3].toUpperCase();
        int lenTokyo = cities[2].length();
        char charH = cities[0].charAt(3);
        String baatar =cities[1].substring(6);
        int cityLenPlusThree = cities[cities.length-1].length() +3; //6

        System.out.println("He solved city to upper case: " + city);
        System.out.println("He solved city Tokyo length: " + lenTokyo);
        System.out.println("He solved character H from Bishkek: " + charH);
        System.out.println("hE solved substring for Baatar: " + baatar);
        System.out.println("He solved Osh length + 3= : " +cityLenPlusThree);
    }
}
