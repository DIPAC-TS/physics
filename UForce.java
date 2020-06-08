package physics;


public class UForce extends UnitX{
	public static enum Library{
		DYNE,
		POUNDF,
		KIP,
		KGF,
		NEWTON
	}
	public UForce(){
		super(PhyProperty.FORCE);
	}
	
	public UForce(Library lib){
		super(PhyProperty.FORCE);
		if (lib == Library.DYNE){
			this.setCFactor(1e-5);
			this.setSymbol("dyn");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.POUNDF){
			this.setCFactor(9.80665*0.45359237);
			this.setSymbol("lbf");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.KIP){
			this.setCFactor(9.807665*453.59273);
			this.setSymbol("kip");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.KGF){
			this.setCFactor(9.80665);
			this.setSymbol("kgf");
			this.setSystem(MSystem.NONE);
		} else {
			// lib == Library.NEWTON
		}
	}
}
