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
        System.out.println("\n");
        System.out.println("Isosceles");
        Isosceles isosceles = new Isosceles();
        isosceles.drawShape(number);
        isosceles.print();
        System.out.println("\n");
        System.out.println("Diamond");
        Diamond diamond = new Diamond();
        diamond.drawShape(number);
        //diamond.print();
        System.out.print(diamond);
        System.out.println("\n");
        System.out.println("Diamond with Name");
        DiamondName diamondName = new DiamondName();
        diamondName.drawShape(number);
        diamondName.print();
    }
}
