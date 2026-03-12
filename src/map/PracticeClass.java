package map;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class PracticeClass {
    public static void main(String[] args) {

        // Task: Create an array of string and store your information about
        // first name, last name, address, phone number
        // EX: {"Ben", "Affleck", "123 Washington St, Madison, WI", "123-456-7890"}

        String[] lina = {"Lina", "Seen", "4432 Georgia Lane, Des Moines, IL", "774-106-0100"};
        String[] mahabat = {"Benazir", "Behutda", "3765 Manheim Street, Skokie, IL", "624-726-5700"};
        String[] injee = {"Anna", "876-097-3460", "Paris", "1672 Prairee ave, Northbrook, IL"};
        String[] dion = new String[4];
        dion[0] = "Dion";
        dion[1] = "Jasper";
        dion[2] = "123 Lincoln St, San Francisco, CA";
        dion[3] = "457-657-1278";
        String[] zia = {"Zion", "Celine", "311 Northrop st", "228-810-0739"};

        /**
         * {
         *  "firstName": "Lina",
         *  "lastName": "Seen",
         *  "address": "4432 Georgia Lane, Des Moines, IL",
         *  "phoneNumber": "774-106-0100"
         * };
         */

        Map<String, String[]> employeeDataBase = new HashMap<>();
        employeeDataBase.put("lina", lina);
        employeeDataBase.put("dion", dion);
        employeeDataBase.put("injee", injee);
        employeeDataBase.put("mahabat", mahabat);
        employeeDataBase.put("zia", zia);

        for (String name: employeeDataBase.keySet()) {
            System.out.println("Employee information database: \n" + Arrays.toString(employeeDataBase.get(name)));
        }

        String linaPhone = employeeDataBase.get("lina")[3];
        System.out.println(linaPhone);
        String ziaPhone = employeeDataBase.get("zia")[3];
        String ziaLastName = employeeDataBase.get("zia")[1];

        String injeePhone = "";
        boolean flag = true;
        for (String element : employeeDataBase.get("injee")) {
            System.out.println("Injee information: " + element);
            for (int i = 0; i < element.length(); i++) {
                char curChar = element.charAt(i); // 'A'
                if (isItReallyDigit(curChar) || curChar == '-' || curChar == '+') {
                    if (i == element.length()-1) {
                        injeePhone = element;
                        flag = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!flag) break;
            System.out.println("We are at this element now: " + element);
        }

        System.out.println("Injee's phone number: " + injeePhone);
    }

    public static boolean isItReallyDigit(char c) {
        return c > 47 && c < 58;


    }
}
