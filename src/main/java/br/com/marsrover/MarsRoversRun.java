package br.com.marsrover;

public class MarsRoversRun {
	
	public static void main(String[] args) {
		
		Plateau plateau = new Plateau(5,5);
		Rover rover = new Rover(1, 2, 'N', "LMLMLMLMM");
		
		MarsRovers marsRover = new MarsRovers(rover, plateau);
		marsRover.intructionsRun();
		
		System.out.println(marsRover.afterMove());
	}
}
