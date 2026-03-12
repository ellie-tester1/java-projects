package stringBuilderIntro;

public class StringBuilder1 {

    public static void main(String[] args) {

        String school = new String("TechState");  //TechState
        System.out.println("Original value of school: " + school);
        school = school + " Academy";  // TechState Academy
        System.out.println(school);

// OR
        StringBuilder ts = new StringBuilder("TechState");
        System.out.println(ts);
        ts.append(" Academy"); //"Initial" +  value -> "Initial value"
        System.out.println(ts);

        StringBuilder sb = new StringBuilder("Initial");
        System.out.println(sb);
        sb.append(" value"); //"Initial" +  value -> "Initial value"
        System.out.println(sb);

        StringBuilder letters = new StringBuilder();
        for (int i = 0; i< 10; i++){
            letters.append('a'); //"" + 'a' -> "aa" + 'a'  -->  "aaaaaaaaa"
        }
        System.out.println(letters);


        StringBuilder company = new StringBuilder("J.Morgan ");
        System.out.println("Before insert: " + company);
        //insert() -> adds a character to specific index/offset
        company.insert(2, "P."); //J.P.Morgan
        System.out.println("After insert: " + company);
        company.insert(0, "Chase "); //"Chase J.P.Morgan
        System.out.println(company);
        company.insert(company.length()-1, " Company");
        System.out.println(company);
    }
}
