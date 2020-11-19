package com.example.retailwebsite.model;

/**
 * 
 * @author Hariom Garg
 *
 */
public class Product {

	/**
	 * name : to store customer name
	 */
	private String name;

	/**
	 * isDiscountable : to store product is discountable or not
	 */
	private boolean isDiscountable;

	/**
	 * price : to store product price
	 */
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDiscountable() {
		return isDiscountable;
	}

	public void setDiscountable(boolean isDiscountable) {
		this.isDiscountable = isDiscountable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
