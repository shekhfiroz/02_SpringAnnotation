package com.annon.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("chip")
public class Chip {
	@Value("121")
	private int ChipNo;
	private String ChipName;

	public int getChipNo() {
		return ChipNo;
	}

	public void setChipNo(int chipNo) {
		ChipNo = chipNo;
	}

	
	public String getChipName() {
		return ChipName;
	}
	@Value("Intel")
	public void setChipName(String chipName) {
		ChipName = chipName;
	}

	@Override
	public String toString() {
		return "Chip [ChipNo=" + ChipNo + ", ChipName=" + ChipName + "]";
	}

}
