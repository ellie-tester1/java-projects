package StringMethodsInJava;

public class Stringmethod1 {
    public static void main(String[] args) {

        String carMake = "Mercedes";
        int indexOfCharD = carMake.indexOf('d');
        int indexOfSexondE = carMake.indexOf('e', 2);
        int indexOfThoirdE = carMake.indexOf('e', indexOfSexondE  +  1);
        char letyterC = carMake.charAt(4);
        String substringCed = carMake.substring(3, 6);

        System.out.println("Index of 'd': " + indexOfCharD);
        System.out.println("Index of 'e': " + indexOfThoirdE);
        System.out.println("Character at index 4: "+ letyterC);
        System.out.println("Substring 'Ced': "+ substringCed);

    }
}
