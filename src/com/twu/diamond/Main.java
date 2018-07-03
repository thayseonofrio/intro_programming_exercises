package com.twu.diamond;

import com.twu.utils.Utils;

public class Main {
    public static void main(String[] args) {
        int number;
        number = Utils.getNumberInput();
        if (number == 0) {
            System.out.print("Bye bye");
            return;
        }
        getIsosceles(number);
        getDiamond(number);
        getDiamondName(number);
    }

    private static void getDiamondName(int number) {
        System.out.println("\n");
        System.out.println("Diamond with Name");
        DiamondName diamondName = new DiamondName(number);
        System.out.print(diamondName);
    }

    private static void getDiamond(int number) {
        System.out.println("\n");
        System.out.println("Diamond");
        Diamond diamond = new Diamond(number);
        System.out.print(diamond);
    }

    private static void getIsosceles(int number) {
        System.out.println("\n");
        System.out.println("Isosceles");
        Isosceles isosceles = new Isosceles(number);
        System.out.print(isosceles);
    }
}
