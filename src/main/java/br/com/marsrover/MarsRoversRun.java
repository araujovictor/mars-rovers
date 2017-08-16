package br.com.marsrover;

import java.util.Scanner;

public class MarsRoversRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String coordLimits = sc.nextLine();
		coordLimits = coordLimits.replaceAll("[\\s+]", "");
		Plateau plateau = new Plateau((Integer.parseInt(String.valueOf(coordLimits.charAt(0)))),
				(Integer.parseInt(String.valueOf(coordLimits.charAt(1)))));

		while (sc.hasNextLine()) {

			String coordRover = sc.nextLine();
			coordRover = coordRover.replaceAll("[\\s+]", "").toUpperCase();
			String instructionsRover = sc.nextLine();
			instructionsRover = instructionsRover.replaceAll("[\\s+]", "").toUpperCase();
			Rover rover = new Rover((Integer.parseInt(String.valueOf(coordRover.charAt(0)))),
					(Integer.parseInt(String.valueOf(coordRover.charAt(1)))), coordRover.charAt(2), instructionsRover);

			MarsRovers marsRover = new MarsRovers(rover, plateau);
			marsRover.intructionsRun();

			System.out.println(marsRover.afterMove());
		}

	}
}
