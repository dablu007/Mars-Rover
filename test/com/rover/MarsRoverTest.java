package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void shouldGivePositionOfRoverWhenNotMoved() {
        MarsRover marsRover = new MarsRover(0,0,"N");

        assertEquals(new MarsRover(0,0,"N"),marsRover.getPosition());
    }

    @Test
    public void shouldGiveTheRoverPositionWhenMovedForDirectionOnly() {
        MarsRover marsRover = new MarsRover(0,0,"N");

        marsRover.changeDirection("RL");
        assertEquals(new MarsRover(0,0,"S"),marsRover.getPosition());
    }
}
