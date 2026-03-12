package set;

import java.util.Set;
import java.util.HashSet;

public class SetClass1 {
    public static void main(String[] args) {

        Set<String> collegeSet = new HashSet<String>();
        collegeSet.add("Harvard");
        collegeSet.add("Harvard");
        collegeSet.add("Stanford");
        collegeSet.add("Princeton");
        collegeSet.add("MIT");
        collegeSet.add("Princeton");
        collegeSet.add("Stanford");
        collegeSet.add("LACC");

        System.out.println(collegeSet);

        for (String collegeName : collegeSet){
            if (collegeName.startsWith("L"))
                System.out.println("Here is the college name starting with letter 'L': " + collegeName);
        }

        Set<Integer> numbers = new HashSet<>();
        boolean firstNumber = numbers.add(4);
        boolean secondNumber = numbers.add(5);
        boolean thirdNumber = numbers.add(5);

        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        System.out.println("Third number: " +thirdNumber);

        System.out.println(numbers);

        }

    }


