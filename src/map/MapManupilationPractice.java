package map;
import java.util.HashMap;
import java.util.Map;

public class MapManupilationPractice {
    public static void main(String[] args) {

          Map<String, Integer> countryPopulation = new HashMap<>();
          countryPopulation.put("Japan", 125_000_000);
          countryPopulation.put("Netherlands", 17_671_125);
          countryPopulation.put("Canada", 41_000_000);
          countryPopulation.put("Norway", 5_457_000);
          countryPopulation.put("Egypt", 111_000_000);

          countryPopulation.put("Japan", countryPopulation.get("Japan") + 10_000);
          countryPopulation.put("Norway", countryPopulation.get("Norway") + 5_000);
          int egyptPopulation = countryPopulation.get("Egypt");
          System.out.println(egyptPopulation);

          countryPopulation.put("Egypt", egyptPopulation + 20_000);

          for (String country : countryPopulation.keySet()) {
              if (countryPopulation.get(country) > 100_000_000) {
                  System.out.println(country);
              } }
          // Task: Because of pandemic each country has lost about 50,000 people
            // update the existing maps population value by taking that amount out


    }
}
