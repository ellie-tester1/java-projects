public class RelationalOperators {
    public static void main(String[] args) {

//   > -greater  than
//   < - less  than
//   <= - less than or equal to
//    >= - greater than or equal to
System.out.println("Is 5 less  than 7 : " + (5<7));
System.out.println("Is 10 greater  than 15 : " + (10>15));


boolean  isless = true;
boolean isTwoLessThanThree = 2<3;
System.out.println("2 < 3 " + isTwoLessThanThree);

boolean isGreaterOrEqual = 5>=5;
System.out.println("5 >= 5 " +isGreaterOrEqual);

boolean isLessOrEqual = 20 <= 15;
System.out.println("20 <= 15  " + isLessOrEqual);

   boolean x = false, y = true;
        System.out.println( "x || y  " +(x || y));
        System.out.println("x & y  " +(x&y));
        System.out.println("x - " +x);
        System.out.println("y -  " +y);


        boolean a = true, b = false;
        boolean logicalOperation = a | b;
        System.out.println("a | b  " +logicalOperation);

     boolean result = true && false; //false
        boolean result1 = false && false; //false
        boolean result2  = true && true; //true
        boolean result3 =false &&true; //false

        boolean result4 =false || true; //true
        boolean result5 = true || false; //true
        boolean result6 = false || false; //false
        boolean result7  = true || true; // true








    }
}
