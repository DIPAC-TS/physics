package physics;

public class UTime extends Unit{
	public static enum Library{
		NANOSECOND,
		MILISECOND,
		SECOND,
		MINUTE,
		HOUR,
		DAY
	}
	
	public UTime(){
		super(PhyProperty.TIME);
	}
	
	public UTime(Library lib){
		super(PhyProperty.TIME);
		if (lib == Library.NANOSECOND){
			setCFactor(1e-9);
			setSymbol("ns");
		} else if (lib == Library.MILISECOND){
			setCFactor(1e-3);
			setSymbol("ms");
		} else if (lib == Library.MINUTE){
			setCFactor(60);
			setSymbol("min");
		} else if (lib == Library.HOUR){
			setCFactor(3600);
			setSymbol("h");
		} else if (lib == Library.DAY){
			setCFactor(86400);
			setSymbol("day");
		} else {
			// Library.SECOND
		}
	}
}