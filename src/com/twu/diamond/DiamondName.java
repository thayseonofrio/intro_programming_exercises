package com.twu.diamond;

public class DiamondName extends Diamond {

    public static final String NAME = "Thayse";

    public DiamondName(int number) {
        super(number);
    }

    @Override
    public void drawShape(int number) {
        super.drawShape(number);
        String name = NAME;
        int middleLine = number - 1;
        int startFrom = getCellToStartFrom(middleLine, name);
        iterateThroughColumn(name, middleLine, startFrom);
    }

    private int getCellToStartFrom(int middleLine, String name) {
        return (shapeArray[middleLine].length - name.length()) / 2;
    }

    private void iterateThroughColumn(String name, int middleLine, int startFrom) {
        for(int columnIndex = 0; columnIndex < shapeArray[middleLine].length; columnIndex++) {
            fillCell(name, middleLine, startFrom, columnIndex);
        }
    }

    private void fillCell(String name, int middleLine, int startFrom, int columnIndex) {
        shapeArray[middleLine][columnIndex] = " ";
        if (columnIndex == startFrom) {
            shapeArray[middleLine][columnIndex] = name;
        }
    }
}
