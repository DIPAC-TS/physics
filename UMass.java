package physics;

public class UMass extends Unit{
	
	public static enum Library{
		GRAM,
		KILOGRAM,
		TONNE,
		DALTON,
		SLUG,
		POUND
	}
	public UMass(){
		super(PhyProperty.MASS);
	}
	
	public UMass(Library lib){
		super(PhyProperty.MASS);
		if (lib == Library.KILOGRAM){
			setCFactor(1000.0);
			setSymbol("kg");
		} else if (lib == Library.TONNE){
			setCFactor(1e6);
			setSymbol("ton");
		} else if (lib == Library.DALTON){
			setCFactor(1.66053892173e-24);
			setSymbol("Da");
		} else if (lib == Library.SLUG){
			setCFactor(14593.903);
			setSymbol("slUg");
			setSystem(MSystem.IP);
		} else if(lib == Library.POUND){
			setCFactor(453.59237);
			setSymbol("lbm");
			setSystem(MSystem.IP);
		} else {
			// Library.GRAM
		}
	}
}

