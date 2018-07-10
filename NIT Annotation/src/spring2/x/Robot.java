package spring2.x;

import org.springframework.beans.factory.annotation.Required;

public class Robot {

	protected int Id;
	protected String CompanyName;

	public int getId() {
		return Id;
	}

	@Required
	public void setId(int id) {
		Id = id;
	}

	public Robot(String companyName) {
		super();
		CompanyName = companyName;
	}

	@Override
	public String toString() {
		return "Robot [Id=" + Id + ", CompanyName=" + CompanyName + "]";
	}

}
