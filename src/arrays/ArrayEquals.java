package arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        // equals() method for arrays will only check the reference of 2 arrays
        // meaning that if they are pointing to the same memory location or not
        String[] name1 = {"Gulina", "Ziada", "Injee"};
        String[] name2 = {"Gulina", "Dinara", "Mahabat"};

        System.out.println("Are they referencing to same location? " + name1.equals(name2));

        boolean sameOrNot = areSameElements(name1, name2);
        System.out.println("Are the elements of 2 arrays the same? " + sameOrNot);
    }

    public static boolean areSameElements(String[] arr1, String[] arr2) {
        boolean isSame = true;
        int len1 = arr1.length, len2 = arr2.length;

        if (len1 != len2) {
            System.out.println("The length is not same");
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (!arr1[i].equals(arr2[i])) {
                System.out.println("These don't match: " + arr1[i] + " - " + arr2[i]);
                isSame = false;
                break;
            }
        }
        return isSame;
    }
}
