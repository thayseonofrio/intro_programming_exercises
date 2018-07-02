package com.twu.diamond;

public abstract class Shape implements IShape {
    int maxSize;
    int oddNumber;
    String shapeArray[][];

    public void print() {
        for (String[] line : shapeArray) {
            System.out.print("\n");
            for (String data : line) {
                System.out.print(data);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("");
        for (String[] line : shapeArray) {
            retorno.append("\n");
            for (String data : line) {
                retorno.append(data);
            }
        }
        return retorno.toString();
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

    public void fillShapeAscendantly(int number) {
        oddNumber = 1;
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
    }
}
