package physics;

public class UnitX extends Unit{
	private int[][] a_ProMatrix;
	protected PhyProperty a_PhyProperty;
	
	public enum PhyProperty{
		ACCELERATION,
		AREA,
		DENSITY,
		ENERGY,
		ENTROPY,
		FLOW,
		FORCE,
		FREQUENCY,
		MASS_FLOW,
		MOMENTUM,
		POWER,
		PRESSURE,
		SP_ENTHALPY,
		SP_ENTROPY,
		SP_VOLUME,
		SPEED,
		TORQUE,
		UNDEFINED,
		VOLUME
	}
	
	public UnitX(PhyProperty pro){
		a_PhyProperty = pro;
		a_ProMatrix = new int[][] {{0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};
		if (pro == PhyProperty.ACCELERATION){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "m/s^2";
			this.setLengthExponent(1);
			this.setTimeExponent(-2);
		} if (pro == PhyProperty.AREA){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "m^2";
		} else if (pro == PhyProperty.DENSITY){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "kg/m^3";
			this.setLengthExponent(-3);
			this.setMassExponent(1);
		} else if (pro == PhyProperty.ENERGY){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "J";
			this.setLengthExponent(2);
			this.setMassExponent(1);
			this.setTimeExponent(-2);
		} else if (pro == PhyProperty.ENTROPY){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "J/K";
			this.setLengthExponent(2);
			this.setMassExponent(1);
			this.setTimeExponent(-2);
			this.setTemperatureExponent(-1);
		} else if (pro == PhyProperty.FORCE){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "N";
			this.setLengthExponent(1);
			this.setMassExponent(1);
			this.setTimeExponent(-2);;
		} else if (pro == PhyProperty.FREQUENCY){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "Hz";
			this.setTimeExponent(-1);;
		} else if (pro == PhyProperty.FLOW){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "m^3/s";
			this.setLengthExponent(3);
			this.setTimeExponent(-1);
		} else if (pro == PhyProperty.MASS_FLOW){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "kg/s";
			this.setMassExponent(1);
			this.setTimeExponent(-1);
		} else if (pro == PhyProperty.MOMENTUM){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "kg.m/s";
			this.setLengthExponent(1);
			this.setMassExponent(1);
			this.setTimeExponent(-1);
		} else if (pro == PhyProperty.POWER){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "W";
			this.setLengthExponent(2);
			this.setMassExponent(1);
			this.setTimeExponent(-3);
		} else if (pro == PhyProperty.PRESSURE){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "Pa";
			this.setLengthExponent(-1);
			this.setMassExponent(1);
			this.setTimeExponent(-2);
		} else if (pro == PhyProperty.SP_ENTHALPY){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "J/kg";
			this.setLengthExponent(2);
			this.setTimeExponent(-2);
		} else if (pro == PhyProperty.SP_ENTROPY){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "J/kg/K";
			this.setLengthExponent(2);
			this.setTimeExponent(-2);
			this.setTemperatureExponent(-1);
		} else if (pro == PhyProperty.SP_VOLUME){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "m^3/kg";
			this.setLengthExponent(3);
			this.setMassExponent(-1);
		} else if (pro == PhyProperty.SPEED){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "m/s";
			this.setLengthExponent(1);
			this.setTimeExponent(-1);
		} else if (pro == PhyProperty.VOLUME){
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "m^3";
		} else { // pro == PhyProperty.UNDEFINED
			a_SISystem = true;
			a_CFactor = 1.0;
			a_Symbol = "";
		} 
	}
	
	protected void setLengthExponent(int value){
		if (value >= 0){
			a_ProMatrix[0][0] = value;
			a_ProMatrix[1][0] = 0;
		} else {
			a_ProMatrix[0][0] = 0;
			a_ProMatrix[1][0] = - value;
		}
	}
	
	public int getLengthExponent(){
		int value;
		value = a_ProMatrix[0][0] - a_ProMatrix[1][0];
		return value;
	}
	
	protected void setMassExponent(int value){
		if (value >= 0){
			a_ProMatrix[0][1] = value;
			a_ProMatrix[1][1] = 0;
		} else {
			a_ProMatrix[0][1] = 0;
			a_ProMatrix[1][1] = - value;
		}
	}
	
	public int getMassExponent(){
		int value;
		value = a_ProMatrix[0][1] - a_ProMatrix[1][1];
		return value;
	}
	
	protected void setTimeExponent(int value){
		if (value >= 0){
			a_ProMatrix[0][2] = value;
			a_ProMatrix[1][2] = 0;
		} else {
			a_ProMatrix[0][2] = 0;
			a_ProMatrix[1][2] = - value;
		}
	}
	
	public int getTimeExponent(){
		int value;
		value = a_ProMatrix[0][2] - a_ProMatrix[1][2];
		return value;
	}
	
	protected void setTemperatureExponent(int value){
		if (value >= 0){
			a_ProMatrix[0][3] = value;
			a_ProMatrix[1][3] = 0;
		} else {
			a_ProMatrix[0][3] = 0;
			a_ProMatrix[1][3] = - value;
		}
	}
	
	public int getTemperatureExponent(){
		int value;
		value = a_ProMatrix[0][3] - a_ProMatrix[1][3];
		return value;
	}
	
	protected void setChargeExponent(int value){
		if (value >= 0){
			a_ProMatrix[0][4] = value;
			a_ProMatrix[1][4] = 0;
		} else {
			a_ProMatrix[0][4] = 0;
			a_ProMatrix[1][4] = - value;
		}
	}
	
	public int getChargeExponent(){
		int value;
		value = a_ProMatrix[0][4] - a_ProMatrix[1][4];
		return value;
	}
	
	
	protected void setA_SubstanceExponent(int value){
		if (value >= 0){
			a_ProMatrix[0][5] = value;
			a_ProMatrix[1][5] = 0;
		} else {
			a_ProMatrix[0][5] = 0;
			a_ProMatrix[1][5] = - value;
		}
	}
	
	public int getA_SubstanceExponent(){
		int value;
		value = a_ProMatrix[0][5] - a_ProMatrix[1][5];
		return value;
	}
	
	
	protected void setL_IntensityExponent(int value){
		if (value >= 0){
			a_ProMatrix[0][6] = value;
			a_ProMatrix[1][6] = 0;
		} else {
			a_ProMatrix[0][6] = 0;
			a_ProMatrix[1][6] = - value;
		}
	}
	
	public int getL_IntensityExponent(){
		int value;
		value = a_ProMatrix[0][6] - a_ProMatrix[1][6];
		return value;
	}
	
}

