package MethodsInJava;


public class Dish {


        String name;
        String[] ingredients;
        double price;
        double calories;

        public Dish(String name, String[] ingredients, double price, double calories) {
            this.name = name;
            this.ingredients = ingredients;
            this.price = price;
            this.calories = calories;
        }

        public static void main (String[]args){

            String[] plovIngredients = {"rice", "meat", "carrot", "oil", "onion"};
            Dish plov = new Dish("Uzbek Plov", plovIngredients, 16.99, 1300);

            String[] pastaIngredients = {"tomato", "meat", "cheese", "olive oil", "onion"};
            Dish pasta = new Dish("Italian pasta", pastaIngredients, 21.99, 1800);

            plov.updatePrice(18.99);
            pasta.updatePrice(30.99);
        }

        // create a void method to update the price of the dish  belongs to the objects of this class

        public void updatePrice(double newPrice) {
            printPrice("before");
            this.price = newPrice;
            printPrice("after");
        }
        public void printPrice (String beforeOrAfter){
            System.out.println("The price of " + name + " " + beforeOrAfter + " updating: $" + this.price);

        }
    }

