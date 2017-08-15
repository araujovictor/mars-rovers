package br.com.test.marsrover;

import org.junit.Assert;
import org.junit.Test;

import br.com.marsrover.Plateau;

public class PlateauTest {
	
	@Test
	public void outsideAreaTest(){
		Plateau plateau = new Plateau(12,7);
		Boolean outsideArea = false;
		
		outsideArea = plateau.outsideArea(11, 8);
		
		Assert.assertEquals(true, outsideArea);
		
	}
}
