package com.twu.triangleinterface;

import com.twu.utils.Utils;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        VerticalLine verticalLine = new VerticalLine();
        HorizontalLine horizontalLine = new HorizontalLine();
        Triangle triangle = new Triangle();
        number = Utils.getNumberInput();

        System.out.println("\n");
        System.out.println("** Vertical Line **");
        verticalLine.print(number);
        System.out.println("\n");
        System.out.println("** Horizontal Line **");
        horizontalLine.print(number);
        System.out.println("\n");
        System.out.println("** Triangle **");
        triangle.print(number);
    }
}
