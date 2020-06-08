package physics;

public class UM_Flow extends UnitX{
	public static enum Library{
		GRAM_MIN,
		GRAM_H,
		KILOGRAM_S,
		KILOGRAM_H,
		POUND_MIN,
		POUND_S
	}
	
	public UM_Flow(){
		super(PhyProperty.MASS_FLOW);
	}
	
	public UM_Flow(Library lib){
		super(PhyProperty.MASS_FLOW);
		if (lib == Library.GRAM_MIN){
			this.setCFactor(1/60000);
			this.setSymbol("g/min");
		} else if (lib == Library.GRAM_H){
			this.setCFactor(1/3600000);
			this.setSymbol("g/h");
		} else if (lib == Library.KILOGRAM_H){
			this.setCFactor(1/3600);
			this.setSymbol("kg/h");
		} else if (lib == Library.POUND_MIN){
			this.setCFactor(0.45359237/60);
			this.setSymbol("lb/min");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.POUND_S){
			this.setCFactor(0.45359237);
			this.setSymbol("lib/s");
			this.setSystem(MSystem.IP);
		} else {
			// lib == Library.KILOGRAM_S
		}
	}

}