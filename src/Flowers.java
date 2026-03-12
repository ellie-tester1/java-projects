public class Flowers {

    String name;
    int height;
    String color;


    //constructor => it does not return anything the name has match the class name

    public Flowers (String flowerName, int flowerHeight, String flowerColor) {
        name = flowerName;
        height = flowerHeight;
        color = flowerColor;
    }

    public static void main(String[] args) {

        //public Flowers (String flowerName, int flowerHeight, String flowerColor)
        Flowers Rose = new Flowers("Rose",5,"Red");
        Flowers Peony = new Flowers("Peony", 3, "White");
        Flowers Dahlia = new Flowers("Dahlia", 4, "Pink");


        System.out.println("Name of the 1st Flower is: " + Rose.name
                + "\nHeight of the 1st flower is: " + Rose.height
                + "\nColor of the 1st flower is: " + Rose.color);
        System.out.println("========================================");
        System.out.println("Name of the 2nd Flower is: " + Peony.name
                + "\nHeight of the 2nd flower is: " + Peony.height
             + "\nColor of the 2nd flower is: " + Peony.color);
        System.out.println("========================================");
        System.out.println("Name of the 1st Flower is: " + Dahlia.name
                + "\nHeight of the 1st flower is: " + Dahlia.height
             + "\nColor of the 1st flower is: " + Dahlia.color);


    }
}
