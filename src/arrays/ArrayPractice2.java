package arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String[] color = {"Red", "Green", "Yellow", "Blue", "white", "Pink", "Purple"};
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i].concat(", "));
        }
        System.out.println("===========================");
        String[] colors = {"Red", "Green", "Yellow", "Blue", "white", "Pink", "Purple"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < colors.length; i++) {
            result.append(color[i]);
            if (i < colors.length - 1) {
                result.append(", ");
            }
        }
        System.out.println(result.toString());
        System.out.println("/////////////////////////////////////");


        String[] col = {"Red", "Green", "Yellow", "Blue", "White", "Pink", "Purple"};
        for (int i = 0; i < col.length; i++) {
            if (i == col.length - 1) {
                System.out.print(col[i]);
            } else System.out.print(col[i].concat(", "));
        }


        int[] a = {47, 44, 58, 33, 89,70 };
        int count = 0; while(count<a.length){
            if(a[count]%2==1)
            System.out.println(a[count]); count++; } }// (a[count]%2==1)  - shows odd numbers
    }
