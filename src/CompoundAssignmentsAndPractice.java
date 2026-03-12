public class CompoundAssignmentsAndPractice {

    public static void main(String[] args) {

        int x = 1;
        x = x + 2;      // x =3
        x = x + 5;           //x = 5

        int  y = x + 3;  //y = 8
        y += 4;          // y = y + 4
    System.out.println("X = " +x);
        System.out.println("Y = " +y);


        boolean hasClock = true;
        hasClock = !hasClock;
        System.out.println("hasClock  value is : " + hasClock);
        System.out.println("hasClock value while negating: " +! hasClock);
        System.out.println("hasClock value while negating: " + hasClock);

        hasClock = true;
        hasClock = true;
        hasClock = false;
        hasClock = !hasClock;


        int d = 3, s =2;
        d+= d ++ + ++d + ++d + d--;
//      3 + 3    +  5  +  6  +  6;
        System.out.println("d = " + d);

        s -= s + ++s - ++s + s++ + --s;
//      s -= 2 + 3 - 4   +  4  +   4;
        s -= 9;
        s = s-9;
        s = 2-9;
        s = -7;
    System.out.println("s = " + s);





 }
}
