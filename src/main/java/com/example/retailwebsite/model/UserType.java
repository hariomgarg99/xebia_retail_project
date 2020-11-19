package com.example.retailwebsite.model;

/**
 * 
 * @author Hariom Garg
 *
 */
public enum UserType {

	CUSTOMER(5), EMPLOYEE(30), AFFILIATE(10);

	private double discountRange;

	UserType(double discountRange) {
		this.discountRange = discountRange;
	}

	public double getDiscountRange() {
		return discountRange;
	}

}
