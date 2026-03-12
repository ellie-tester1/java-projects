package oop.encapsulation;

public class ApplyForLicense {

    public static void main(String[] args) {

        DriverLicenseApplicationForm driver1 = new DriverLicenseApplicationForm();
        driver1.firstName = "Zoha";
        driver1.lastName = "Panton";
        driver1.age = 16;
        driver1.Ssn = "0123456789";

        driver1.printApplicatiopnDetails();

        driver1.age = 56;
        driver1.printApplicatiopnDetails();

        DriverLicenseApplicationForm driver2 = new DriverLicenseApplicationForm();
        driver2.firstName = "Tim";
        driver2.lastName = "Kim";
        driver2.age = 36;
        driver2.Ssn = "9876543210";

        driver2.printApplicatiopnDetails();

    }
}
