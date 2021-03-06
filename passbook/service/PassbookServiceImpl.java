package com.capg.pbms.passbook.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.pbms.passbook.exception.AccountNotFound;
import com.capg.pbms.passbook.model.Transaction;



@Service
public class PassbookServiceImpl implements IPassbookService {
@Autowired
private RestTemplate restTemplate;
    //this method returns all transactions which is taken from transaction-management
	@Override
	public List<Transaction> getAllTransactions() {
		ResponseEntity<List<Transaction>> passbook=restTemplate.exchange("http://PBMS-TRANSACTION-MANAGEMENT/transaction/getAll", HttpMethod.GET,null,new ParameterizedTypeReference<List<Transaction>>() {
		});
		
		return passbook.getBody();
	}
	@Override
	public Transaction getTransactionByTransactionId(int transactionId) throws AccountNotFound {
		
		Transaction transaction=restTemplate.getForObject("http://PBMS-TRANSACTION-MANAGEMENT/transaction/trans/"+transactionId,Transaction.class);
		if(transactionId!=transaction.getTransactionId()) {
			throw new AccountNotFound("Id not found");
		}
		return transaction;
	}
	@Override
	public List<Transaction> getTrasactionByAccountNumber(long accNumber) {
		// TODO Auto-generated method stub
		
		ResponseEntity<List<Transaction>> passbook=restTemplate.exchange("http://PBMS-TRANSACTION-MANAGEMENT/transaction/trans/getalltransactions/"+accNumber, HttpMethod.GET,null,new ParameterizedTypeReference<List<Transaction>>() {
		});
		/*
		 * BankAccountDetails bankDetails = restTemplate.getForObject(
		 * "http://PBMS-ACCOUNT-MANAGEMENT/pecuniabank/get/accNum/" + accNumber,
		 * BankAccountDetails.class); if (accNumber != bankDetails.getAccNumber()) {
		 * throw new AccountNotFoundException("account number doesn't exists"); }
		 */
		
		return passbook.getBody();
	}
	


}
