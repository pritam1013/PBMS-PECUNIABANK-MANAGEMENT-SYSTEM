package com.capg.pbms.passbook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import javax.security.auth.login.AccountNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.pbms.passbook.model.Cheque;
import com.capg.pbms.passbook.model.Transaction;
import com.capg.pbms.passbook.service.PassbookServiceImpl;


@SpringBootTest
class PbmsPassbookManagementApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
PassbookServiceImpl service;
Transaction transaction,transaction1;
	Cheque cheque;

	@BeforeEach
	void setUp() {
		transaction = new Transaction(303104873498l, 1981258, 50000.0, 2000, LocalDateTime.now(), 52000.0);
		transaction1=new Transaction(303104873490l, 1981250, 500056.0, 7000, LocalDateTime.now(), 57056.0);
		
	
	}

	@Test
	void testGetTransactionByTransactionId() throws AccountNotFoundException, com.capg.pbms.passbook.exception.InsufficienBalanceException {
				assertEquals(true,  service.getTransactionByTransactionId(transaction.getTransactionId())!=null);
				assertEquals(true,  service.getTransactionByTransactionId(transaction1.getTransactionId())!=null);
				
	}
	@Test
	void testGetTrasactionByAccountNumber() throws AccountNotFoundException, com.capg.pbms.passbook.exception.InsufficienBalanceException {
				assertEquals(true,  service.getTrasactionByAccountNumber(transaction.getTransAccountNumber())!=null);
				assertEquals(true,  service.getTrasactionByAccountNumber(transaction1.getTransAccountNumber())!=null);
				
	}
	
	

}
