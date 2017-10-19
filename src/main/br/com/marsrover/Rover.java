package br.com.marsrover;

public class Rover {

    private int coordX;
    private int coordY;
    private Character facing;
    private String instructions;

    public Rover() {

    }

    public Rover(int coordX, int coordY, Character facing, String instructions) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.facing = facing;
        this.instructions = instructions;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public char getFacing() {
        return facing;
    }

    public void setFacing(Character facing) {
        this.facing = facing;
    }

    @Override
    public String toString() {
        StringBuilder roverFinalPosition = new StringBuilder();
        roverFinalPosition.append(coordX);
        roverFinalPosition.append(" ");
        roverFinalPosition.append(coordY);
        roverFinalPosition.append(" ");
        roverFinalPosition.append(facing);
        return roverFinalPosition.toString();
    }

}
