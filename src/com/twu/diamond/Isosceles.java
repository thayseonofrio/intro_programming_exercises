package com.twu.diamond;

public class Isosceles extends Shape {
    public void print() {
        for (String[] line : shapeArray) {
            System.out.print("\n");
            for (String data : line) {
                System.out.print(data);
            }
        }
    }

    public void drawShape(int number) {
        maxSize = getMaxSize(number);
        shapeArray = new String[number][maxSize];
        fillShapeAscendantly(number);
    }

}
