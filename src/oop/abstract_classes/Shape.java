package oop.abstract_classes;


    //Abstract class - is a class where it can contain both
 //* abstract and non-abstract methods;
 //* abstract classes cannot be instantiated directly;
 //* it sets a rule for direct non-abstract subclasses to implement the
 //* abstract methods;
    public abstract class Shape {

        String name;

        public Shape(String name) {
            this.name = name;
        }

        // abstract methods do not require implementation
        // within the abstract class;
        // [method implementation means it's body or
        // statements and code within the method scope]
        abstract int calculatePerimeter();

        abstract double calculateArea();

        public void printShapeName() {
            System.out.println(name);
        }
    }

