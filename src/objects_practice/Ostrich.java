package objects_practice;

public class Ostrich {

    public static void main(String[] args) {
        Animal ostrich = new Animal ("Ostrich", "Bird", true, false, 4, 2);
        System.out.println("Name of animal: " + ostrich.name);
        ostrich.name = "" + ostrich.name.concat(" ") + "the First";
        System.out.println("New name of animal: " + ostrich.name);

        ostrich.name = "";
        System.out.println("New name of animal: " + ostrich.name);

        ostrich.name = "**"; ostrich.changeName(" Ostri");
        System.out.println("New name of animal: " + ostrich.name);
    }
}


