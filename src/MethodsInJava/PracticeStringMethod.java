package MethodsInJava;

public class PracticeStringMethod {
    public static void main(String[] args) {

        String str = "Sentence";
        printCharacters(str);
    }
    public  static  void printCharacters(String s){
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));
//        System.out.println(s.charAt(4));
//        System.out.println(s.charAt(5));
//        System.out.println(s.charAt(6));
//        System.out.println(s.charAt(7)); OR->

//        for (int i = 0; i < s.length(); i++){
//        System.out.println(s.charAt(i));       //OR ->

//            for (int i = 0; i < s.length(); i++){
//                System.out.print(s.charAt(i) + " "); OR-.

        for (int i = 0; i < s.length(); i++){
            System.out.print(i + ": " + s.charAt(i) + ", ");

        }

    }
}
