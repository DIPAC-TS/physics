package physics;

public class UFlow extends UnitX{
	public static enum Library{
		CFM,
		GPM,
		GPS,
		LITRE_S,
		LITRE_MIN,
		MT3_S,
		MT3_HR,
		SCCM
	}
	
	public UFlow(){
		super(PhyProperty.FLOW);
	}
	
	public UFlow(Library lib){
		super(PhyProperty.FLOW);
		if (lib == Library.CFM){
			this.setCFactor(0.3048*0.3048*0.3048/60);
			this.setSymbol("cfm");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.GPM){
			this.setCFactor(231*0.0254*0.0254*0.0254/60);
			this.setSymbol("gpm");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.GPS){
			this.setCFactor(231*0.0254*0.0254*0.0254);
			this.setSymbol("gps");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.LITRE_S){
			this.setCFactor(1e-3);
			this.setSymbol("L/s");
		} else if (lib == Library.LITRE_MIN){
			this.setCFactor(1e-3/60);
			this.setSymbol("L/min");
		} else if (lib == Library.MT3_HR){
			this.setCFactor(1/3600);
			this.setSymbol("m^3/h");
		} else if (lib == Library.SCCM){
			this.setCFactor(1e-6/60);
			this.setSymbol("cm^3/min");
			this.setSystem(MSystem.NONE);
		} else {
			// lib == Library.MT3_S
		}
	}
}

