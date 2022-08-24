package org.oukirche.probleme;

public class Test {

    void getAreaTest(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    void rectangleAreaTest(){
        Rectangle rectangle = new Rectangle(2,5);
        getAreaTest(rectangle);
    }

    void squareAreaTest(){
        Square square = new Square();
        square.setWidth(5);
        getAreaTest(square);
    }
    public Test() {
        rectangleAreaTest();
        squareAreaTest();
    }

    public static void main(String[] args) {
        new Test();
    }
}
