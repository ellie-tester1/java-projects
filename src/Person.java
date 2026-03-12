public class Person {

    int height;
    char gender;
    int age;
    String nationality;

    //constructor => it does not return anything the name has match the class name

    public Person(int personHeight, char personGender, int personAge, String personNationality) {
  height = personHeight;
  gender = personGender;
   age = personAge;
   nationality = personNationality;

    }

    public static void main(String[] args) {

        //public Person(int h, char gender, int age, String nationality)
        Person Gulina = new Person(175, 'F', 37, "Kyrgyz");
        Person Jennifer = new Person (168, 'F', 43, "American");
        Person Habib = new Person (183, 'M', 25, "Arabic");

        System.out.println("Height of the person is: " + Gulina.height);
            System.out.println( "Her gender is: " + Gulina.gender);
            System.out.println("Her age is: " + Gulina.age);
            System.out.println( "Her nationality is: " + Gulina.nationality );
            System.out.println("========================================");
        System.out.println("Height of the person is: " + Jennifer.height);
        System.out.println( "Her gender is: " + Jennifer.gender);
        System.out.println("Her age is: " + Jennifer.age);
        System.out.println( "Her nationality is: " + Jennifer.nationality );
        System.out.println("========================================");
        System.out.println("Height of the person is: " + Habib.height);
        System.out.println( "His gender is: " + Habib.gender);
        System.out.println("His age is: " + Habib.age);
        System.out.println( "His nationality is: " + Habib.nationality );
        System.out.println("========================================");


    }
}
