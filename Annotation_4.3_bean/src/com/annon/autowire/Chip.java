package com.annon.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Chip {
	@Value("121")
	private int ChipNo;
	private String ChipName;

	public void setChipNo(int chipNo) {
		ChipNo = chipNo;
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
