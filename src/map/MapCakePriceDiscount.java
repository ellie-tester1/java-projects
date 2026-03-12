package map;

import java.util.HashMap;
import java.util.Map;

public class MapCakePriceDiscount {
    public static void main(String[] args) {

        // Task: Cake shop decided to take 30% of the price for the Easter Egg holiday and all cake prices are stored in the Map collection
        // update all cake prices to be less by 30% than it's original

        Map<String, Double> cakePrices = new HashMap<>();

        cakePrices.put("Tiramisu", 65.00);
        cakePrices.put("Napoleon", 55.00);
        cakePrices.put("Chocolate", 60.00);

        for (String cakeName : cakePrices.keySet()) {
            double originalPrice = cakePrices.get(cakeName);
            double discountedPrice = originalPrice * 70 / 100;
            System.out.println(cakeName + " was: $" + originalPrice + " and now it's only: $" + discountedPrice + "! Yayy!");
            //cakePrices.put(cakeName, discountedPrice); } } }


        }
    }
}
