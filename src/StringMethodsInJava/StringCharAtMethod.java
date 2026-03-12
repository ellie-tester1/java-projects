package StringMethodsInJava;

public class StringCharAtMethod {
    public static void main(String[] args) {
        //String.charAt(index) -> returns a character at specified index ex;String name = "Maha";
        String name = "Naima";
        char firstLetter = name.charAt(0);
        char secondLetter = name.charAt(1);
        char thirdLetter = name.charAt(2);
        char fourthLetter = name.charAt(3);
        System.out.println("The first character is: " + firstLetter);
        System.out.println("The second character is: " + secondLetter);
        System.out.println("The third character is: " + thirdLetter);
        System.out.println("The fourth character is: " + fourthLetter);

        int lastLetter = name.charAt(name.length()-1);

    System.out.println("The last character is: " + lastLetter);
    System.out.println((name.length())-2/2);


    }
}
