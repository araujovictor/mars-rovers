package br.com.test.marsrover;

import br.com.marsrover.Rover;
import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void RoverInstructionsTest() {
        Rover rover = new Rover();
        rover.setInstructions("LMLMLMLMM");

        Assert.assertEquals("LMLMLMLMM", rover.getInstructions());
    }

    @Test
    public void RoverCoordXTest() {
        Rover rover = new Rover();
        rover.setCoordX(5);

        Assert.assertEquals(5, rover.getCoordX());
    }

    @Test
    public void RoverCoordYTest() {
        Rover rover = new Rover();
        rover.setCoordY(4);

        Assert.assertEquals(4, rover.getCoordY());
    }

    @Test
    public void RoverFacingTest(){
        Rover rover = new Rover();
        rover.setFacing('S');

        Assert.assertEquals('S', rover.getFacing());
    }
}
