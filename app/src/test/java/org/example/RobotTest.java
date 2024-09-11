package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Room room;

    @BeforeEach
    void setUp() {
        room = new Room(3, 3);
    }

    @Test void robotInitializes() {
        Robot classUnderTest = new Robot(1, 2, 'E', room);
        assertEquals(1, classUnderTest.getxCoord(), "X-start should be 1");
        assertEquals(2, classUnderTest.getyCoord(), "Y-start should be 2");
        assertEquals('E', classUnderTest.getDirection(), "Robot should be facing East");
    }

    @Test void robotMovesForward() {
        Robot classUnderTest = new Robot(1, 1, 'N', room);
        classUnderTest.moveForward();
        assertEquals(1, classUnderTest.getxCoord(), "Robot should not move sideways");
        assertEquals(2, classUnderTest.getyCoord(), "Robot should move one step north (y-positive direction)");
        assertEquals('N', classUnderTest.getDirection(), "Robot should not change direction");
    }

    @Test void robotTurnsLeft() {
        Robot classUnderTest = new Robot(2, 2, 'N', room);
        classUnderTest.leftTurn();
        assertEquals(2, classUnderTest.getxCoord(), "Robot should not move");
        assertEquals(2, classUnderTest.getyCoord(), "Robot should not move)");
        assertEquals('W', classUnderTest.getDirection(), "Robot should be facing West");
    }

    @Test void robotTurnsRight() {
        Robot classUnderTest = new Robot(2, 2, 'N', room);
        classUnderTest.rightTurn();
        assertEquals(2, classUnderTest.getxCoord(), "Robot should not move");
        assertEquals(2, classUnderTest.getyCoord(), "Robot should not move)");
        assertEquals('E', classUnderTest.getDirection(), "Robot should be facing East");
    }

    @Test void robotTurns360Degrees() {
        Robot classUnderTest = new Robot(2, 2, 'N', room);
        classUnderTest.rightTurn();
        classUnderTest.rightTurn();
        classUnderTest.rightTurn();
        classUnderTest.rightTurn();
        assertEquals(2, classUnderTest.getxCoord(), "Robot should not move");
        assertEquals(2, classUnderTest.getyCoord(), "Robot should not move)");
        assertEquals('N', classUnderTest.getDirection(), "Robot should be facing North");
    }

    @Test void robotThrowsExceptionOutOfBounds() {
        Robot classUnderTest = new Robot(2, 2, 'E', room);
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, classUnderTest::moveForward);
        assertEquals("Robot is outside the room", exception.getMessage());
    }
}
