package data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Shoe {
	private int shoeid;
	
	@NotNull (message="You must enter a brand.")
	@Size(min=2,max =100, message="Please enter a brand name between 2 and 100 characters.")
	private String brand;
	
	@NotNull (message="You must enter a style.")
	@Size(min=2,max =100, message="Please enter a style name between 2 and 100 characters.")
	private String style;
	
	@NotNull (message="You must enter a color.")
	@Size(min=2,max =100, message="Please enter a color name between 2 and 100 characters.")
	private String color;
	
	@NotNull (message="You must enter a purchase price.")
	@Min(value = 0, message="Minimum purchase price is zero.")
	@Max(value = 500000, message="Maximum resale price is $500000.")
	private int pprice;
	
	@NotNull (message="You must enter a resale price.")
	@Min(value = 0, message="Minimum resale price is zero.")
	@Max(value = 500000, message="Maximum resale price is $500000.")
	private int rprice;
	
	@NotNull (message="You must enter an image url")
	private String imageUrl;
	
	public Shoe() {}
	
	
	public Shoe(int shoeid,String brand, String style, String color,int pprice, int rprice, String imageUrl) {
		super();
		this.shoeid = shoeid;
		this.brand = brand;
		this.style = style;
		this.color = color;
		this.pprice = pprice;
		this.rprice = rprice;
		this.imageUrl = imageUrl;
	}


	public int getShoeid() {
		return shoeid;
	}

	public void setShoeid(int index) {
		this.shoeid = index;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public int getRprice() {
		return rprice;
	}

	public void setRprice(int rprice) {
		this.rprice = rprice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	


	@Override
	public String toString() {
		return "Shoe [shoeid=" + shoeid + ", brand=" + brand + ", style=" + style + ", color=" + color + ", pprice="
				+ pprice + ", rprice=" + rprice + ", imageUrl=" + imageUrl + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shoeid;
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
		Shoe other = (Shoe) obj;
		if (shoeid != other.shoeid)
			return false;
		return true;
	}
	
	
		
}