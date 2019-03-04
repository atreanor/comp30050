package myProject;

/*
 * Celcius class implements HeatScalable interface, stores Clecius temperature
 * & converts to Fahrenheit & Kelvin
 */
public class Celcius implements HeatScalable {
	
	private double temperature = 0;
	
	// class constructor
	public Celcius(double value) {
		temperature = value;
	}
	
	@Invariant 
	@Conversion(min = -273.15)
	public double toCelcius() {
		// method returns celcius temp
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
	public String toStrin() {
		return HeatScalable.formatter.format(temperature) + "C";
	}
	
}
