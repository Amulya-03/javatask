package com.product;
import com.manufacturer.Manufacturer;

public class Product {
	String productName;
	String category;
	Manufacturer manufacturer;
	double price;
	
	private Product(String productName, String category, Manufacturer manufacturer, double price) {
		this.productName=productName;
		this.category=category;
		this. manufacturer= manufacturer;
		this.price=price;
	}
	public String getproductName() {
		return productName;
	}
	public String getcategory() {
		return category;
	}
	public Manufacturer getmanufacturer() {
		return manufacturer;
	}
	public void setproductName(String productName) {
		this.productName=productName;
	}
	public void setCatergory(String category) {
		this.category=category;
	}
	public void setManugacturer(Manufacturer manufacturer) {
		this.manufacturer=manufacturer;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String toString() {
		return "Product[productName="+productName+",category="+category+",manufacturer="+manufacturer+",price="+price+"]";
	}
	 public static Product getProductObject(String productName, String category, Manufacturer manufacturer, double price) {
		if(price<=0 && manufacturer==null) {
			return null;
			}
		else {
			return new Product(productName, category, manufacturer, price);
		}
	}
}
