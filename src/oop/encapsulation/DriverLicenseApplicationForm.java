package oop.encapsulation;

public class DriverLicenseApplicationForm {

    String firstName;
    String lastName;
    int age;
    String Ssn;

    public void printApplicatiopnDetails() {
        String details = "First name: " +firstName
                + "\nLast name: " + lastName
                +"\nAge: " + age
                +"\nSsn: " +Ssn;

        System.out.println(details);
    }
}
