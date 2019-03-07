package myProject;

/*
 * Celsius class implements HeatScalable interface, stores Clecius temperature
 * & converts to Fahrenheit & Kelvin
 */
public class Celsius implements HeatScalable {
	
	private double temperature = 0;
	
	// class constructor with specified double temperature value
	public Celsius(double value) {
		temperature = value;
	}
	
	@Invariant 
	@Conversion(min = -273.15)
	public double toCelsius() {
		// method returns celsius temp
		return temperature;
	}
	
	@Conversion(min = -459.67)
	// method returns fahrenheit temp
	public double toFahrenheit() {
		return (9*temperature) / 5 + 32;
	}
	@Conversion(min = 0)
	// method returns kelvin temp
	public double toKelvin() {
		return temperature + 273.15;
	}
	
	// method returns string description of Celcius instance
	public String toString() {
		return HeatScalable.formatter.format(temperature) + "C";
	}
	
}
