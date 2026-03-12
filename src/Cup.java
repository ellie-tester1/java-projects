public class Cup {
    int height;
    String color;
    String material;


    public Cup(int cupHeight, String cupColor, String cupMaterial) {

        height = cupHeight;
        color = cupColor;
        material = cupMaterial;
    }

     public static void main(String[] args) {
        Cup whiteCup =  new Cup(5, "white", "paper");
         Cup greenCup =  new Cup(6, "green", "wood");
         Cup yellowCup =  new Cup(7, "yellow", "metal");

         System.out.println("Height of the cup: " + whiteCup.height);
         System.out.println("Color of the cup: " + whiteCup.color);
         System.out.println("Cup is made of " + whiteCup.material);
         System.out.println("========================================");
         System.out.println("Height of the cup: " + greenCup.height);
         System.out.println("Color of the cup: " + greenCup.color);
         System.out.println("Cup is made of " + greenCup.material);
         System.out.println("========================================");
         System.out.println("Height of the cup: " + yellowCup.height);
         System.out.println("Color of the cup: " + yellowCup.color);
         System.out.println("Cup is made of " + yellowCup.material);
         System.out.println("========================================");

     }
 }

//class Cup {
//    String color;
//    int height;
//    String material;
//
//    // Constructor
//    Cup(String color, int height, String material) {
//        this.color = color;
//        this.height = height;
//        this.material = material;
//    }
//
//    // Method to display cup details
//    void displayCupDetails() {
//        System.out.println("Color: " + color + ", Height: " + height + ", Material: " + material);
//    }
//}
//
//    public Main {
//    public static void main(String[] args) {
//        // Create instances of Cup
//        Cup cup1 = new Cup("White", 5, "Metal");
//        Cup cup2 = new Cup("Green", 6, "Paper");
//        Cup cup3 = new Cup("Yellow", 7, "Wood");
//
//        // Display details of each cup
//        cup1.displayCupDetails();
//        cup2.displayCupDetails();
//        cup3.displayCupDetails();
//    }
//}




