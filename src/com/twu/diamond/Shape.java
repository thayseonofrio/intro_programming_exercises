package com.twu.diamond;

public abstract class Shape implements IShape {
    protected int maxSize;
    protected int oddNumber;
    protected String shapeArray[][];

    public Shape(int number) {
        drawShape(number);
    }

    public abstract void drawShape(int number);

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("");
        for (String[] line : shapeArray) {
            string.append("\n");
            for (String data : line) {
                string.append(data);
            }
        }
        return string.toString();
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

    protected int getCellsToFill(int oddNumber) {
        return (maxSize - oddNumber) / 2;
    }

    protected void fillShapeAscendantly(int number) {
        oddNumber = 1;
        iterateThroughLine(number);
    }

    private void iterateThroughLine(int number) {
        for(int lineIndex = 0; lineIndex < number; lineIndex++) {
            iterateThroughColumn(lineIndex);
            oddNumber = oddNumber + 2;
        }
    }

    private void iterateThroughColumn(int lineIndex) {
        int fillCellsFrom = getCellsToFill(oddNumber);
        for(int columnIndex = 0; columnIndex < shapeArray[lineIndex].length; columnIndex++) {
            fillCell(lineIndex, fillCellsFrom, columnIndex);
        }
    }

    private void fillCell(int lineIndex, int fillCellsFrom, int columnIndex) {
        shapeArray[lineIndex][columnIndex] = " ";
        if (columnIndex >= fillCellsFrom && columnIndex < (fillCellsFrom + oddNumber)) {
            shapeArray[lineIndex][columnIndex] = "*";

        }
    }
}
