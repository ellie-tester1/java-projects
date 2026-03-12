package oop.shapes_method_override;

public class Square extends Shape{

    int sideLength;  // length of each side

    @Override
    public int calculatePerimeter(){
        return 4 * sideLength;

    }
    //method overloading
    public double calculateArea (int sideLength){
        return sideLength * sideLength;
    }

    //mehtod overlosading
    public double calculateArea(){
        return sideLength * sideLength;
    }
}
