package arrays;

public class WrapperClassIntro {
    public static void main(String[] args) {

int leapYear = 2020; // primitive type
        Integer leapYearObj = Integer.valueOf(leapYear);  // converted to reference type
        String leapStr = leapYearObj.toString();   //converted the reference type to string

        String leapYearStr1 = String.valueOf(leapYear);   //using valueof() method from String class
        String leapYearStr2 = "" + leapStr;  //using concatinationb which by default, convert any data type string when concatenation

        String leapYearStr3 = Integer.toString(leapYear); // using toString() from Integer class



    }
}
