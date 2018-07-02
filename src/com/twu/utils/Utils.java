package com.twu.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    public static int getNumberInput() {
        System.out.println("Insert a number: ");
        String inputLine = null;
        int number = 0;
        try {
            inputLine = getInput();
            if (verifyInputLength(inputLine)) return 0;
            if (validateNumber(inputLine)) return 0;
            number = Integer.parseInt(inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    private static boolean validateNumber(String inputLine) {
        if (!isNumber(inputLine)) {
            System.out.println("Invalid number");
            return true;
        }
        return false;
    }

    private static boolean verifyInputLength(String inputLine) {
        if (inputLine.length() == 0) {
            return true;
        }
        return false;
    }

    private static String getInput() throws IOException {
        String inputLine;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inputLine = reader.readLine();
        return inputLine;
    }

    private static Boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
