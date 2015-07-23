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

        marsRover.moveRover("R");
        assertEquals(new MarsRover(0,0,"E"),marsRover.getPosition());
    }

    @Test
    public void shouldGiveTheRoverPositionWhenMovedForDirectionsDiffrently() {
        MarsRover marsRover = new MarsRover(0,0,"N");

        marsRover.moveRover("RLRLRLRL");
        assertEquals(new MarsRover(0,0,"N"),marsRover.getPosition());
    }

    @Test
    public void shouldMoveTheRoverWhenDirectionFacingNorth() {
        MarsRover marsRover = new MarsRover(0,0,"N");

        marsRover.moveRover("MMM");
        assertEquals(new MarsRover(0,3,"N"),marsRover.getPosition());
    }

    @Test
    public void shouldMoveTheRoverWhenDirectionFacingEast() {
        MarsRover marsRover = new MarsRover(0,0,"E");

        marsRover.moveRover("MMM");
        assertEquals(new MarsRover(3,0,"E"),marsRover.getPosition());
    }
    @Test
    public void shouldMoveTheRoverWhenDirectionFacingWest() {
        MarsRover marsRover = new MarsRover(0,0,"W");

        marsRover.moveRover("MMM");
        assertEquals(new MarsRover(-3,0,"W"),marsRover.getPosition());
    }
}
