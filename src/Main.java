import java.rmi.server.LogStream;

public class Main {

    public static void main(String[] args) {
        String God ="Allah";

        System.out.println("Hello, "+ God + "!" + "I wanna become smart, kind and rich person. " + God +
                "," + "I wanna help the poor people.Help me please" + "!" );

        int myFavoriteNumber = 777;
    System.out.println("My number is: " + myFavoriteNumber);

    int number = 999;
    System.out.println("My number is after: " + number + " and my number before: " + myFavoriteNumber);

   int a = 4;
   int b = 7;
   int sum = a+ b;
   System.out.println("Sum is: " + sum);

   int product = 5 * 6;
        System.out.println("Product of 5 * 6 = " + product);

        int result = 22 - 10;
        System.out.println(" Substruction result is: " +  result);

        int num1 = 20;
        int num2 = 10;

        int sumOfTwoNums = num1 + num2;
        int productOfTwoNums = num1 * num2;
        int divisionOfTwoNums = num1 / num2;
        int subtractOfTwoNums = num1 - num2;

        System.out.println(" Sum is: " + sumOfTwoNums );
        System.out.println(" Product is: " + productOfTwoNums );
        System.out.println(" Division is: " + divisionOfTwoNums );
        System.out.println(" Subtract is: " + subtractOfTwoNums );


        int num4 = 1;
        System.out.println("Num4 value in pre-increment: " + ++num4);

        int num5 = 5;
        System.out.println("Pre-decremented value og num5 is : " + --num5);


        int sumUnary = num5++ + 8;
        System.out.println("Sum of unary and addition: " + sumUnary);
        System.out.println("Num5 value is: " + num5);

        System.out.println("Is 2 less than 3: " + (2<3));
        System.out.println("Is 2 less than 3: " + (2>3));

        int cityPopulation = 2000000;
        String megaCity = "Mega City";
        String microCity = "Micro City";
        String cityType = (cityPopulation > 1000000) ? megaCity : microCity;
        System.out.println("City Type is: " + cityType);






    String education = "";
        if (education == "College") {
            System.out.println("Choose a college!");
        }else {
            System.out.println("Choose an University!");
        }


        int num7 = (int) 23;
        double num6 = 34;
        System.out.println("Our double data type num6 : " + num6);

        System.out.println((34 > 23) && false);
        


   String name = "Elnura";
   if (name == "Elnura"){
       System.out.println("Hello Elnura! Welcome to IT company!");
   }
   if (name == "Bakyt"){
            System.out.println("Hello Bakyt! Welcome to Football team!");
   }
   if (name == "Naima"){
            System.out.println("Hello Naima! Welcome to Gymnastic!");
   }
   if (name == "Salman"){
            System.out.println("Hello Salman! Welcome to Castelar school!");
   }
   if (name == "Ulukbek"){
            System.out.println("Hello Ulukbek! Welcome to University!");
   } else {
       System.out.println("Hello unknown person! Welcome!");
   }


   String dayOfWeek = "Mon";
        if (dayOfWeek == "Mon") {
            System.out.println("It`s a weekday. Keep working!");
        }
        if (dayOfWeek == "Tue") {
            System.out.println("It`s a weekday. Keep working!");
        }
        if (dayOfWeek == "Wed") {
            System.out.println("It`s a weekday. Keep working!");
        }
        if (dayOfWeek == "Thur") {
            System.out.println("It`s a weekday. Keep working!");
        }
        if (dayOfWeek == "Fri") {
            System.out.println("It`s a weekday. Keep working!");
        }
        if (dayOfWeek == "Sat") {
            System.out.println("It`s a weekend. Relax!");
        }
        if (dayOfWeek == "Sun") {
            System.out.println("It`s a weekend. Relax!");
        }





        String day = "Sun";
        if (day == "Mon" || day == "Tue" || day == "Wed" || day == "Thur" || day == "Fri")
            System.out.println("It`s a weekday. Keep working!");
        if (day == "Sat" || day == "Sun") {
            System.out.println("It`s a weekend. relax!");
        }



        String trafficLight = "Yellow";
        if (trafficLight == "Green") {
            System.out.println("It`s green, drive safe!");
        }
        if (trafficLight == "Yellow"){
            System.out.println("It`s yellow, prepare to stop!");
        }
        if (trafficLight == "Red") {
            System.out.println("It`s red, stop please!");
        }



//        String  trafficLight = "Yellow";
//        if (trafficLight == "Green") {
//            System.out.println("Light is green, go ahead and drive!");
//        }
//        if (trafficLight == "Yellow") {
//            System.out.println("Light is yellow, wait please!");
//        } else {
//            System.out.println("Light is red, please Stop!");
//        }


        String animal = "Giraffe",  habitat =" ";
        if (animal == "Tiger" || animal == "Lion" || animal == "Giraffe" && habitat == "Africa") {
            System.out.println("Wild animal");
        }
        if (animal == "Cat" || animal == "Dog" || animal == "Rabbit" && habitat == "Domestic") {
            System.out.println("Pet");
        }
        if (animal == "Salmon" || animal == "Tuna" || animal == "Whale" && habitat == "Ocean") {
            System.out.println("Fish");
        }


        int c1 = 222, c2 = 666, c3 = 7, maxOfThree = 0, minOfThree = 0;
        if (c1 > c2 && c1 > c3) maxOfThree = c1;
        if (c2 > c1 && c2 > c3) maxOfThree = c2;
        if (c3 > c1 && c3 > c2) maxOfThree = c3;
        System.out.println("Max of three number is: " + maxOfThree);



        if (c1 < c2 && c1 < c3) minOfThree = c1;
        if (c2 < c1 && c2 < c3) minOfThree = c2;
        if (c3 < c1 && c3 < c2) minOfThree = c3;
        System.out.println("Min of three number is: " + minOfThree);



        int randNum = 78;
        if (randNum < 0) System.out.println("Negative number");
        if (randNum > 0) System.out.println("Positive number");
        if (randNum == 0) System.out.println("Zero");

        if (randNum % 2 == 0) System.out.println("Even number");
        if (randNum % 2 == 1) System.out.println("Odd number");

        boolean hasColor = true;
        System.out.println("hasColor initially: " +hasColor);
        hasColor = false;
        System.out.println("hasColor: " +hasColor);
        hasColor = !hasColor;
        System.out.println("hasColor after negating false to true: " +hasColor);
        hasColor = !hasColor;
        System.out.println("hasColor after negating true to false: " +hasColor);


        boolean flag = true;
        System.out.println("Flag boolean before negation operationn : " + flag);
        flag = !flag;
        System.out.println("Flag boolean after negation operation: " + !flag);
        flag = !flag;
        System.out.println("Flag boolean after negation operation: " + !flag);


        int num9 = 9;
        System.out.println("Num9 value in pre-increment: " + ++num9);

        int num10 = 10;
        num10 = num10 + 3;
        System.out.println("Num10 is not equal to : " + num10);

        num10 = num10 + num9;
        System.out.println("Num10 after final post increment: " + num10);
        System.out.println("Num10 after final post increment: " + num10++);
        System.out.println("Num10 after final post increment: " + ++ num10);


        int num11 = 0;
        num11 = num11 + 1;  //0+1=1
        num11++;           // 1+1=2
        System.out.println(num11);
        System.out.println(++num11);    //2+2=3








    }
}