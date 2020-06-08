package physics;

public class UEnergy extends UnitX {
	public static enum Library{
		BTU,
		CAL,
		ELECTRONVOLT,
		FRIGORIA,
		JOULE,
		KCAL,
		KILOWATTH,
		MBTU,
		THERM,
		WATTH,
	}
	
	public UEnergy(){
		super(PhyProperty.ENERGY);
	}
	
	public UEnergy(Library lib){
		super(PhyProperty.ENERGY);
		if (lib == Library.BTU){
			this.setCFactor(1055.05585);
			this.setSymbol("Btu");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.CAL){
			this.setCFactor(4.184);
			this.setSymbol("cal");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.ELECTRONVOLT){
			this.setCFactor(1.602176565e-19);
			this.setSymbol("eV");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.FRIGORIA){
			this.setCFactor(4*1055.05585);
			this.setSymbol("fg");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.KCAL){
			this.setCFactor(4184);
			this.setSymbol("kcal");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.KILOWATTH){
			this.setCFactor(3.6e6);
			this.setSymbol("kWh");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.MBTU) {
			this.setCFactor(1e6*1.05505585);
			this.setSymbol("MBtu");
			this.setSystem(MSystem.NONE);
		} else if (lib == Library.THERM){
			this.setCFactor(1e8*1.05505585);
			this.setSymbol("thm");
			this.setSystem(MSystem.IP);
		} else if (lib == Library.WATTH){
			this.setCFactor(3.6e3);
			this.setSymbol("Wh");
			this.setSystem(MSystem.NONE);
		}
	}
}
