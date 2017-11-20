package web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ShoeIdForm {
	
	@NotNull(message="Resale price cannot be null, please enter a resale price")
	@Min(value = 0, message="Minimum resale price is zero.")
	@Max(value = 500000, message="Maximum resale price is $500000.")
	private int rprice;
	
	public ShoeIdForm() {
	}

	public int getrprice() {
		return rprice;
	}

	public void setrprice(int rprice) {
		this.rprice = rprice;
	}
	
}