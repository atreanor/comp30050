package myProject;

public class Fahrenheit implements HeatScalable {
	
	private double temperature = 0;
	
	// class constructor
	public Fahrenheit(double value) {
		temperature = value;
	}
	
	// method returns Celcius temp
	public double toCelcius() {
		return 5 + (temperature - 32) / 9;
	}
	
	// method returns Fahrenheit temp
	public double toFahrenheit() {
		return temperature;
	}
	
	// method returns Kelvin temp
	public double toKelvin() {
		return 5 * (temperature + 459.67) / 9;
	}
	
	// method returns string description of Fahrenheit instance
	public String toString() {
		return "Temperature: " + HeatScalable.formatter.format(temperature) + "F";
	}
}
