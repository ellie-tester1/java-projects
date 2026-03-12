package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJava {
    public static void main(String[] args) {

        Set<Character>marks = new TreeSet<>();
        marks.add('A');
        marks.add('D');
        marks.add('C');
        marks.add('F');
        marks.add('B');
        marks.add('E');
        System.out.println(marks);


        TreeSet<String> names = new TreeSet<>(Set.of("Barchynai", "Kennedy", "Zack", "Zalkar", "John", "Aizat"));
        System.out.println(names);

        // LinkedHashSet -> implements Set interface and stores unique elements only by ordering the elements in insertion order

        LinkedHashSet<Float> fractions = new LinkedHashSet<>();
        fractions.add(23.4f);
        fractions.add(333.444f);
        fractions.add(56.7f);
        fractions.add(23.4f);
        fractions.add(23.4f);
        fractions.add(12.6f);
        fractions.add(23.4f);
        fractions.add(-111.66f);
        fractions.add(-104.34f);
        System.out.println(fractions);

    }
}
