package physics;

public class UDensity extends UnitX {
	public static enum Library{
		GRAM_CM3,
		GRAM_M3,
		KILOGRAM_L,
		KILOGRAM_M3,
		POUND_INCH3,
		POUND_FT3,
		POUND_GAL,	
	}
	public UDensity(){
		super(PhyProperty.DENSITY);
	}
	
	public UDensity(Library lib){
		super(PhyProperty.DENSITY);
		if (lib == Library.GRAM_CM3){
			this.setCFactor(1e-3);
			this.setSymbol("g/cm^3");
		} else if (lib == Library.GRAM_M3){
			this.setCFactor(1e3);
			this.setSymbol("g/m^3");
		} else if (lib == Library.KILOGRAM_L){
			this.setCFactor(1e-3);
		} else if (lib == Library.POUND_INCH3){
			this.setCFactor(0.45359237/0.0254/0.0254/0.0254);
			this.setSymbol("lbm/in^3");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.POUND_FT3){
			this.setCFactor(0.45359237/0.3048/0.3048/0.3048);
			this.setSymbol("lbm/ft^3");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.POUND_GAL){
			this.setCFactor(0.45359237/0.0254/0.0254/0.0254/231);
			this.setSymbol("lbm/gal");
			this.setSystem(MSystem.IP);
		} else {
			// Library.KILOGRAM_M3
		}
		
	}

}
