package com.example.retailwebsite.model;

import java.util.Date;

import org.joda.time.DateTime;

/**
 * 
 * @author Hariom Garg
 *
 */
public class Customer {
	
	private static final int TIME_PERIOD_IN_YRS = 2;

	/**
	 * userType : to store customer Type
	 */
	private UserType userType;

	/**
	 * name : to store customer name
	 */
	private String name;

	/**
	 * customerId : to store customerId
	 */
	private String customerId;

	/**
	 * registrationDate : to store customer registrationDate
	 */
	private DateTime registrationDate;

	public Customer(UserType userType, String name, String customerId, DateTime registrationDate) {
		super();
		this.userType = userType;
		this.name = name;
		this.customerId = customerId;
		this.registrationDate = registrationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public DateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(DateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public boolean isEligibleForDiscount() {
		DateTime dateToCompare = DateTime.now().minusYears(TIME_PERIOD_IN_YRS);
		return registrationDate.isBefore(dateToCompare) && (UserType.CUSTOMER == userType);
	}
}
