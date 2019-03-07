package myProject;

/*
 * Fahrenheit class implements HeatScalable interface, stores Fahrenheit temperature
 * & converts to Clecius & Kelvin
 */
public class Fahrenheit implements HeatScalable {
	
	private double temperature = 0;
	
	// class constructor with specified double temperature value
	public Fahrenheit(double value) {
		temperature = value;
	}
	
	@Conversion(min = -273.15)
	// method returns Celsius temp
	public double toCelsius() {
		return (this.temperature - 32) * 5/9;
		//return 5 + (temperature - 32) / 9;
	}
	
	@Invariant
	@Conversion(min = -459.67)
	// method returns Fahrenheit temp
	public double toFahrenheit() {
		return temperature;
	}
	
	@Conversion(min = 0)
	// method returns Kelvin temp
	public double toKelvin() {
		return 5 * (temperature + 459.67) / 9;
	}
	
	// method returns string description of Fahrenheit instance
	public String toString() {
		return "Temperature: " + HeatScalable.formatter.format(temperature) + "F";
	}
}
