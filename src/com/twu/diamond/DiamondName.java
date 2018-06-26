package com.twu.diamond;

public class DiamondName extends Diamond {
    @Override
    public void drawShape(int number) {
        super.drawShape(number);
        String name = "Thayse";
        int middleLine = number - 1;
        int startFrom = (shapeArray[middleLine].length - name.length()) / 2;
        for(int columnIndex = 0; columnIndex < shapeArray[middleLine].length; columnIndex++) {
            shapeArray[middleLine][columnIndex] = " ";
            if (columnIndex == startFrom) {
                shapeArray[middleLine][columnIndex] = name;
            }
        }
    }
}
