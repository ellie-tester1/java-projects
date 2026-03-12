package StringMethodsInJava;

public class ChainingMethod {
    public static void main(String[] args) {

        String school = "TechState";
        System.out.println(school);

        String schoolUpperCase = school.toUpperCase();
        System.out.println(schoolUpperCase);

        String schoolLowerCase =school.toLowerCase();
        System.out.println(schoolLowerCase);

        String schoolNameReplaced = schoolUpperCase.replace('T', 'P');
        System.out.println(schoolNameReplaced);

        char charC = schoolNameReplaced.charAt(2);
        int schoolLen = school.length();

        String country = "Argentine"; //replace 1st occurance of 'e'  with 'a'
        String eReplaced = country.replace(country.charAt(3), 'a');
        System.out.println(eReplaced);

        String result = country.substring(0, country.indexOf('e')) //Arg + a + ntine
                +country.substring(country.indexOf('e'), country.indexOf('e') + 1).replace('e', 'a')
               + country.substring(country.indexOf('n'));
        System.out.println(result);


        String airport = "   Washington   ";
        System.out.println(airport);
        String modifiedAirportName = airport
                .trim()           //remove empty spaces from both side
                .replace('a', 'o') // replace 'a' to 'o'
                .toUpperCase();    // convert letters to upper case
        System.out.println(modifiedAirportName);




    }
}
