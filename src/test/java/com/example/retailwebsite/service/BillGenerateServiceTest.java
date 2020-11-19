package com.example.retailwebsite.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.retailwebsite.base.BillGenerateBuilder;
import com.example.retailwebsite.model.Customer;
import com.example.retailwebsite.model.Item;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BillGenerateServiceTest {

	@MockBean
	private IBillGenerateService iBillCalculatorService;
	
	
	private List<Item> items;

	@Before
	public void setUp() {
		iBillCalculatorService = new BillGenerateService();
		items = BillGenerateBuilder.getItemListWithMultipleProducts();
	}

	@Test
	public void shouldCalculateBillForDiscountEligibleCustomer() {
		Customer customer = BillGenerateBuilder.getCustomerWithMoreThanTwoYearOldRegistration();
		Assert.assertEquals(761.00, iBillCalculatorService.generateBill(customer, items), 0);
	}

	@Test
	public void shouldCalculateBillForNonEligibleCustomer() {
		Customer customer = BillGenerateBuilder.getCustomerWithLessThanTwoYearOldRegistration();
		Assert.assertEquals(790.00, iBillCalculatorService.generateBill(customer, items), 0);
	}

	@Test
	public void shouldCalculateBillforAffiliateCustomer() {
		Customer affiliateCustomer = BillGenerateBuilder.getAffiliateCustomer();
		Assert.assertEquals(737.00, iBillCalculatorService.generateBill(affiliateCustomer, items), 0);
	}

	@Test
	public void shouldCalculateBillForEmployeeCustomer() {
		Customer employeeCustomer = BillGenerateBuilder.getEmployeeCustomer();
		Assert.assertEquals(626.00, iBillCalculatorService.generateBill(employeeCustomer, items), 0);
	}

}
