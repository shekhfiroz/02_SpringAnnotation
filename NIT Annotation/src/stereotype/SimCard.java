package stereotype;

public class SimCard {

	private String subscriber;
	private String services;

	public String getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "SimCard [subscriber=" + subscriber + ", services=" + services + "]";
	}

}
