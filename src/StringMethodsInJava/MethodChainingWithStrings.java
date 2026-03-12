package StringMethodsInJava;

public class MethodChainingWithStrings {
    public static void main(String[] args) {
        String mount = "everest";
        int count = 0;
        for (int i =0; i < mount.length(); i++){
            char curChar = mount.charAt(i);
            if (curChar == 'e') count++;
        }
        System.out.println("The number of times 'e' appears is: " +count);


    }
}
