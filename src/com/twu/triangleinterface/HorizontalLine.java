package com.twu.triangleinterface;

public class HorizontalLine implements ILine {

    public void print(int number) {
        int i = 0;
        while (i < number) {
            printLine();
            i++;
        }
    }

    private void printLine() {
        System.out.print("*");
    }
}
