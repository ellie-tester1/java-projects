package arrays;

import java.util.Arrays;

public class ArrayAddValueToElement {
    public static void main(String[] args) {

        int[] year ={1765, 1342, 1987, 1654};
        //add 2 to each element
        for (int i = 0; i < year.length; i++) {
            year[i] += 2;
        }
            System.out.println(Arrays.toString(year));

String name ="Techstate";
boolean containsLetterC = name.contains("c");
System.out.println("Does "+ name + " contain letter 'c'? "+containsLetterC);

    }
}
