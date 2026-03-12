package oop.method_overriding;

public class ExecutionClass {
    public static void main(String[] args) {

   Animal animal = new Animal();
   System.out.println("Animal object: ");
        animal.makeSound();

        Cat cat = new Cat();
        System.out.println("Cat object: ");
        cat.makeSound();

    }
}
