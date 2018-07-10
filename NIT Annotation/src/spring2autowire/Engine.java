package spring2autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {
	protected String EngineNo;
	protected String EngineName;
	protected String ManufacturedDate;

	@Autowired
	/*putting at some arbitrary methods */
	public void hello() {
		System.out.println("hello");
	}

	public String getEngineNo() {
		return EngineNo;
	}

	public void setEngineNo(String engineNo) {
		EngineNo = engineNo;
	}

	public String getEngineName() {
		return EngineName;
	}

	public void setEngineName(String engineName) {
		EngineName = engineName;
	}

	public String getManufacturedDate() {
		return ManufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		ManufacturedDate = manufacturedDate;
	}

	@Override
	public String toString() {
		return "Engine [EngineNo=" + EngineNo + ", EngineName=" + EngineName + ", ManufacturedDate=" + ManufacturedDate
				+ "]";
	}

}
