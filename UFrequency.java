package physics;

public class UFrequency extends UnitX{
	public static enum Library{
		HERTZ,
		RPM
	}
	public UFrequency(){
		super(PhyProperty.FREQUENCY);
	}
	
	public UFrequency(Library lib){
		super(PhyProperty.FREQUENCY);
		if (lib == Library.RPM){
			this.setCFactor(1/60);
			this.setSymbol("rpm");
			this.setSystem(MSystem.IP);
		} 
		// else lib == Library.HERTZ
	}
}
