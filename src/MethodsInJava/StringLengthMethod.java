package MethodsInJava;

public class StringLengthMethod {

    public static void main(String[] args) {

        String school = "Stanford";
        int lengthOfSchoolStr = school.length();
        System.out.println(school + " has " + lengthOfSchoolStr + " characters.");
        System.out.println("abcd".length());
        System.out.println("ABCD".length()+ 2 + "EF");
        System.out.println("Train" + 3 + "length".length() + 2 );
    }
}
