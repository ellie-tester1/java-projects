package arrayList;

import java.util.ArrayList;

public class PersonArrayList {
    public static void main(String[] args) {
        Person person1 = new Person("Dinara", 'F', 18);
        Person person2 = new Person("Mahabat", 'F', 22);
        Person person3 = new Person("Zack", 'M', 38);
        Person person4 = new Person("Kevin", 'M', 67);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        for (Person person : people) {
            System.out.println(person.getName());
            System.out.println("======================");
        }
    }
}
