package org.oukirche.solution;

public class Square extends Shape{

    private int size;

    public Square(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getArea() {
        return size*size;
    }
}
