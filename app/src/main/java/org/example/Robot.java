package org.example;

public class Robot {
    private int xCoord;
    private int yCoord;
    private char direction;
    private Room currentRoom;
    private static char[] possibleDirections = {'N', 'E', 'S', 'W'};

    //TODO implement input validation, no negative coords + only N,E,W,S as direction
    public Robot(int xStart, int yStart, char directionStart, Room roomStart) {
        xCoord = xStart;
        yCoord = yStart;
        direction = directionStart;
        currentRoom = roomStart;
    }

    public void leftTurn() {
        if(direction == 'N') {
            direction = 'W';
        } else if(direction == 'E') {
            direction = 'N';
        } else if(direction == 'S') {
            direction = 'E';
        } else if(direction == 'W') {
            direction = 'S';
        }
    }

    public void rightTurn() {
        if(direction == 'N') {
            direction = 'E';
        } else if(direction == 'E') {
            direction = 'S';
        } else if(direction == 'S') {
            direction = 'W';
        } else if(direction == 'W') {
            direction = 'N';
        }
    }

    public void moveForward() {
        moveForward(1);
    }

    //TODO potentially map direction to the tile robot is looking at? Think of futureproofing for future directions
    private void moveForward(int steps) {
        if(direction == 'N') {
            yCoord += steps;
        } else if(direction == 'E') {
            xCoord += steps;
        } else if(direction == 'S') {
            yCoord -= steps;
        } else if(direction == 'W') {
            xCoord -= steps;
        }
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
