package arrays;

import java.util.Arrays;

public class JavaArrayIntro {
    public static void main(String[] args) {

        char[] letters = new char[6];
        letters[0] = 'a';
        letters[1] = 'b';
        letters[5] = 'f';
        letters[4] = 'e';
        letters[3] = 'd';
        letters[2] = 'c';


        System.out.println(Arrays.toString(letters));
        System.out.println(letters[1]);
        System.out.println(letters[4]);

        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        System.out.println(Arrays.toString(vowels));
        System.out.println(letters[3]);


        int[] nums = new int[4];
        nums[0] = 4;
        nums[1] = 9;
        nums[2] = -24;
        nums[3]= 33;

        boolean[] isValid = new boolean[] {true, true, false, true};

        String [] cities = new String[] {"Tokiyo", "New York", "Los Angeles", "Chicago"};
        System.out.println(Arrays.toString(cities));

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Current index i: " +i);
            System.out.println(cities[i]);
        }



    }
}
