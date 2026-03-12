package MethodsInJava;

public class Tasks {

    //1.Create even number from 0 to 100
    public   static void  printEven(){
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) System.out.print(i  + ", ");
        }
    }

//    public static void main(String[] args) {
//        printEven();
//    }
    //2. Create numbers from 1 to 5

    public static void printNumbers(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Loop: " + i);
        }
    }

    public static void printNum(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers();
        printEven();
        printNum();

    }

}
