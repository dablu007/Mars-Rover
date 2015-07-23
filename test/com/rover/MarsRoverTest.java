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

    @Test
    public void shouldMoveTheRoverWhenDirectionFacingSouth() {
        MarsRover marsRover = new MarsRover(0,0,"S");

        marsRover.moveRover("MMM");
        assertEquals(new MarsRover(0,-3,"S"),marsRover.getPosition());
    }

    @Test
    public void shouldMoveTheRoverWhenDirectionsIsNorthAndInputIsChanging() {
        MarsRover marsRover = new MarsRover(1,2,"N");

        marsRover.moveRover("LMLMLMLMM");
        assertEquals(new MarsRover(1,3,"N"),marsRover.getPosition());
    }

    @Test
    public void shouldMoveTheRoverToTheEndWhenDirectionsIsNorthAndPlaneIsEnded() {
        MarsRover marsRover = new MarsRover(1,2,"N");

        marsRover.moveRover("LMLMLMLMMMMM");
        assertEquals(new MarsRover(1,5,"N"),marsRover.getPosition());
    }

    @Test
    public void shouldMoveTheRoverToTheEndWhenDirectionsIsEastAndPlaneIsEnded() {
        MarsRover marsRover = new MarsRover(1,2,"E");

        marsRover.moveRover("LRMMMMMM");
        assertEquals(new MarsRover(5,2,"E"),marsRover.getPosition());
    }
}
