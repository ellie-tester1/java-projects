public class WhileLoop2 {
    public static void main(String[] args) {


        int start = 1, start10 = 10, end30 = 30;
        while ( start10 <= end30){
            System.out.println("From 10 to 30: " + start10);
            start10++;
        }


        while (start <= end30){
            if (start % 3 == 0)
                System.out.println("Number divisible by 3: " + start);
            start++;
        }

        int sum = 0, counter = 1,  top = 6;   // 1+2+3+4+5+6=21
        while( counter <= top){
            sum = sum + counter;
            counter++;
        }
        System.out.println("The sum is: " + sum);



int product = 1, count = 1,  limit = 5;   //1*2*3*4*5=120
while (count <= limit) {
    product = product * count;
    count++;
}
System.out.println("The proguct is: " + product);




int starting = 1, end = 50;
while ( starting <= end) {
    if (starting % 5 == 0)
        System.out.println( starting + " Welcome Elnura to our IT company!");
    starting = starting + 1;
}
    }
}
