package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class  ArrayListInputFrom {


    public static void main(String[] args) {


        ArrayList<String> guesList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi there! \n How many guests in your group?");
        int numberOfGuests = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfGuests; i++) {
            System.out.println("Please  enter the name of guest # " + (i + 1) + ": ");
            String guestName = sc.nextLine();
            guesList.add(guestName);
        }
        System.out.println("There are the guest list: " + guesList);




        sendOutInvitation(guesList);
    }

    public static void sendOutInvitation(ArrayList<String> guests){
            for (String name : guests) {
                String message = "Hello " + "! We are very excited to see you on our" +
                        "upcoming party on Saturday at 5:00 PM. "+
                        "We hope you join us and enjoy the party!" +
                        "Thank you, \n Elnura Musaeva";
                System.out.println(message);

            }
        }
}

