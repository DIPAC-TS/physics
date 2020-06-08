package physics;

public class UEntropy extends UnitX{
	public static enum Library{
		BTU_R,
		J_K,
		KJ_K,
	}
	
	public UEntropy(){
		super(PhyProperty.ENTROPY);
	}
	
	public UEntropy(Library lib){
		super(PhyProperty.ENTROPY);
		if (lib == Library.BTU_R){
			this.setCFactor(1055.05585*9/5);
			this.setSystem(MSystem.IP);
		} else if (lib == Library.KJ_K){
			this.setCFactor(1e3);
			this.setSymbol("kJ/K");
		} else {
			// lib == Library.J_K
		}
	}
	
}
