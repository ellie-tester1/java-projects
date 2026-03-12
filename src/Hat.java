public class Hat {

    String type;
    String material;
    String color;
    int size;

    public  Hat(String type, String material, String color, int size){
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public static void main(String[] args) {
        Hat baseballCap = new Hat ("Sports", "Wool", "Navy Blue", 34);
        System.out.println("Hat type is: " +baseballCap.type
        + "\nMaterial of the hat is: " + baseballCap.material
        + "\nHat color: " + baseballCap.color
        + "\nHat size:  " + baseballCap.size);
    }


}
