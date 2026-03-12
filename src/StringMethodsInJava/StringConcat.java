package StringMethodsInJava;

public class StringConcat {
    public static void main(String[] args) {

        String  city = "Los Angeeles";
        int code = 213; //concatenation -. int gets converted to String
        String cityWithCode = city + code;  //cityWithCode = Los Angeles213
        System.out.println(cityWithCode);

        String cityWithBool = cityWithCode + true;
        //String + Boolean will get converted to String
        System.out.println(cityWithBool);


        int a = 5, b = 2;
        System.out.println(a + b + city); //left to right direction of adding -.
        System.out.println(1 + 5 + city + b);
    }
}
