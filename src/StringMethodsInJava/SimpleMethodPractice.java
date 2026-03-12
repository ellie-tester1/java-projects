package StringMethodsInJava;
public class SimpleMethodPractice {
    public static void main(String[] args) {
        String name = "Injee";
        char c = 'e';

        // Call the method to count occurrences of the character 'c' in the string 'name'
        int numberOfTimesChar = countCharOccurrences(name, c);

        // Print the result
        System.out.println("The number of times character: '" + c + "' appears in word " + name + " is: "
                + numberOfTimesChar + " times.");
    }

    // Method to count occurrences of a character in a string
    public static int countCharOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}

