public class IfElseStatements {
    public static void main(String[] args) {

        byte b  = 127,  c = - 128;
        short num1 = 32767, num2 = -32768;

      byte x = 12;
      byte y = 12;
      byte  res1  = (byte) (x + y);
      System.out.println(res1);


      short q = 234, w = 98;
      short res2 = (short) (q +w);
      System.out.println(q+w);

//  implicit - automatic
//  explicit - manual

     int num3 = (int) 23.5;   //explicitly  casting  double to int
        double num4 = 34;  //implicitly converts in to double
        System.out.println("Our double data type num4:  " + num4);
        System.out.println((34 < 23) && false); // && [AND] operation requires both operands to be true


        String name = "Salman";
        if (name == "Elnura"){
            System.out.println("Hello Elnura! Welcome to IT company!");
    }
        if (name == "Ulukbek"){
            System.out.println("Hello Ulukbek! Welcome to Los Angeles!");
        }
        if (name == "Bakyt"){
            System.out.println("Hello Bakyt! Welcome to American`s Football Team!");
        }
        if (name == "Naima"){
            System.out.println("Hello Naima! Welcome to Gymnastics!");
        }
        if (name == "Salman"){
            System.out.println("Hello Salman! Welcome to Pilot company!");
        }
        if (name == "Khazhar"){
            System.out.println("Hello Khazhar! Welcome to Los Angeles!");
        }else {
            System.out.println("Welcome to IT company");
        }








    }
}
