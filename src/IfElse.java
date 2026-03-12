public class IfElse {
    public static void main(String[] args) {
        int a = 5;
        boolean isFive = a == 8;
        if (isFive) {
            System.out.println("It`s five!");
        } else {
            System.out.println("It is not five!");
        }


        int num = 38;
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }


        int floorNumber = 7;
        String direction = "right";
        String numberType = "";
        String turnedDirection = "";

        if (floorNumber % 2 == 0) {
            numberType = "even";
            if (direction == "right") {
                turnedDirection = "right";
            } else {
                turnedDirection = "left";
            }
        } else {
            numberType = "odd";
            if (direction == "left") {
                turnedDirection = "left";
            } else {
                turnedDirection = "left";
            }
        }
        System.out.println("You are on the floor number " + floorNumber + " and it is " + numberType + ". You turned " + turnedDirection);


        char letter = 'h';
        String letterType = "consonant";

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
                || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            letterType = "vowel";
        }
        System.out.println("The letter: '"  + letter + "' is a " + letterType);




        int dayNumber = 4;

        if (dayNumber == 0) {
            System.out.println("It's Sunday");
        } else if (dayNumber == 1){
            System.out.println("It's Monday");
        } else if (dayNumber == 2){
            System.out.println("It's Tueday");
        }
        else if (dayNumber == 3){
            System.out.println("It's Wendesday");
        }
        else if (dayNumber == 4){
            System.out.println("It's Thursday");
        }
        else if (dayNumber == 5){
            System.out.println("It's Friday");
        }
        else if (dayNumber == 6){
            System.out.println("It's Saturday");
        }else {
            System.out.println("It's a valid da number");
        }



    }
}
