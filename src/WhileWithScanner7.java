import java.util.Scanner;

public class WhileWithScanner7 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Hello player!\nIf you want to guess my lucky number then enter here: ");
        int userInput =scan.nextInt(), luckyNumber = 7;

        while ( userInput != luckyNumber){
            System.out.println( userInput + " - No, it is not lucky number, try again: " );
            userInput = scan.nextInt();
        }
        System.out.println("Yes, you guessed it correct. My lucky number is: " + userInput);



        String name = "Elnura";
        System.out.println("The length of the name Elnura is: " + name.length());


    }
}
