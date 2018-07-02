package com.twu.triangleinterface;

public class VerticalLine implements ILine {

    public void print(int number) {
        int i = 0;
        while (i < number) {
            printLine();
            i++;
        }
    }

    protected void printLine() {
        System.out.println("*");
    }
}
