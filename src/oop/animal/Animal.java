package oop.animal;

public class Animal {
    String name;
    String type;
    int weight;
    String habitat;
    boolean hasLegs;
    boolean isReleased = false;


    public void eat(){
        System.out.println(name + " is eating!");
    }

    public void release() {
        isReleased = true;
        System.out.println(name + " has been released from the Shelter.");

    }


}
