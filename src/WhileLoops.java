import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

     int i = 1; //created a variable name 'i'  in integer type and assigned 1 to it as a value
        String name = "Naima";    // creating a String variable named name assigned "Naima"  as a value
      double pi = 3.14;   // creating a variable  'pi'  in double data type and assigned 3.14 as a value
     float temp = 88.7f;  // created a variable 'temp' in float data type and assigned 88.7 as a value
      String greet = "Hello all!";  //created a variable 'greet' in String type and assigned "Hello all!" as a value
        Scanner scan = new Scanner(System.in); // created  an object of Scanner type
        int a = 1;   //created a variable name 'a' in integer type and assigned 1 to it as a value

        while ( i <= 10){
            System.out.println(i);
           i++;
        }

        int counter = 1;
        String myName = "John";
        while (counter < 11) {
            System.out.println(counter + ": My name is " + myName);
            counter++;
        }


        int count = 1;
        while ( count < 6) {
            if (count % 2 == 0)     System.out.println(count + ": Even number");
            else System.out.println(count + ": Odd number");
            count++;
        }


        int counter2 = 1;
        boolean flag = true;
        while (flag == true){
            if (counter2 > 15){
                flag =false;
            }
        System.out.println(counter2 + ": Flag is -> " + flag);
            counter2++;
        }









    }
}
