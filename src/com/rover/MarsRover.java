package com.rover;


public class MarsRover {
    private int x;
    private int y;
    private String direction;
    private final int plateauPositionX = 5;
    private final int plateauPositionY = 5;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover getPosition() {
        return new MarsRover(x,y, direction);
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

    public void changeDirection(String input) {
        if (input == "R" && direction.equals("N"))
            direction = "E";
        else if (input == "L" && direction.equals("E"))
            direction = "N";

    }

    public void moveRover(String input) {
        for (int i = 0; i < input.length(); i++) {
            changeDirection(Character.toString(input.charAt(i)));
        }
    }
}
