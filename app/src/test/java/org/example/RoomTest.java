/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test void roomSetsWidth() {
        Room classUnderTest = new Room(5,7);
        assertEquals(classUnderTest.getWidth(), 5, "Width should be 5");
    }

    @Test void roomSetsDepth() {
        Room classUnderTest = new Room(5,7);
        assertEquals(classUnderTest.getDepth(), 7, "Depth should be 7");
    }
}
