package MethodsInJava;

public class CalculatorWithInstanceMethod {

    public static void main(String[] args) {
CalculatorWithInstanceMethod obj = new CalculatorWithInstanceMethod();
int result = obj.calculate("add", 9,5);
System.out.println(result);
    }

    public  int calculate(String operationType, int a, int b) {
        int result = 0;

        if (operationType == "add") result = add(a, b);
        else if (operationType == "subtract") return a - b;
        else if (operationType == "divide") return a / b;
       else  return a * b;
        return result;

    }
    public  int add(int num1, int num2){
        return num1 + num2;





    }
}

