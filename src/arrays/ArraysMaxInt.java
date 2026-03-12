package arrays;

public class ArraysMaxInt {
    public static void main(String[] args) {
        int[] numbers = {4, 3,-5, 0, -9};  //find the max number
        int max= 0;
        for (int i = 0; i < numbers.length; i++){
    if (max < numbers[i])
        max = numbers[i];
        }
        System.out.println("The max number is : " + max);




            int[] number = { 3,-5, 0, -9};  //find the min number
            int min = number[0]; // find min number
            for (int i = 0; i < number.length; i++){
                if (min > number[i])
                    min = number[i];
            }
            System.out.println("The min number is : " + min);
    }
}
