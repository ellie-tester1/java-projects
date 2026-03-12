package arrays;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        System.out.println("Before: " + Arrays.toString(numbers));

        numbers[0] =7;
        System.out.println("Added 7: " + Arrays.toString(numbers));
        numbers[2] =6;
        System.out.println("Added 6 to index 2: " + Arrays.toString(numbers));
        numbers[1] =10;
        System.out.println("Added 10: " + Arrays.toString(numbers));
        numbers[3] = 15;
        System.out.println("Added 15 to index 2: " + Arrays.toString(numbers));

}
}
