package com.example.retailwebsite.service;

import java.util.List;

import com.example.retailwebsite.model.Customer;
import com.example.retailwebsite.model.Item;
import com.example.retailwebsite.model.UserType;

public class BillGenerateService implements IBillGenerateService {

	private static final int PER_HUNDRED_DISSCOUNT = 5;

	@Override
	public double generateBill(Customer customer, List<Item> items) {
		double totalCostAfterDiscount = 0;
		double discountPercentage = getDiscountPercentageForCustomer(customer);
		for (Item item : items) {
			totalCostAfterDiscount = totalCostAfterDiscount + item.getDiscountedPrice(discountPercentage);
		}

		return Math.round(totalCostAfterDiscount - getDiscountBasedOnTotalAmount(totalCostAfterDiscount));
	}

	private double getDiscountPercentageForCustomer(Customer customer) {
		UserType userType = customer.getUserType();
		if (userType == UserType.AFFILIATE || userType == UserType.EMPLOYEE || userType == userType.CUSTOMER) {
			return userType.getDiscountRange();
		}
		return 0;
	}

	private double getDiscountBasedOnTotalAmount(double totalDiscountedPrice) {
		return Math.floor(totalDiscountedPrice / 100) * PER_HUNDRED_DISSCOUNT;
	}

}
