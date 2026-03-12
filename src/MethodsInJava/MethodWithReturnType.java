package MethodsInJava;

public class MethodWithReturnType {
    public static void main(String[] args) {

        MethodWithReturnType obj1 = new MethodWithReturnType();
        int sum = obj1.addTwoNumbers(5,3);
        System.out.println("The sum of 5 and 3 is:" + sum);

         int num3 = 9;
         int num4 = 12;
         int sum2 = obj1.addTwoNumbers( num3, num4);
        System.out.println("The sum of 9 and 12 is: " + sum2);

        System.out.println("The product of a and b is: " +obj1.multiplyTwoNumbers(2,3));

    }

    public  int addTwoNumbers(int num1, int num2){
        int sum  = num1 + num2;
        return sum;
    }

    public  int multiplyTwoNumbers(int a, int b){
        int product  =  a* b;
        return product;
    }


}
