package StringMethodsInJava;

public class StringIndexOfMethod {
    public static void main(String[] args) {
        String name = "Bakyt";

        System.out.println(name.indexOf('k')); //2
        System.out.println(name.indexOf('B')); //0
        System.out.println(name.length() + name.indexOf('a', '2'));
        System.out.println(name.length() + name.charAt(1)); //104


    }
}
