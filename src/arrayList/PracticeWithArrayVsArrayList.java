package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeWithArrayVsArrayList {
    public static void main(String[] args) {

        int[] agesArray = {12, 45, 34, 23, 78, 56};
        //to the agesArray we cannot add elements fixed size
        //accessing elements using [index] in a square brackets

        List<Integer> agesList = Arrays.asList(12, 45, 34,23, 78, 56);
        //size is adjustable, we can remove elements, we can add elements  at any index
        // it can only hold Objects,  it cannot hold primitive types

ArrayList list =new ArrayList();
list.add("String");
list.add(12);
list.add(true);

    }
}
