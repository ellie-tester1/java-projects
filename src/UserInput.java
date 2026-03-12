import java.util.Scanner;
import java.util.concurrent.*;
public class UserInput {
    public static void main(String[] args) {


        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "\n Get well soon!");


        System.out.println("Please enter a day of week using following ");
        String weekDayInput = scan.next().intern();
        if ( weekDayInput == "Mon"
        || weekDayInput == "Tue"
                || weekDayInput == "Tue"
                || weekDayInput == "Wed"
                || weekDayInput == "Thu"
                || weekDayInput == "Fri") {
            System.out.println("It is a weekday!");
        } else {
            System.out.println("It is a weekend yay!");
        }


    String fullName = "Ellie Musa"; //literal -> stored in String pool
        String fullNameObj = new String("Ellie Musa" ); //String object -> heap momery


        System.out.println("Please enter your age in numeric values: " );
         int age = scan.nextInt();

         if (age  > 12 && age < 20 ) System.out.println("You are a teenager!");
        else if (age  > 19 && age < 30 ) System.out.println("You are a twentieth!");
        if (age  > 29 && age < 40 ) System.out.println("You are a thirtieth!");
        if (age  > 39 && age < 50 ) System.out.println("You are a fortieth!");
        else System.out.println("You are wise now!");


        System.out.println("Please select the type of conversion: "+
         "\n Select '1' for C to F" +
         "\nSelect '2 for F to C");
        int selection = scan.nextInt();
        System.out.println("Please enter the temperature to be converted: ");
     int temp = scan.nextInt();
         double convertedTemp = 0;

         if ( selection == 1) {
             convertedTemp = (9 * temp) / 5 + 32;
             System.out.println(temp + "C is: " + convertedTemp + "F");    //F = (9/5) * (C + 32);
         }else {
             convertedTemp =(5 * temp)/ 9 - 32;
             System.out.println(temp + "F is: " + convertedTemp + "C");     //C = (5/9)* (F - 32);
     }


        scan.close();


    }
}
