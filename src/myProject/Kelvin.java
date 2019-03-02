package myProject;

/*
 * Kelvin class implements HeatScalable interface, stores Kelvin temperature
 * & converts to Fahrenheit & Celcius
 */

public class Kelvin implements HeatScalable {
	
	private double temperature = 0;
	
	// method returns Kelvin temp
	public double toKelvin() {
		return temperature;
	}
	
	// method returns Celcius temp
	public double toCelcius() {
		return temperature - 273.15;
	}
	
	// method returns Fahrenheit temp
	public double toFahrenheit() {
		return (9 * temperature) / 5 - 459.67;
	}
	
	// method returns string description of Kelvin instance
	public String toString() {
		return "Fahrenheit temperature: " + temperature + "F";
	}
}
