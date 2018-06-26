package com.twu.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Line {
    public void print(int number, LineType lineType) {
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

    public int getNumberInput() {
        System.out.println("Insert a number: ");
        String inputLine = null;
        int number = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = reader.readLine();
            if (inputLine.length() == 0) {
                return 0;
            }
            if (!isNumber(inputLine)) {
                System.out.println("Invalid number");
                return 0;
            }
            number = Integer.parseInt(inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    private Boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
