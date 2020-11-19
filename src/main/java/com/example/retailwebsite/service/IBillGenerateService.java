package com.example.retailwebsite.service;

import java.util.List;

import com.example.retailwebsite.model.Customer;
import com.example.retailwebsite.model.Item;

/**
 * 
 * @author Hariom Garg
 *
 */
public interface IBillGenerateService {

	/**
	 * Method to generate bill
	 * 
	 * @param customer
	 * @param items
	 * @return
	 */
	double generateBill(Customer customer, List<Item> items);

}
