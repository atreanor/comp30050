package myProject;

/*
 * Kelvin class implements HeatScalable interface, stores Kelvin temperature
 * & converts to Fahrenheit & Celsius
 */

public class Kelvin implements HeatScalable {
	
	private double temperature = 0;
	
	// class constructor with specified double temperature value
	public Kelvin(double value) {
		temperature = value;
	}
	
	@Invariant
	@Conversion(min = 0)
	// method returns Kelvin temp
	public double toKelvin() {
		return temperature;
	}
	
	@Conversion(min = -273.15)
	// method returns Celsius temp
	public double toCelsius() {
		return temperature - 273.15;
	}
	
	@Conversion(min = -459.67)
	// method returns Fahrenheit temp
	public double toFahrenheit() {
		return (9 * temperature) / 5 - 459.67;
	}
	
	@Conversion()
	// method returns string description of Kelvin instance
	public String toString() {
		return "Fahrenheit temperature: " + temperature + "F";
	}
}
