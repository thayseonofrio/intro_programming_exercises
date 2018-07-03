package com.twu.diamond;

public class Diamond extends Shape {

    public Diamond(int number) {
        super(number);
    }

    public void drawShape(int number) {
        maxSize = getMaxSize(number);
        shapeArray = new String[(number * 2) - 1][maxSize];
        fillShapeAscendantly(number);
        oddNumber = oddNumber - 2;
        iterateThroughLine(number);
    }

    private void iterateThroughLine(int number) {
        for(int lineIndex = number; lineIndex <  (number * 2) - 1; lineIndex ++) {
            oddNumber = oddNumber - 2;
            int fillCellsFrom = getCellsToFill(oddNumber);
            iterateThroughColumn(lineIndex, fillCellsFrom);
        }
    }

    private void iterateThroughColumn(int lineIndex, int fillCellsFrom) {
        for(int columnIndex = 0; columnIndex < shapeArray[lineIndex].length; columnIndex++) {
            fillCells(lineIndex, fillCellsFrom, columnIndex);
        }
    }

    private void fillCells(int lineIndex, int fillCellsFrom, int columnIndex) {
        shapeArray[lineIndex][columnIndex] = " ";
        if (columnIndex >= fillCellsFrom && columnIndex < (fillCellsFrom + oddNumber)) {
            shapeArray[lineIndex][columnIndex] = "*";
        }
    }


}
