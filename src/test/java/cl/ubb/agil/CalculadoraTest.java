package cl.ubb.agil;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;



import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.Calculadora;


public class CalculadoraTest {
	
	private Calculadora cal;
	@Before
	public void setup() throws Exception {
		cal = new Calculadora();
	}
	
	@Test
	public void CreateCalculadora() {
		Calculadora cal = new Calculadora();
	}
	
	@Test
	public void sumaDosyTresEsCinco() {
		
		assertThat(cal.suma(2,3),is(5));
	}
	
	@Test
	public void sumamenosunoysieteEsseis() {
		
		assertThat(cal.suma(-1,7),is(6));
	}
	
	@Test
	public void restadocientosysetentaytresescientoveitisiete() {
		
		assertThat(cal.resta(200,73),is(127));
	}
	
	@Test
	public void restamenosdiezycincoesmenosquince() {
		
		assertThat(cal.resta(-10,5),is(-15));
	}
	
	@Test
	public void multiseisportresesdieciocho(){
		
		assertThat(cal.multiplica(6,3),is(18));
		
	}
	
	@Test
	public void doceporcuatrocuarentayocho(){
		
		assertThat(cal.multiplica(12,4),is(48));
		
	}
	
	@Test
	public void docedivididoportresescuatro(){
		
		assertThat(cal.multiplica(12,3),is(4));
		
	}
	
	

}
