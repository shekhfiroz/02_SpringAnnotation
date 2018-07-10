package com.annotation.importresource;
public class Sensor {
	private String bluetooth;
	private String radiowave;
	
	

	public Sensor() {
		System.out.println("Sensor.Sensor()");
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getRadiowave() {
		return radiowave;
	}

	public void setRadiowave(String radiowave) {
		this.radiowave = radiowave;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bluetooth == null) ? 0 : bluetooth.hashCode());
		result = prime * result + ((radiowave == null) ? 0 : radiowave.hashCode());
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
		Sensor other = (Sensor) obj;
		if (bluetooth == null) {
			if (other.bluetooth != null)
				return false;
		} else if (!bluetooth.equals(other.bluetooth))
			return false;
		if (radiowave == null) {
			if (other.radiowave != null)
				return false;
		} else if (!radiowave.equals(other.radiowave))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sensor [bluetooth=" + bluetooth + ", radiowave=" + radiowave + "]";
	}

}
