package com.twu.triangle;

public class VerticalLine extends Line {

    public static void main(String[] args) {
        int number = 0;
        Line line = new VerticalLine();
        number = line.getNumberInput();
        line.print(number, LineType.VERTICAL);
    }
}
