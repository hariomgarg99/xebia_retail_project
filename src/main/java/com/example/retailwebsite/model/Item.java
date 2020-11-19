package com.example.retailwebsite.model;

/**
 * 
 * @author Hariom Garg
 *
 */
public class Item {

	/**
	 * product : to store product
	 */
	private Product product;

	/**
	 * quantity : to store quantity
	 */
	private int quantity;

	/**
	 * totalCost : to store totalCost
	 */
	private double totalCost;

	public Item(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalCost = product.getPrice() * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public double getDiscountedPrice(double discountPercentage) {
		if (product.isDiscountable() && discountPercentage != 0) {
			return (totalCost - totalCost * discountPercentage / 100);
		}
		return totalCost;
	}

}
