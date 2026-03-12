package set;

import java.util.*;

public class SetOfDouble {
    public static void main(String[] args) {


        List<Double> tempList = Arrays.asList(56.77, 65.3, 45.0, 67.8, 67.8, 45.0, 56.77);
        Set<Double> tempSet = new HashSet<>(tempList);
        tempSet.addAll(tempList);

        System.out.println(tempSet);
    }
}
