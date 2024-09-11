package org.example;

public class Room {
    private int width;
    private int depth;

    public Room(int width, int depth) {
        this.width = width;
        this.depth = depth;
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
