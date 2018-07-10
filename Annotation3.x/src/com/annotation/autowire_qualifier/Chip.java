package com.annotation.autowire_qualifier;

public class Chip {
	private int chip;
	private String chip_brand;

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

	public String getChip_brand() {
		return chip_brand;
	}

	public void setChip_brand(String chip_brand) {
		this.chip_brand = chip_brand;
	}

	@Override
	public String toString() {
		return "Chip [chip=" + chip + ", chip_brand=" + chip_brand + "]";
	}

}
