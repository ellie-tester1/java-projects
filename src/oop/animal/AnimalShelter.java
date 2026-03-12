package oop.animal;

public class AnimalShelter {
    public static void main(String[] args) {

        Fish fish1 = new Fish();
        //properties & behavior from Animal class
        fish1.name = "Salmon";
        fish1.type = "Atlantic";
        fish1.habitat = "Aquatic";
        fish1.weight = 12;
        fish1.hasLegs = false;
        fish1.eat();

        //properties & behavior from Fish class
        fish1.isMammal = false;
        fish1.swim();



        Bird bird1 = new Bird();
        bird1.name = "Grumphy";
        bird1.type = "Eagle";
        bird1.habitat = "Mountain";
        bird1.weight = 2;
        bird1.hasLegs = true;
        bird1.wingColor = "Brown/Black";
        bird1.fly();
        bird1.eat();
        bird1.release();


        Animal monkey = new Animal();
        monkey.name = "Marcel";
        monkey.release();
//        monkey.swim();
//        monkey.meow();
//        monkey.fly();

        Cat sphynxCat = new Cat();
        sphynxCat.name = " Sphynxer";
        sphynxCat.catBreed = "Sphynx";
        sphynxCat.habitat = " Urbamn";
        sphynxCat.type = "Domestic";
        sphynxCat.hasLegs = true;
        sphynxCat.meow();
        sphynxCat.release();
    }
}
