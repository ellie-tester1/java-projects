package MethodsInJava;

public class AudioPlayer {
    String brand = "Apple";
    String color = "Silver";
    int makeYear = 2011;

    static int count =10;


        public void playMusic(){
            System.out.println("Music started playing!");
        }

        public void stopMusicPlay(){
            System.out.println("Music has stopped!");
        }

        public void recordMusic(){
            System.out.println("Recording the Music!");
        }

    public static void turnOnPlayer() {
    System.out.println("Player has turned on!");
    }
    public static void turnOffThePlayer(){
            System.out.println("Player has been turned off!");
    }

    public static void main(String[] args) {
        // public  -> access modifier that can be accessed from other classes as well within the same package
        // static -> optional specifier and, it makes this method  belong to the class, not to the object
        // void -> means that this method does not return anything
        // main -> is a keyword reserved for main method in java. Main method is execution or starting point of java  application

        AudioPlayer.turnOnPlayer();
 // we are creating an object/instance of AudioPlayer class
        AudioPlayer playerObject = new AudioPlayer();
        playerObject.recordMusic();
        playerObject.playMusic();
        playerObject.stopMusicPlay();

        String brandOfPlayer = playerObject.brand;
        System.out.println("Player brand is: " +brandOfPlayer);

        AudioPlayer.turnOffThePlayer();
        System.out.println("Quantity of the Player is: " + AudioPlayer.count);

        String playerColor = playerObject.color;
        System.out.println("Color of the Player is: "+ playerColor);

        int yearOfPlayer = playerObject.makeYear;
       System.out.println("The Audio Player is: "+ yearOfPlayer + " year");

       int ageOfPlayer = 2024 - playerObject.makeYear;
       System.out.println("Age of Audio Player is: "+ ageOfPlayer + " y.o.");

    }
}
