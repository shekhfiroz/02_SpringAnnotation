package stereotype;

public class Mobile {
	private SimCard Sim;
	private String Model;
	private String Price;

	public SimCard getSim() {
		return Sim;
	}

	public void setSim(SimCard sim) {
		Sim = sim;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Mobile [Sim=" + Sim + ", Model=" + Model + ", Price=" + Price + "]";
	}

}
