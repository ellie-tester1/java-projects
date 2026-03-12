package random_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.List;

public class RecapDataStructure {
    public static void main(String[] args) {

        //Difference between Array & ArrayList
        //Array - fixed size vs ArrayList - flexible size (can grow/shrink)
        //Array stores primitive types(int, char etc) and String vs ArrayList stores object reference types
        // Array is a class vs ArrayList implements List interface
        //Array has less memory vs ArrayList has more memory
        //Array is available only basic operations(manual manipulation) vs ArrayList - rich methods ( add(), remove(), contain(),etc)

        List<String> cities = Arrays.asList("Chicago", "Los Angeles", "New York");
        System.out.println(cities.get(1));

        ArrayList<Character> letters = new ArrayList<>();
        int num = 7;
        Integer wrapperNum = num; //auto boxing -> converts the primitive to Wrapper type[Object]
        int primitiveNum = wrapperNum; // auto unboxing -> converts Wrapper to primitive

        // Big "0" notation for 'Time Complexity':
        // 0(1) -> Big "0" of one, it's called 'constant' time complexity [Array, ArrayList, HashMap, Has
        // O(n) -> Big "0" of 'n', it's called 'linear' time complexity [one loop]
        // O(n^2) -> Big "0" of 'n' squared, it's called 'quadratic' time complexity [nested loops]
        // String vs String Builder:
       //1. StringBuilder is mutable vs String is immutable
        // 2. StringBuilder has a reverse() method vs String does not support
        // 3. StringBuilder uses append() vs String uses concat()

        StringBuffer sb = new StringBuffer();  // mutable - thread safe
        sb.append("Techstate Academy");
        sb.reverse();

    }
}
