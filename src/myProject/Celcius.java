package myProject;

public class Celcius implements HeatScalable {
	
	private double temperature = 0;
	
	// class constructor
	public Celcius(double value) {
		temperature = value;
	}
	
	// method returns celcius temp
	public double toCelcius() {
		return temperature;
	}
	
	// method returns fahrenheit temp
	public double toFahrenheit() {
		return (9*temperature) / 5 + 32;
	}
	
	// method returns kelvin temp
	public double toKelvin() {
		return temperature + 273.15;
	}
	
	// method returns string description of Celcius instance
	public String toStrin() {
		return HeatScalable.formatter.format(temperature) + "C";
	}
	
}
