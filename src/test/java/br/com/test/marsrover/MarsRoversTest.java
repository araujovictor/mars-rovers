package br.com.test.marsrover;

import org.junit.Assert;
import org.junit.Test;

import br.com.marsrover.MarsRovers;
import br.com.marsrover.Plateau;
import br.com.marsrover.Rover;

public class MarsRoversTest {

	@Test
	public void marsRoverTest (){
		Plateau plateau = new Plateau(5,5);
		Rover rover = new Rover(1, 2, 'N', "LMLMLMLMM");
		
		MarsRovers marsRover = new MarsRovers(rover, plateau);
		marsRover.intructionsRun();
		
		Assert.assertEquals("1 3 N", marsRover.afterMove());
	}
	
	@Test
	public void leftRotateTest(){
		Plateau plateau = new Plateau(5,5);
		Rover rover = new Rover(1, 2, 'N', "LMLMLMLMM");
		
		MarsRovers marsRover = new MarsRovers(rover, plateau);
		marsRover.rotateLeft();
		
		Assert.assertEquals("1 2 E", marsRover.afterMove());
	}
	
	@Test
	public void rightRotateTest(){
		Plateau plateau = new Plateau(5,5);
		Rover rover = new Rover(1, 2, 'N', "LMLMLMLMM");
		
		MarsRovers marsRover = new MarsRovers(rover, plateau);
		marsRover.rotateRight();
		
		Assert.assertEquals("1 2 W", marsRover.afterMove());
	}
	
	@Test
	public void moveFowardTest(){
		Plateau plateau = new Plateau(5,5);
		Rover rover = new Rover(1, 2, 'N', "LMLMLMLMM");
		
		MarsRovers marsRover = new MarsRovers(rover, plateau);
		marsRover.moveFoward();
		
		Assert.assertEquals("1 3 N", marsRover.afterMove());
	}
}
