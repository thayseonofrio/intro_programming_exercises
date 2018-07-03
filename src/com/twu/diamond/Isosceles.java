package com.twu.diamond;

public class Isosceles extends Shape {

    public Isosceles(int number) {
        super(number);
    }

    public void drawShape(int number) {
        maxSize = getMaxSize(number);
        shapeArray = new String[number][maxSize];
        fillShapeAscendantly(number);
    }

}
