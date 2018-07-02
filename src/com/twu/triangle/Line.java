package com.twu.triangle;


public abstract class Line {

    public void print(int number) {
        int i = 0;
            while (i < number) {
                printLine();
                i++;
            }
    }

    protected abstract void printLine();
}
