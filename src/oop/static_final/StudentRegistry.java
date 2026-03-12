package oop.static_final;

public class StudentRegistry {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Doe", 23);
        Student student2 = new Student("Tom", "Thomas",20);
        Student student3 = new Student("John", "Dayan", 19);
        Student student4 = new Student("Elnura", "Musaeva",36);
        Student student5 = new Student("Jessica", "Williams", 135);

        System.out.println("Full name of student2: " + student2.firstName + " " + student2.lastName);
        System.out.println("Age of student2: " + student2.age);

        System.out.println("Numbers of students: " + Student.studentCount);
        
        System.out.println("Removed student is : " +  student3.firstName + " " + student3.lastName);
        student3.removeStudent();

        System.out.println("School name is: "+ Student.schoolName);
    }
}
