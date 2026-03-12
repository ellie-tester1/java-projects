import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {


        int dayNumber = 8;
        switch (dayNumber){
            case 0:
                System.out.println("It is Sunday");
       break;
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
            default:
                System.out.println("It's not a valid day number");
        }

//        int dayNumber = 4;
//
//        if (dayNumber == 0) {
//            System.out.println("It's Sunday");
//        } else if (dayNumber == 1){
//            System.out.println("It's Monday");
//        } else if (dayNumber == 2){
//            System.out.println("It's Tueday");
//        }
//        else if (dayNumber == 3){
//            System.out.println("It's Wendesday");
//        }
//        else if (dayNumber == 4){
//            System.out.println("It's Thursday");
//        }
//        else if (dayNumber == 5){
//            System.out.println("It's Friday");
//        }
//        else if (dayNumber == 6){
//            System.out.println("It's Saturday");
//        }else {
//            System.out.println("It's a valid da number");
//        }


        int seasonNumber = 1;
        switch  (seasonNumber){
            case 1 -> System.out.println("It's Winter");
            case 2 -> System.out.println("It's Spring");
            case 3 -> System.out.println("It's Summer");
            case 4 -> System.out.println("It's Autumn");
            default -> System.out.println("It's not a valid season number");
        }


        int season = 2;
        String seasonName = switch (season){
            case 1 -> "Winter";
            case  2 -> "Spring";
            case  3 -> "Summer";
            case 4 -> "Fall";
            default -> "Not a valid season number";
        };
        System.out.println("Season is: " + seasonName);



        int month = 3;
        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "Febraury";
            case 3 -> "March";
            case 4 -> "Apri;l";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "It's not a valid month number";
        };
            System.out.println("Month is: " + monthName);



            int num = 4;
            switch (num){
                case 1:
                System.out.println("It's a one");
                break;
                case 2 :
                    System.out.println("It's two");
                    break;
                case 3:
                    System.out.println("It's three");
                    break;
                case  4:
                    System.out.println("It's four");
                    break;
            }


        Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to our dinner, please select your title" +
                    " by entering: \n1 for Mr\n2 for Mrs\n3 for Ms");

            int title = scan.nextInt();
            System.out.println("Please eneter your name: ");
            String name = scan.nextLine();


            scan.close();
    }
}
