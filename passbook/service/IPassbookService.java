package com.capg.pbms.passbook.service;

import java.util.List;

import com.capg.pbms.passbook.exception.AccountNotFound;

/*The PassbookService Interface for accessing Passbook Management System*/

import com.capg.pbms.passbook.model.Transaction;

public interface IPassbookService {
List<Transaction> getAllTransactions();

Transaction getTransactionByTransactionId(int transactionId) throws AccountNotFound;

List<Transaction> getTrasactionByAccountNumber(long accNumber);
}
