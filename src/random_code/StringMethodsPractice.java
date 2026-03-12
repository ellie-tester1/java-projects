package random_code;

import java.util.HashMap;
import  java.util.Map;

public class StringMethodsPractice {
    public static void main(String[] args) {

        //Create a method that prints each letter of the string
        //Ex; String school = "Harvard";
        //Expected output: 'H', 'a', 'r', 'v', 'a', 'r', 'd'

        String school = "H9arv2ard7";
        printLetters(school);


        //Creates a method which takes a String and A target character
        //return how many times the target char appears in the String
        //Ex; "Harvard", 'a' -> 2
        //When I call the method it should look like this:
        //getCountOfChar("Stanford", 'f')
 System.out.println("\nThe number of Digits: " + countDigits(school));
 System.out.println("All the digits from the String: " +getNumbers(school));
 System.out.println("Sum of digits: " + getSumOfDigits(school));

    }
    private static void  printLetters(String word){
        for (int i = 0; i < word.length(); i++){
            char curChar = word.charAt(i);
            if (i < word.length()-1)System.out.print(curChar + ", ");
            else System.out.print(curChar);
        }
    }


    public static int countDigits (String str){
        int counter = 0;
        for (int i=0; i < str.length(); i++){
            char curChar = str.charAt(i);
            if (Character.isDigit(curChar)) counter++;
        }
        return counter;
    }

    public static String getNumbers(String str){
        StringBuilder numbersStr = new StringBuilder();
        for (int i=0; i < str.length(); i++){
            char curChar = str.charAt(i);
            if (Character.isDigit(curChar)) numbersStr.append(curChar);
        }
        return numbersStr.toString();
    }

    public static int getSumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            char curChar = str.charAt(i);
            if (Character.isDigit(curChar)) {
                int numValue = Integer.parseInt(String.valueOf(curChar));
                sum += numValue;
            }
        }
        return  sum;
    }
}
