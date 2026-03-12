package stringBuilderIntro;

public class StringBuilderDeleteAndReverseMethod {
    public static void main(String[] args) {
        StringBuilder carMake = new StringBuilder("Mercedes Benz"); // Mercedes z
        System.out.println(carMake);
      carMake.delete(9,12);   //delete the 'Ben' from the String
      System.out.println(carMake);
      carMake.deleteCharAt(7); // remove the character at index 7 - "s"
      System.out.println(carMake);

      int indexOfLetterD =carMake.indexOf("d"); //indexOf() -> returns the index of target string
        System.out.println("The index of letter 'd' is:  " + indexOfLetterD);
        carMake.deleteCharAt(indexOfLetterD); // remove letter 'd' from StringBuilder
        System.out.println(carMake);


        StringBuilder name = new StringBuilder("Dinara");
        System.out.println("Before reverse: " +name);
        name.reverse();
        System.out.println("After reverse: " + name);

        StringBuilder streetName = new StringBuilder("Washington");
        StringBuilder reversedName = new StringBuilder();
        for ( int i = streetName.length()-1; i >= 0; i--) {  //Washington St
            reversedName.append(streetName.charAt(i)); //
        }
        System.out.println("Street name before reverse: " + streetName);
        System.out.println("Street name after reverse: " + reversedName);


        //String toStering() -> method returns SWtring version of StringBuilder
        String streetNameString = streetName.toString();
        String streetNameUpperCase = streetNameString.toUpperCase();

        //Convert String to StringBuilder
        StringBuilder sbStreetName = new StringBuilder(streetNameUpperCase);
        System.out.println(sbStreetName);
    }
}
