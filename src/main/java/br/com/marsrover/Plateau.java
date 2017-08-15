package br.com.marsrover;

public class Plateau {
	
	private int coordXFin;
	private int coordYFin;
	
	public Plateau (){
		
	}

	public Plateau(int coordXFin, int coordYFin) {
		this.coordXFin = coordXFin;
		this.coordYFin = coordYFin;
	}
	
	public boolean outsideArea(int coordX, int coordY){
		if(coordX > coordXFin || coordY > coordYFin || coordX < 0 || coordY < 0){
			return true;
		}else {
			return false;
		}
	}
		
	
}
