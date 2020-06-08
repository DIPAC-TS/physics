package physics;

public class ULength extends Unit {
	
	public static enum Library{
		MILIMETER,
		CENTIMETER,
		METER,
		KILOMETER,
		INCH,
		FOOT,
		YARD,
		MILE
	}
	
	public ULength(){
		super(Unit.PhyProperty.LENGTH);
	}
	
	public ULength(Library lib){
		super(Unit.PhyProperty.LENGTH);
		if (lib == Library.MILIMETER){
			setCFactor(0.001);
			setSymbol("mm");
		} else if (lib == Library.CENTIMETER){
			setCFactor(0.01);
			setSymbol("cm");
		} else if (lib == Library.KILOMETER){
			setCFactor(1000);
			setSymbol("km");
		} else if (lib == Library.INCH){
			setCFactor(0.0254);
			setSymbol("in");
			setSystem(MSystem.IP);
		} else if (lib == Library.FOOT){
			setCFactor(0.3048);
			setSymbol("ft");
			setSystem(MSystem.IP);
		} else if (lib == Library.YARD){
			setCFactor(0.9144);
			setSymbol("yd");
			setSystem(MSystem.IP);
		} else if (lib == Library.MILE){
			setCFactor(1609.344);
			setSymbol("mi");
			setSystem(MSystem.IP);
		} else {
			// Library.METER
		}
	}
	
}
