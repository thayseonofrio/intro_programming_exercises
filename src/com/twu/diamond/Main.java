package com.twu.diamond;

import com.twu.utils.Utils;

public class Main {
    public static void main(String[] args) {
        int number;
        number = Utils.getNumberInput();
//        Isosceles isosceles = new Isosceles();
//        isosceles.drawShape(number);
//        isosceles.print();
        Diamond diamond = new Diamond();
        diamond.drawShape(number);
        diamond.print();
    }
}
