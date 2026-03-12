package MethodsInJava;

import java.util.Scanner;

public class InstanceMethodsWithString {

    public String greetPersonByName(String name) {
        return "Hello " + name;
    }

        public String printDayName ( int day) {
            String dayName = null;
            switch (day) {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                default:
                    dayName = "Not  a valid day number";
                    break;
            };
            return dayName;
            }

         public static void main(String[] args) {

        InstanceMethodsWithString obj = new InstanceMethodsWithString();
                String greetedPersonStr = obj.greetPersonByName("Injee!");
                System.out.println(greetedPersonStr);

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number for a day: ");
                int dayNumber = scan.nextInt();


                String dayName = obj.printDayName(dayNumber);
                System.out.println(dayName);

            }
        }



