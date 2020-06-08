package physics;

public class Unit {
	protected boolean a_SISystem;
	protected double a_CFactor;
	protected String a_Symbol;
	protected PhyProperty a_PhyProperty;
	
	public static enum PhyProperty{
		LENGTH,
		MASS,
		TIME,
		TEMPERATURE,
		CHARGE,
		A_SUBSTANCE,
		L_INTESITY,
		UNDEFINED
	}
	
	public static enum MSystem{
		SI,
		IP,
		NONE
	}

protected Unit(){
	a_SISystem = true;
	a_CFactor = 0.0;
	a_Symbol = "";
	a_PhyProperty = PhyProperty.UNDEFINED;
}

public Unit(PhyProperty pro){
	a_PhyProperty = pro;
	if (pro == PhyProperty.LENGTH){
		a_SISystem = true;
		a_CFactor = 1.0;
		a_Symbol = "m";
	} else if (pro == PhyProperty.MASS){
		a_SISystem = true;
		a_CFactor = 1.0;
		a_Symbol = "g";
	} else if (pro == PhyProperty.TIME){
		a_SISystem = true;
		a_CFactor = 1.0;
		a_Symbol = "s";
	} else if (pro == PhyProperty.TEMPERATURE){
		a_SISystem = true;
		a_CFactor = 1.0;
		a_Symbol = "K";
	} else if (pro == PhyProperty.CHARGE){
		a_SISystem = true;
		a_CFactor = 1.0;
		a_Symbol = "C";
	} else if (pro == PhyProperty.A_SUBSTANCE){
		a_SISystem = true;
		a_CFactor = 1.0;
		a_Symbol = "mol";
	} else if (pro == PhyProperty.L_INTESITY){
		
	} else { // pro == PhyProperty.UNDEFINED
		a_SISystem = true;
		a_CFactor = 1.0;
		a_Symbol = "";
	}
}

protected void setCFactor(double val) {
	if (val <= 0){
		System.out.println("Conversion factor must be greater than 0");
		return;
	} else {
		a_CFactor = val;
	}
}

public void setCFactor(double val, String simb, MSystem sys){
	setCFactor(val);
	setSymbol(simb);
	setSystem(sys);
}
public double getCFactor(){
	return a_CFactor;
}

protected void setSystem(MSystem msys){
	a_SISystem = (msys == MSystem.SI) ? true : false;
}

public boolean isSISystem(){
	return a_SISystem;
}

public void setSymbol(String simb){
	a_Symbol = simb;
}

public PhyProperty getPhyProperty(){
	return a_PhyProperty;
}

@Override
public String toString(){
	return a_Symbol;
}
}
