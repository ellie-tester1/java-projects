package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CakeHashSet {
    public static void main(String[] args) {
        Cake honeyCake = new  Cake("Honey Cake", 8, 59.99, Arrays.asList("Honey", "Sugar", "Butter", "Eggs"));
        Cake napoleon = new  Cake("Napoleon", 12, 99.99, Arrays.asList("Cream", "Sugar", "Veggie Oil","Butter", "Eggs"));
        Cake cheeseCake = new  Cake("Cheesecake", 10, 89.99, Arrays.asList("Cheese", "Sugar", "Butter", " Heavy Whip Cream",
                "Cookie", "Eggs"));
        Cake pancho = new  Cake("Pancho", 8, 199.99, Arrays.asList("Cacao", "Chocolate", "Sunflower Oil", "Butter", "Eggs"));
        Cake pancho1 = new  Cake("Pancho", 8, 199.99, Arrays.asList("Cacao", "Chocolate", "Sunflower Oil", "Butter", "Eggs"));
        Cake pancho2 = new  Cake("Pancho", 8, 199.99, Arrays.asList("Cacao", "Chocolate", "Sunflower Oil", "Butter", "Eggs"));
        Cake pancho3 = new  Cake("Pancho", 8, 199.99, Arrays.asList("Cacao", "Chocolate", "Sunflower Oil", "Butter", "Eggs"));

        Set<Cake> cakeSet = new HashSet<>();
        cakeSet.add(honeyCake);
        cakeSet.add(napoleon);
        cakeSet.add(cheeseCake);
        cakeSet.add(pancho1);
        cakeSet.add(pancho2);
        cakeSet.add(pancho3);
        cakeSet.add(pancho);

        for (Cake cake : cakeSet){
            System.out.println(cake.toString());
        }
    }
}
