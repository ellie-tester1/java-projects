package oop.school;

public class SchoolSystemDataBase {
    public static void main(String[] args) {

        //using the first constuctor
        School robertFrost = new School ("Robert J. Frost", "Elementary");
        robertFrost.printSchoolDetails();

        //using 3 parameters constructor
        School jayCollins = new School ("Jay Danny Collins", "Middle School", 500, 1989);
       jayCollins.printSchoolDetails();

        //using 6 parameter constructor
        School michaelOwens = new School("Michael T. Owens", "Community Coolege",  3000, 1891, true, 40);
       michaelOwens.printSchoolDetails();

    }
}
