package MethodsInJava;

public class StringTrimMethod {
    public static void main(String[] args) {

        String name = "  Injee ";
        System.out.println(name.trim());

        String statement = " I had a dream!  ";
        System.out.println(statement);
        System.out.println(statement.trim());


        String city = "Brighton Beach";
        String res = "";
        for (int i = 0; i < city.length(); i++){
            String letter = city.substring(i,i+1);
            if (letter.equalsIgnoreCase("a")
            || letter.equalsIgnoreCase("e")
            || letter.equalsIgnoreCase("o")
            || letter.equalsIgnoreCase("u"))
            {
                res += letter.toUpperCase();
            } else{
                res += letter.toLowerCase();
            }
        }
        System.out.println(res);


    }
}

