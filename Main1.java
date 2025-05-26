package com.main;
import com.product.Product;
import com.manufacturer.Manufacturer;

public class Main1 {
	public static void main(String[] args) {
		Manufacturer manufacturer=Manufacturer.getManufacturerObject("productA", "addressx", "R12345");
		Product product=Product.getProductObject("DELL","Laptops", manufacturer, 35000);
		if(manufacturer==null && product==null ) {
		System.out.println("invalid product/manufactuer");
	}
	else {
		System.out.println(manufacturer);
		System.out.println(product);
	}
}   

}
