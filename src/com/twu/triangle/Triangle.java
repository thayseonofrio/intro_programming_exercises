package com.twu.triangle;

public class Triangle {

    public void print(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.println(buildString(i));
        }
    }

    private String buildString(int numberOfCharacters) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < numberOfCharacters; i++) {
            string.append("*");
        }
        return string.toString();
    }
}
