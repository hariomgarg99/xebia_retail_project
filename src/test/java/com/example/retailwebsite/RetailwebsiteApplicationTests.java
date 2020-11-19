package com.example.retailwebsite;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.retailwebsite.service.IBillGenerateService;

@SpringBootTest
class RetailwebsiteApplicationTests {

	@MockBean
	private IBillGenerateService iBillGenerateService;
	
	@Test
	void contextLoads() {
		assertThat(iBillGenerateService).isNotNull();
	}
	

}
