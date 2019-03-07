package myProject;
// import required junit & util packages 
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

/*
 * ParmeterizedHeatTest class to test Celsius, Fahrenheit & Kelvin class mehtods
 */
@RunWith(Parameterized.class)
public class ParameterizedHeatTest {
	public static final double WIGGLE = 0.01;
	
	@Parameter(0)
	public double celsius;
	@Parameter(1)
	public double fahrenheit;
	@Parameter(2)
	public double kelvin;
	
	@Parameters
	public static Collection<Object[]>data(){
		Object[][] data = new Object[][] {{0, 32, 273.15},
			{10, 50, 283.15}, {20, 68, 293.15}, {30, 86, 303.15},
			{40, 104, 313.15}, {50, 122, 323.15}, {60, 140, 333.15},
			{70, 158, 343.15}, {80, 176, 353.15}, {90, 194, 363.15},
			{100, 212, 373.15}};
		return Arrays.asList(data);
	}

	@Test
	public void testConversions() {
		Celsius c = new Celsius(celsius);
		Fahrenheit f = new Fahrenheit(fahrenheit);
		Kelvin k = new Kelvin(kelvin);
		
		assertEquals(kelvin, c.toKelvin(), WIGGLE);
		assertEquals(kelvin, f.toKelvin(), WIGGLE);
		assertEquals(celsius, f.toCelsius(), WIGGLE);
		assertEquals(celsius, k.toCelsius(), WIGGLE);
		assertEquals(fahrenheit, c.toFahrenheit(), WIGGLE);
		assertEquals(fahrenheit, k.toFahrenheit(), WIGGLE);
	}
}
