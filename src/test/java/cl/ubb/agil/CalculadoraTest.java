package cl.ubb.agil;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;


import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.Calculadora;


public class CalculadoraTest {
	
	
	@Test
	public void CreateCalculadora() {
		Calculadora cal = new Calculadora();
	}
	
	@Test
	public void sumaDosyTresEsCinco() {
		Calculadora cal = new Calculadora();
		
		int Result = cal.suma(2,3);
		
		assertThat(Result,is(5));
	}
	
	@Test
	public void sumamenosunoysieteEsseis() {
		Calculadora cal = new Calculadora();
		
		int Result = cal.suma(-1,7);
		
		assertThat(Result,is(6));
	}
	
	
	

}
