package org.oukirche.solution;



public class Test {

    void rectangleAreaTest(){
        Shape rectangle = new Rectangle(2,5);
        rectangle.getArea();
        System.out.println(rectangle.getArea());
    }

    void squareAreaTest(){
        Shape square = new Square(5);
        System.out.println(square.getArea());
    }
    public Test() {
        rectangleAreaTest();
        squareAreaTest();
    }

    public static void main(String[] args) {
        new Test();
    }
}
