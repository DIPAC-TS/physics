package physics;

public class UAcceleration extends UnitX {
	
	public static enum Library{
		CENTIMETER_SECOND2,
		METER_SECOND2,
		KILOMETER_HOUR2,
		INCH_SECOND2,
		FOOT_SECOND2,
		FOOT_MINUTE2,
		G_FORCE,
	}
	
	public UAcceleration(){
		super(PhyProperty.ACCELERATION);
	}
	
	public UAcceleration(Library lib){
		super(PhyProperty.ACCELERATION);
		if (lib == Library.CENTIMETER_SECOND2){
			this.setCFactor(0.01);
			this.setSymbol("cm/s^2");
		} else if (lib == Library.KILOMETER_HOUR2){
			this.setCFactor(1000/3600^2);
			this.setSymbol("km/h^2");
		} else if (lib == Library.INCH_SECOND2){
			this.setCFactor(0.0254);
			this.setSymbol("in/s^2");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.FOOT_SECOND2){
			this.setCFactor(0.3048);
			this.setSymbol("ft/s^2");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.FOOT_MINUTE2){
			this.setCFactor(0.3048/3600);
			this.setSymbol("ft/min^2");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.G_FORCE){
			this.setCFactor(9.80665);
			this.setSymbol("N/kg");
		} else {
			// Library.METER_SECOND2
		}
	}
	
}
