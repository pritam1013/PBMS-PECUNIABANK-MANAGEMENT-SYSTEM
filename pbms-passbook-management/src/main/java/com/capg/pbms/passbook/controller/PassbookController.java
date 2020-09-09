package com.capg.pbms.passbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pbms.passbook.exception.AccountNotFound;
import com.capg.pbms.passbook.model.Transaction;
import com.capg.pbms.passbook.service.IPassbookService;
@RestController
@RequestMapping("/passbook")

//PassBook Controller for accessing the service methods

public class PassbookController {
	
	@Autowired
	private IPassbookService passbookService;
	//it calls getAllTransactions method from service layer which is autowired using passbookserivce object
	
	@GetMapping("/getalltransactions")
	public List<Transaction> getAllTransactions()
	    {
			return passbookService.getAllTransactions();
	    }
	
	//it calls gettransactionbyid method from service layer which is autowired using passbookserivce object
	
	@GetMapping("/gettransactionbyid/transactionId/{transactionId}")
	public Transaction getTransactionByTransactionId(@PathVariable int transactionId) throws AccountNotFound
		{
			return passbookService.getTransactionByTransactionId(transactionId);
		}
	
	//it calls getalltransactions by accountnumber method from service layer which is autowired using passbookserivce object
	
	@GetMapping("/getalltransactions/{accNumber}")
	public List<Transaction> getAllTransactions(@PathVariable ("accNumber") long accNumber)
		{
			return passbookService.getTrasactionByAccountNumber(accNumber);
		}
	
}
