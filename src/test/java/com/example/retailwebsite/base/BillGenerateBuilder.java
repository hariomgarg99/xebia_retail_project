package com.example.retailwebsite.base;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.example.retailwebsite.model.Customer;
import com.example.retailwebsite.model.Item;
import com.example.retailwebsite.model.Product;
import com.example.retailwebsite.model.UserType;

public class BillGenerateBuilder {

	private static final int CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS = 2;

	public static Product getDiscountableProduct() {
		Product product = new Product();
		product.setName("Salt");
		product.setDiscountable(Boolean.TRUE);
		product.setPrice(57.99);

		return product;
	}

	public static Product getNonDiscountableProduct() {
		Product product = new Product();
		product.setName("Oats");
		product.setDiscountable(Boolean.FALSE);
		product.setPrice(49.99);

		return product;
	}

	public static Customer getAffiliateCustomer() {
		Customer customer = new Customer(UserType.AFFILIATE, "testCustomer001", "ABC Affiliate",
				new DateTime().minusYears(3));
		return customer;
	}

	public static Customer getEmployeeCustomer() {
		Customer customer = new Customer(UserType.EMPLOYEE, "testCustomer002", "Hariom",
				new DateTime().minusYears(3));
		return customer;
	}

	public static Customer getCustomerWithMoreThanTwoYearOldRegistration() {
		Customer customer = new Customer(UserType.CUSTOMER, "testCustomer003", "Rakesh",
				new DateTime().minusYears(CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS).minusDays(1));
		return customer;
	}

	public static Customer getCustomerWithLessThanTwoYearOldRegistration() {
		Customer customer = new Customer(UserType.CUSTOMER, "testCustomer004", "Rajesh",
				new DateTime().minusYears(CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS).plusDays(1));
		return customer;
	}

	public static Item getItemWithDiscountableProduct(int quantity) {
		return new Item(getDiscountableProduct(), quantity);
	}

	public static Item getItemWithNonDiscountableProduct(int quantity) {
		return new Item(getNonDiscountableProduct(), quantity);
	}

	public static List<Item> getItemListWithMultipleProducts() {
		List<Item> items = new ArrayList<Item>();
		items.add(getItemWithDiscountableProduct(10));
		items.add(getItemWithNonDiscountableProduct(5));
		return items;
	}

}
