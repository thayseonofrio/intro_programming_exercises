package com.twu.triangle;


public class Line {
    private LineType lineType;

    public void print(int number) {
        int i = 0;
            while (i < number) {
                if (lineType == LineType.HORIZONTAL) {
                    System.out.print("*");
                } else if (lineType == LineType.VERTICAL) {
                    System.out.println("*");
                }
                i++;
            }
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }
}
