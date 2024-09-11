package org.example;

public class Robot {
    private int xCoord;
    private int yCoord;
    private char direction;
    private Room currentRoom;

    //TODO implement input validation, no negative coords + only N,E,W,S as direction
    public Robot(int xStart, int yStart, char directionStart, Room roomStart) {
        xCoord = xStart;
        yCoord = yStart;
        direction = directionStart;
        currentRoom = roomStart;
    }

    public void leftTurn() {
        //TODO implement
    }

    public void rightTurn() {
        //TODO implement
    }

    public void moveForward() {
        //TODO implement
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public char getDirection() {
        return direction;
    }
}
