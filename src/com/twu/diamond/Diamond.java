package com.twu.diamond;

public class Diamond extends Shape {
    public void print() {
        for (String[] line : shapeArray) {
            System.out.print("\n");
            for (String data : line) {
                System.out.print(data);
            }
        }
    }

    public void drawShape(int number) {
        maxSize = getMaxSize(number);
        shapeArray = new String[(number * 2) - 1][maxSize];
        int oddNumber = 1;
        for(int lineIndex = 0; lineIndex < number; lineIndex++) {
            int fillCellsFrom = getCellsToFill(oddNumber);
            for(int columnIndex = 0; columnIndex < shapeArray[lineIndex].length; columnIndex++) {
                shapeArray[lineIndex][columnIndex] = " ";
                if (columnIndex >= fillCellsFrom && columnIndex < (fillCellsFrom + oddNumber)) {
                    shapeArray[lineIndex][columnIndex] = "*";

                }
            }
            oddNumber = oddNumber + 2;
        }
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

    public int getMaxSize(int number) {
        int i = 1;
        int oddNumber = 1;
        while (i < number) {
            oddNumber = oddNumber + 2;
            i++;
        }
        return oddNumber;
    }

    public int getCellsToFill(int oddNumber) {
        return (maxSize - oddNumber) / 2;
    }
}
