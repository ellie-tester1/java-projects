package arrays;

import java.util.Arrays;

public class ArrayEqualsMethod {
    public static void main(String[] args) {

        String[] cities1 = {"Chicago", "New York", "San Francisco"};
        String[] cities2 = {"Chicago", "New York", "San Francisco"};

        System.out.println("Are they poiting to the same memory location? " + cities1.equals(cities2));

        String[] cities3 = cities1;
        System.out.println("Are they poiting to the same memory location? " + cities1.equals(cities3));

        cities3[2] = "Boston";
        System.out.println(Arrays.toString(cities1));
        System.out.println(Arrays.toString(cities3));
    }
}
