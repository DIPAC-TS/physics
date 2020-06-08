package physics;

public class U_SPEnthalpy extends UnitX{
	public static enum Library {
		BTU_LB,
		J_G,
		J_KG,
		KJ_KG		
	}
	public U_SPEnthalpy(){
		super(PhyProperty.SP_ENTHALPY);
	}
	
	public U_SPEnthalpy(Library lib){
		super(PhyProperty.SP_ENTHALPY);
		if (lib == Library.BTU_LB){
			this.setCFactor(1055.05585/0.45359237);
			this.setSymbol("Btu/lb");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.J_G){
			this.setCFactor(1);
			this.setSymbol("J/g");
		} else if (lib == Library.KJ_KG){
			this.setCFactor(1000);
			this.setSymbol("kJ/kg");
		} else {
			// lib = J_KG
		}
			
	}

} 
