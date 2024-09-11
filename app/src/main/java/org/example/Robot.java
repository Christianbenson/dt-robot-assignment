package org.example;

import com.google.common.primitives.Chars;

public class Robot {
    private int xCoord;
    private int yCoord;
    private char direction;
    private Room currentRoom;
    //TODO should add statics instead of using chars in code for readability
    private static char[] possibleDirections = {'N', 'E', 'S', 'W'};

    //TODO implement input validation, no negative coords + only N,E,W,S as direction
    public Robot(int xStart, int yStart, char directionStart, Room roomStart) {
        xCoord = xStart;
        yCoord = yStart;
        direction = directionStart;
        currentRoom = roomStart;
    }

    public Robot(String input, Room room) throws Exception {
        this(getXFromString(input), getYFromString(input), getDirectionFromString(input), room);
    }

    private static int getXFromString(String input) {
        String[] spaceSeparatedStrings = input.split("\\s+");
        return Integer.parseInt(spaceSeparatedStrings[0]);
    }

    private static int getYFromString(String input) {
        String[] spaceSeparatedStrings = input.split("\\s+");
        return Integer.parseInt(spaceSeparatedStrings[1]);
    }

    private static char getDirectionFromString(String input) {
        String[] spaceSeparatedStrings = input.split("\\s+");

        return spaceSeparatedStrings[2].charAt(0);
    }

    public void executeStringOfCommands(String commands) throws Exception {
        validateCommandInput(commands);
        for(char c : commands.toCharArray()) {
            System.out.println(c);
            executeSingleCommand(c);
        }
    }

    private void executeSingleCommand(char command) {
        if(command == 'F') {
            moveForward();
        } else if (command == 'L') {
            leftTurn();
        } else if (command == 'R') {
            rightTurn();
        }
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
    private void moveForward(int steps) throws IndexOutOfBoundsException {
        if(direction == 'N') {
            yCoord -= steps;
        } else if(direction == 'E') {
            xCoord += steps;
        } else if(direction == 'S') {
            yCoord += steps;
        } else if(direction == 'W') {
            xCoord -= steps;
        }
        throwIfOutsideRoom();
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

    private void throwIfOutsideRoom() {
        if(!currentRoom.isInRoom(xCoord, yCoord)) {
            throw new IndexOutOfBoundsException("Robot is outside the room");
        }
    }

    private void validateCommandInput(String commands) throws Exception {
        for(char c : commands.toCharArray()) {
            char command = Character.toUpperCase(c);
            if(command == 'L' || command == 'F' || command == 'R') {
                continue;
            } else {
                throw new Exception("Only L, F and R are recognized as commands");
            }
        }
    }

    private boolean isValidDirection(char c) {
        char upperCase = Character.toUpperCase(c);
        return Chars.contains(possibleDirections, c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Report: ");
        sb.append(xCoord);
        sb.append(" ");
        sb.append(yCoord);
        sb.append(" ");
        sb.append(direction);
        return sb.toString();
    }
}
