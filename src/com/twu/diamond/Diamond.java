package com.twu.diamond;

public class Diamond extends Shape {

    public void drawShape(int number) {
        maxSize = getMaxSize(number);
        shapeArray = new String[(number * 2) - 1][maxSize];
        fillShapeAscendantly(number);
        oddNumber = oddNumber - 2;
        for(int lineIndex = number; lineIndex <  (number * 2) - 1; lineIndex ++) {
            oddNumber = oddNumber - 2;
            int fillCellsFrom = getCellsToFill(oddNumber);
            for(int columnIndex = 0; columnIndex < shapeArray[lineIndex].length; columnIndex++) {
                shapeArray[lineIndex][columnIndex] = " ";
                if (columnIndex >= fillCellsFrom && columnIndex < (fillCellsFrom + oddNumber)) {
                    shapeArray[lineIndex][columnIndex] = "*";
                }
            }
        }
    }


}
