package physics;

public class UArea extends UnitX{
	
	public static enum Library{
		ACRE,
		IN2,
		FT2,
		HECTARE,
		KM2,
		M2,
		MM2,
		YD2
	}
	public UArea(){
		super(PhyProperty.AREA);
	}
	
	public UArea(Library lib){
		super(PhyProperty.AREA);
		if(lib == Library.ACRE){
			this.setCFactor(4840*0.9144*0.9144);
			this.setSymbol("ac");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.IN2){
			this.setCFactor(0.0254*0.0254);
			this.setSymbol("in^2");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.FT2){
			this.setCFactor(0.3048*0.3048);
			this.setSymbol("ft^2");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.HECTARE){
			this.setCFactor(1e4);
			this.setSymbol("ha");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.KM2){
			this.setCFactor(1e6);
			this.setSymbol("km^2");
		} else if (lib == Library.MM2){
			this.setCFactor(1e-6);
			this.setSymbol("mm^2");
		} else if (lib == Library.YD2){
			this.setCFactor(0.9144*0.9144);
			this.setSymbol("yd^2");
			this.setSystem(MSystem.IP);
		} else {
			// lib == Library.M2
		}
	}
}
