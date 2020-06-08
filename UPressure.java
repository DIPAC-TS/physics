package physics;

public class UPressure extends UnitX {
	
	public static enum Library{
		ATM,
		INWG,
		INHG,
		KILOPASCAL,
		KSI,
		MICRON,
		PASCAL,
		BAR,
		PSI,
		TORR
	}
	
	public UPressure(){
		super(PhyProperty.PRESSURE);
	}
	
	public UPressure(Library lib){
		super(PhyProperty.PRESSURE);
		if (lib == Library.ATM){
			this.setCFactor(101325);
			this.setSymbol("atm");
		} else if (lib == Library.INWG){
			this.setCFactor(1/1000/9.80665/25.4);
			this.setSymbol("inWG");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.INHG){
			this.setCFactor(1/13.594/9.80665/25.4);
			this.setSymbol("inHG");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.KILOPASCAL) {
			this.setCFactor(1000);
			this.setSymbol("kPa");
		} else if (lib == Library.KSI) {
			this.setCFactor(1000*9.80665*0.453392/0.0254/0.0254);
			this.setSymbol("ksi");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.MICRON){
			this.setCFactor(101325/760000);
			this.setSymbol("micron");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.PSI) {
			this.setCFactor(9.80665*.0453392/0.0254/0.0254);
			this.setSymbol("psi");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.TORR) {
			this.setCFactor(101325/760);
			this.setSymbol("Torr");
		} else {
			 // Library.PASCAL
		}	
	}
	
	public double getGageP_Of(double val){
		double result = val - 101325 / this.getCFactor();
		return result;
	}
	
	public double getVacuumP_Of(double val){
		double result = val / this.getCFactor() / 101325 * 760000;
		return result;
	}

}
