package com.example.retailwebsite.model;

import org.junit.Assert;
import org.junit.Test;

import com.example.retailwebsite.base.BillGenerateBuilder;

public class CustomerTest {

	@Test
	public void shouldReturnTrueForMoreThanTwoYearOldRegistration() {
		Customer customer = BillGenerateBuilder.getCustomerWithMoreThanTwoYearOldRegistration();
		Assert.assertTrue(customer.isEligibleForDiscount());
	}

	@Test
	public void shouldReturnFalseForNonEmployee() {
		Customer customer = BillGenerateBuilder.getAffiliateCustomer();
		Assert.assertFalse(customer.isEligibleForDiscount());
	}

	@Test
	public void shouldReturnFalseForLessThanTwoYearOldRegistration() {
		Customer customer = BillGenerateBuilder.getCustomerWithLessThanTwoYearOldRegistration();
		Assert.assertFalse(customer.isEligibleForDiscount());
	}

}
