package org.example;

public class Room {
    private int width;
    private int depth;

    public Room(int width, int depth) {
        this.width = width;
        this.depth = depth;
    }

    public Room(String input) throws NumberFormatException {
        this(getWidthFromString(input), getDepthFromString(input));
    }

    //TODO not handling case where user enters more than 2 inputs
    private static int getWidthFromString(String input) {
        String[] spaceSeparatedStrings = input.split("\\s+");
        return Integer.parseInt(spaceSeparatedStrings[0]);
    }

    private static int getDepthFromString(String input) {
        String[] spaceSeparatedStrings = input.split("\\s+");
        return Integer.parseInt(spaceSeparatedStrings[1]);
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isInRoom(int x, int y) {
        return isWithinMaxExclusive(0, width, x) && isWithinMaxExclusive(0, depth, y);
    }

    private boolean isWithinMaxExclusive(int min, int max, int value) {
        return value >= min && value < max;
    }
}
