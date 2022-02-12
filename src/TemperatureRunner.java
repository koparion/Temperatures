import java.util.Scanner;

public class TemperatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring scanner object
		Scanner input = new Scanner(System.in);
		// Asking user for temperature number
		System.out.print("Enter Temperature for Fehrenheit: ");
		// storing user input into inside input.nextDouble()
		double user = input.nextDouble();
		// Calling tempeature class and storing temperature inside
		Temperature obj = new Temperature(user);
		// displaying Celcius after conversion
		System.out.println("Celcius: " + obj.getCelcius());
		// displaying Kelvin after conversion
		System.out.println("Kelvin: " + obj.getKelvin());
	}
}
