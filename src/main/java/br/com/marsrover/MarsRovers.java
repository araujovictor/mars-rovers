package br.com.marsrover;

public class MarsRovers {

	Rover rover;
	Plateau plateau;

	public MarsRovers(Rover rover, Plateau plateau) {
		this.rover = rover;
		this.plateau = plateau;
	}

	public void intructionsRun() {
		for (int i = 0; i < rover.getInstructions().length(); i++) {
			Character instruction = rover.getInstructions().charAt(i);
			switch (instruction) {
			case 'M':
				moveFoward();
				break;
			case 'R':
				rotateRight();
				break;
			case 'L':
				rotateLeft();
				break;
			}
		}
	}

	public void moveFoward() {
		switch (rover.getFacing()) {
		case 'N':
			if (!(plateau.outsideArea(rover.getCoordX(), rover.getCoordY() + 1))) {
				rover.setCoordY(rover.getCoordY() + 1);
			} else {
				throw new IllegalArgumentException(
						"Não é possível mover para a coordenada desejada, pois ela se encontra fora da area delimitada.");
			}
			break;

		case 'S':
			if (!(plateau.outsideArea(rover.getCoordX(), rover.getCoordY() - 1))) {
				rover.setCoordY(rover.getCoordY() - 1);
			} else {
				throw new IllegalArgumentException(
						"Não é possível mover para a coordenada desejada, pois ela se encontra fora da area delimitada.");
			}
			break;

		case 'E':
			if (!(plateau.outsideArea(rover.getCoordX() + 1, rover.getCoordY()))) {
				rover.setCoordX(rover.getCoordX() + 1);
			} else {
				throw new IllegalArgumentException(
						"Não é possível mover para a coordenada desejada, pois ela se encontra fora da area delimitada.");
			}
			break;

		case 'W':
			if (!(plateau.outsideArea(rover.getCoordX() - 1, rover.getCoordY()))) {
				rover.setCoordX(rover.getCoordX() - 1);
			} else {
				throw new IllegalArgumentException(
						"Não é possível mover para a coordenada desejada, pois ela se encontra fora da area delimitada.");
			}
			break;

		}
	}

	public void rotateLeft() {
		switch (rover.getFacing()) {
		case 'N':
			rover.setFacing('W');
			break;

		case 'S':
			rover.setFacing('E');
			break;

		case 'E':
			rover.setFacing('N');
			break;

		case 'W':
			rover.setFacing('S');
			break;

		}
	}

	public void rotateRight() {
		switch (rover.getFacing()) {
		case 'N':
			rover.setFacing('E');
			break;

		case 'S':
			rover.setFacing('W');
			break;

		case 'E':
			rover.setFacing('S');
			break;

		case 'W':
			rover.setFacing('N');
			break;

		}
	}

	public String afterMove() {
		return rover.toString();
	}
}
