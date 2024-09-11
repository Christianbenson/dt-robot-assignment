package org.example;

public class Robot {
    private int xCoord;
    private int yCoord;
    private String direction;

    //TODO implement input validation, no negative coords + only N,E,W,S as direction
    public Robot(int xStart, int yStart, String directionStart) {
        xCoord = xStart;
        yCoord = yStart;
        direction = directionStart;
    }

    public void leftTurn() {
        //TODO implement
    }

    public void rightTurn() {
        //TODO implement
    }

    public void walkForward() {
        //TODO implement
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public String getDirection() {
        return direction;
    }
}
