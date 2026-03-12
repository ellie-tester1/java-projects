package arrays;

public class ArrayPractice4 {
    public static void main(String[] args) {
        String[] carMake = {"Toyota", "Lexus", "Kia", "Mercedes Benz", "Land Rover"};
        // Collect First letters of cars

        String result = carMake[0].substring(0, 1)
                + carMake[1].substring(0, 1) + carMake[2].substring(0, 1)
                + carMake[3].substring(0, 1) + carMake[4].substring(0, 1);
        System.out.println(result);     //TLKML



        String res ="";      //collect the last letter of cars - asazr
        for (int i=0; i < carMake.length; i++){
            String car = carMake[i];
            res += car.charAt(car.length()-1);
        }
        System.out.println(res);
    }
}

