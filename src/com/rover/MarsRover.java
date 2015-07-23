package com.rover;


import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private String direction;
    private static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");
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
            value = 1;
        value = 3;
        turnDirection(value);

    }

    public void turnDirection(int value){
        direction = DIRECTIONS.get((DIRECTIONS.indexOf(direction) + value) % DIRECTIONS.size());
    }

    public void moveRover(String input) {
        for (int i = 0; i < input.length(); i++) {
            changeDirection(Character.toString(input.charAt(i)));
        }
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
