package arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        char[] letters =  new char[6];
        letters[0] = 'a';
        letters [1]= 'b';
        letters [2] = 'c';
        letters [4] = 'e';
        letters [3] = 'd';
        letters [5] = 'f';


        System.out.println(Arrays.toString(letters));
        System.out.println(letters[4]);
        System.out.println(letters);



        char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u'};
        System.out.println(vowels[2]);

        char char0 = vowels[3];
            System.out.println(char0);



            String[] cities =  new String[] {"Tokyo", "Los Angeles", "New York", "Ulaan Baatar"};
            System.out.println(Arrays.toString(cities));

             for ( int i = 0; i < cities.length; i++){
                 System.out.println(cities[i]);
             }




    }
}
