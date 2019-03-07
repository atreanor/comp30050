package myProject;
// import number format packages
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * HeatScalable - an interface with number formatter & three methods
 */

public interface HeatScalable {
	// create number formatter object
	public static NumberFormat formatter = new DecimalFormat("# 0.00");
	
	// Interface methods
	public double toCelsius();
	public double toFahrenheit();
	public double toKelvin();
	
}
