package myProject;
// import Junit packages
import static org.junit.Assert.*;
import org.junit.Test;

/*
 * HeatTest is a unit testing class to test methods in Celsius, Fahrenheit & Kelvin classes.
 */
public class HeatTest {

	@Test
	public void testHeat() {
		
		// assign value to scalar value
		double scalar = 100;
		
		// instantiate classes with scalar value as parameter
		Kelvin myKelvin = new Kelvin(scalar);
		Celsius myCelsius = new Celsius(scalar);
		Fahrenheit myFahrenheit = new Fahrenheit(scalar);
		
		// Convert values & perform tests
		assertEquals(37.7778, myFahrenheit.toCelsius(), 0.01);
		assertEquals(310.928, myFahrenheit.toKelvin(), 0.01);
		assertEquals(-173.15, myKelvin.toCelsius(), 0.01);
		assertEquals(-279.67, myKelvin.toFahrenheit(), 0.01);
		assertEquals(373.15, myCelsius.toKelvin(), 0.01);
		assertEquals(212, myCelsius.toFahrenheit(), 0.01);
		
	}

}
