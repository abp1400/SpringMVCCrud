package web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ShoeIdForm {
	@NotNull(message="Brand cannot be null, please enter a brand")
	@Size(min=2,max =100, message="Please enter a style name between 2 and 100 characters.")
	private String brand;
	
	public ShoeIdForm() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}