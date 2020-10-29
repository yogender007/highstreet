package com.highstreet.prod;
/**
 * 
 * A Product representation
 *
 */
public class Product
{

	private String productCode;
	private String productDescription;
	private float price;

	public Product(String productCode, String productDescription, float price) {
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.price = price;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product[productCode=" + productCode + ", productDescription=" + productDescription + ", price="
				+ price + "]";
	}
	
	

}
