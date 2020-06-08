package physics;

public class UPower extends UnitX{
	public static enum Library{
		BTU_H,
		CAL_H,
		CAL_S,
		FRIGORIA_H,
		HORSEPOWER,
		KCAL_H,
		KILOWATT,
		KVA,
		MBTU_H,
		TR,
		VOLTAMPERE,
		WATT
	}
	
	public UPower(){
		super(PhyProperty.POWER);
	}
	
	public UPower(Library lib){
		super(PhyProperty.POWER);
		if (lib == Library.BTU_H){
			this.setCFactor(1055.05585/3600);
			this.setSymbol("Btu/h");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.CAL_H){
			this.setCFactor(4.184/3600);
			this.setSymbol("cal/h");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.CAL_S){
			this.setCFactor(4.184);
			this.setSymbol("cal/s");
		} else if (lib == Library.FRIGORIA_H){
			this.setCFactor(4*1055.05585/3600);
			this.setSymbol("fg");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.HORSEPOWER){
			this.setCFactor(550*0.3048*9.80665*0.453592);
			this.setSymbol("hp");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.KCAL_H){
			this.setCFactor(4184/3600);
			this.setSymbol("kcal/h");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.KILOWATT){
			this.setCFactor(1e3);
			this.setSymbol("kW");
		} else if (lib == Library.KVA){
			this.setCFactor(1000.0);
			this.setSymbol("kVA");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.MBTU_H){
			this.setCFactor(1055.05585/3.6);
			this.setSymbol("MBtu/h");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.TR){
			this.setCFactor(12*1055.05585/3.6);
			this.setSymbol("TR");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.VOLTAMPERE){
			this.setCFactor(1.0);
			this.setSymbol("VA");
			this.setSystem(MSystem.NONE);
		} else {
			//Library.WATT;
		}
	}
}

