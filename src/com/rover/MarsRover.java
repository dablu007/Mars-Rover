package com.rover;


import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private String direction;
    private static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");
    private final int plateauPositionY = 5;
    private final int plateauPositionX = 5;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover getPosition() {
        return new MarsRover(x,y, direction);
    }

    public void changeDirection(String input) {
        int value;
        if (input.equals("L"))
            value = 3;
        else
            value = 1;
        turnDirection(value);

    }

    public void turnDirection(int value){
        direction = DIRECTIONS.get((DIRECTIONS.indexOf(direction) + value) % DIRECTIONS.size());
    }

    public void moveRover(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'M')
                moveRoverForward("M");
            else
                changeDirection(Character.toString(input.charAt(i)));
        }
    }

    private void moveRoverForward(String input) {
        if (direction.equals("N") && input.equals("M") && y < plateauPositionY)
            this.y += 1;
        else if (direction.equals("E") && input.equals("M") && x < plateauPositionX)
            this.x += 1;
        else if (direction.equals("W") && input.equals("M"))
            this.x += -1;
        else if (direction.equals("S") && input.equals("M"))
            this.y += -1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover marsRover = (MarsRover) o;

        if (x != marsRover.x) return false;
        if (y != marsRover.y) return false;
        return !(direction != null ? !direction.equals(marsRover.direction) : marsRover.direction != null);

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
