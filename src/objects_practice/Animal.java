package objects_practice;

public class Animal {
    String name;
    String type;
    boolean hasLegs;
    boolean isMammal;
    boolean canFly;
    int age;
    int numberOfLegs;
    int numberOfWings;

    //1.  matches the class name
    //2. no return type;
    //3. it can take parameters
    //  4. can be overridden

    //Construction overloading - process of creating multiple constructions with  different parameters
    public Animal(String name, String type, boolean hasLegs, boolean isMammal, int age,  int numberOfLegs) {
        this.name = name;
        this.type = type;
        this.hasLegs = hasLegs;
        this.isMammal = isMammal;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.canFly = false;
    }

    public Animal (String name, String type, boolean hasLegs, boolean isMammal, boolean canFly, int age, int numberOfWings) {
        this.name = name;
        this.type = type;
        this.hasLegs = hasLegs;
        this.isMammal = isMammal;
        this.canFly = canFly;
        this.age = age;
        this.numberOfWings = numberOfWings;


    }

    public void changeName(String newName) {
        String errorMessage = "Name is not unsupported. Please try again!";
        if (newName.isBlank() || newName.isEmpty() || newName.length() < 2 || !checkIfAllCharactersAreLetters(newName.trim())) {
            System.err.println(errorMessage);
            System.exit(1);
        }
        name = newName.trim();
    }
    // Task: Check if the String contains only English letters/alphabet, if yes then return true

    private boolean checkIfAllCharactersAreLetters (String name) {
        // "Ostri23"
        for (int i = 0; i < name.length(); i++) {
            char curChar = name.charAt(i);
            if ((curChar > 64 && curChar < 91) || (curChar > 96 && curChar < 123)) {
                if (i == name.length()-1) {
                    return true;
                }
            } else {
                System.err.println("This character is not supported: " + curChar);
                break;
            }
        }
        return false;
    }
}




