package com.capg.pbms.passbook.model;

import java.time.LocalDateTime;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "transaction_info")
public class Transaction {
	@Id
	private long transAccountNumber=(long) new Random().nextInt(1000000000);
@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId;
	private double currentBalance;
	private double transactionAmount;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDateTime transactionDate;
	private double transClosingBalance;
	@OneToOne(cascade = {CascadeType.ALL})
	private Cheque chequeDetails;
	
    //Setters and Getters
	public Cheque getChequeDetails() {
		return chequeDetails;
	}

	public void setChequeDetails(Cheque chequeDetails) {
		this.chequeDetails = chequeDetails;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public long getTransAccountNumber() {
		return transAccountNumber;
	}

	public void setTransAccountNumber(long transAccountNumber) {
		this.transAccountNumber = transAccountNumber;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getTransClosingBalance() {
		return transClosingBalance;
	}

	public void setTransClosingBalance(double transClosingBalance) {
		this.transClosingBalance = transClosingBalance;
	}

	//parameterised constructor
	public Transaction(long transAccountNumber, int transactionId, double currentBalance, double transactionAmount,
			LocalDateTime transactionDate, double transClosingBalance) {
		super();
		this.transAccountNumber = transAccountNumber;
		this.transactionId = transactionId;
		this.currentBalance = currentBalance;
		this.transactionAmount = transactionAmount;

		this.transactionDate = transactionDate;
		this.transClosingBalance = transClosingBalance;
	}

	@Override
	public String toString() {
		return "Transaction [transAccountNumber=" + transAccountNumber + ", transactionId=" + transactionId
				+ ", currentBalance=" + currentBalance + ", transactionAmount=" + transactionAmount
				+ ", transactionDate=" + transactionDate + ", transClosingBalance=" + transClosingBalance + "]";
	}

}
