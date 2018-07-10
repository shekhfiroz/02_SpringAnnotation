package spring2autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Car {
	@Autowired(required = true)
	protected Engine engine;

	protected int CarId;
	protected String CarName;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	@Required
	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", CarId=" + CarId + ", CarName=" + CarName + "]";
	}

}
