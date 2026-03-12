package oop.school;

public class School {

    String name;
    String type;
    int capacity;
    int builtYear;
    boolean hasStadium;
    int bathrooms;

    public School (String name, String type) {
        this.name = name;
        this.type = type;
    }

    public School ( String name, String type, int capacity, int builtYear) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.builtYear = builtYear;

    }
    public  School(String name, String type, int capacity, int builtYear, boolean hasStadium, int bathrooms){
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.builtYear = builtYear;
        this.hasStadium = hasStadium;
        this.bathrooms = bathrooms;
    }
    public  void  printSchoolDetails() {
        String yearInfo = "Unknown";
        if (builtYear > 0 ) yearInfo =  Integer.toString(builtYear);

        String details = "School name: " + name
                + "\n School type: " + type
                + " \nSchool was built in " + yearInfo;
        System.out.println(details);
    }

}
