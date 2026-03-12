package oop.static_final;

public class Student {

    //instance variables - they belong to the objects of the class
    String firstName;
    String lastName;
    int age;
    static int  studentCount = 0; //  static variables belong to the claSS
    static  String schoolName = "Techstate Academy";   //constant variable - once initialized cannot be changed
    static  final  int maxAge = 100;

    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        if ( age < maxAge) {
            ;
            this.age = age;
        } else {
            System.err.println("Age has to be less than 100!");
        }
        studentCount++;  // post-increment
    }

    public void removeStudent(){
        System.out.println(firstName  + " " + lastName + " has been removed from the system!");
        String student = firstName.concat(" ").concat(lastName);
        firstName = "";
        lastName = "";
        age = 0;
        studentCount--;


    }
}
