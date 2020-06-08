package physics;

public class UTemperature extends Unit{
	
	public static enum Library {
		KELVIN,
		RANKINE
	}
	public UTemperature(){
		super(Unit.PhyProperty.TEMPERATURE);
	}
	
	public UTemperature(Library lib){
		super(Unit.PhyProperty.TEMPERATURE);
		if (lib == Library.RANKINE){
			setCFactor(5.0 / 9.0);
			setSymbol("R");
			setSystem(MSystem.IP);
		} else {
			// Library.KELVIN
		}
	}
	
	public double getFahrenheitOf(double val){
		double result = (this.isSISystem()) ? val * 9 / 5 - 491.67: val - 459.67;
		return result;
	}
	
	public double getCelsiusOf(double val){
		double result = (this.isSISystem()) ? val - 273.15: val * 5 / 9 - 273.15;
		return result;
	}
}
