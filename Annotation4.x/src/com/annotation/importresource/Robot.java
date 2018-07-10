package com.annotation.importresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private Chip chip;

	public Robot() {
		System.out.println("robot cons..");
	}

	public Chip getChip() {
		return chip;
	}
  //  @Autowired
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chip == null) ? 0 : chip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		if (chip == null) {
			if (other.chip != null)
				return false;
		} else if (!chip.equals(other.chip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
