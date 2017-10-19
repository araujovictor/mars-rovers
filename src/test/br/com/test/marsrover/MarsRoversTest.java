package br.com.test.marsrover;

import br.com.marsrover.MarsRovers;
import br.com.marsrover.Plateau;
import br.com.marsrover.Rover;
import org.junit.Assert;
import org.junit.Test;

public class MarsRoversTest {

    @Test
    public void marsRoverTest() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(1, 2, 'N', "LMLMLMLMMRMRMRMRM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.intructionsRun();

        Assert.assertEquals("1 3 N", marsRover.afterMove());
    }

    @Test
    public void leftRotateTest() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(1, 2, 'N', "LMLMLMLMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.rotateLeft();

        Assert.assertEquals("1 2 W", marsRover.afterMove());
    }

    @Test
    public void rightRotateTest() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(1, 2, 'N', "RMRMRMRMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.rotateRight();

        Assert.assertEquals("1 2 E", marsRover.afterMove());
    }

    @Test
    public void moveFowardTest() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(1, 2, 'N', "LMLMLMLMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.moveFoward();

        Assert.assertEquals("1 3 N", marsRover.afterMove());
    }

    @Test(expected = IllegalArgumentException.class)
    public void marsRoverErrorTest() {
        Plateau plateau = new Plateau(8, 9);
        Rover rover = new Rover(5, 6, 'N', "LMMMLMRMLMMRMMMRMMMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.intructionsRun();
    }

    @Test(expected = IllegalArgumentException.class)
    public void moveFowardNErrorTest() {
		Plateau plateau = new Plateau(8, 9);
        Rover rover = new Rover(10, 10, 'N', "MMMMMMMMMMMMMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.moveFoward();
    }

    @Test(expected = IllegalArgumentException.class)
    public void moveFowardSErrorTest() {
        Plateau plateau = new Plateau(8, 9);
        Rover rover = new Rover(10, 10, 'S', "MMMMMMMMMMMMMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.moveFoward();
    }

    @Test(expected = IllegalArgumentException.class)
    public void moveFowardEErrorTest() {
        Plateau plateau = new Plateau(8, 9);
        Rover rover = new Rover(10, 10, 'E', "MMMMMMMMMMMMMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.moveFoward();
    }

    @Test(expected = IllegalArgumentException.class)
    public void moveFowardWErrorTest() {
        Plateau plateau = new Plateau(8, 9);
        Rover rover = new Rover(10, 10, 'W', "MMMMMMMMMMMMMM");

        MarsRovers marsRover = new MarsRovers(rover, plateau);
        marsRover.moveFoward();
    }
}
