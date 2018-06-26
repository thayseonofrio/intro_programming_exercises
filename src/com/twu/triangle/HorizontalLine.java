package com.twu.triangle;


public class HorizontalLine extends Line {
    public static void main(String[] args) {
        int number = 0;
        Line line = new HorizontalLine();
        number = (line.getNumberInput());
        line.print(number, LineType.HORIZONTAL);
    }


}
