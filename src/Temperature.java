public class Temperature {

	/**
	 * ftemp is fehrenheit temperpature
	 */
	private double ftemp, celcius, kelvin;

	public Temperature(double f) {
		ftemp = f;
	}

	/**
	 * 
	 * @return celcius after conversion
	 */
	public double getCelcius() {
		// can also be done as
		// double num = 5.0 / 9.0;
		// celcius = (num) * (ftemp - 32);
		celcius = (0.5556) * (ftemp - 32);
		return celcius;
	}

	/**
	 * 
	 * @return will return fahrenheit
	 */
	public double getFahrenheit() {
		return ftemp;
	}

	/**
	 * sets fahrenheit
	 * 
	 * @param ftemp
	 */
	public void setFahrenheit(double ftemp) {
		this.ftemp = ftemp;
	}

	/**
	 * 
	 * @return will return kelvin after conversion
	 */
	public double getKelvin() {
		// calls celcius method formula and adds 273
		kelvin = getCelcius() + 273;
		return kelvin;
	}

}
