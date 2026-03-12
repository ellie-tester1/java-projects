import java.util.Scanner;

public class WhileLoopWithScanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);   //created an object of Scanner type called scan
        System.out.println("Do you want me to continue printing numbers?\n" + "Select:  \n1 for Yes\n2 for No");
        int userInput = scan.nextInt();
        int counter = 1;

        while ( userInput == 1)
            System.out.println("Keep printing: " + counter);
        System.out.println("Do you want me to continue printing numbers?\n" + "Select:\n1 for Yes\n2 for No");
        userInput = scan.nextInt();
        counter++;





    }
}
