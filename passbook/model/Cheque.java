package com.capg.pbms.passbook.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Cheque {
	@Id
	//private Long ChequeAccountNumber=(long) new Random().nextInt(1000000000);;
@GeneratedValue(strategy = GenerationType.AUTO)
	private int chequeId;
	private double currentBalance;
	private double ChequeAmount;
	@DateTimeFormat(pattern="yyyy/MM/ddThh:mm:ss")
	private LocalDate chequeIssueDate;
	private double chequeClosingBalance;
	private String chequeHolderName;
	private long debitAccNum;
	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterised constructor
	public Cheque(int chequeId, double currentBalance, double chequeAmount, LocalDate chequeIssueDate,
			double chequeClosingBalance, String chequeHolderName, long debitAccNum) {
		super();
		this.chequeId = chequeId;
		this.currentBalance = currentBalance;
		ChequeAmount = chequeAmount;
		this.chequeIssueDate = chequeIssueDate;
		this.chequeClosingBalance = chequeClosingBalance;
		this.chequeHolderName = chequeHolderName;
		this.debitAccNum = debitAccNum;
	}
	
	
	//Setters and Getters
	
	public int getChequeId() {
		return chequeId;
	}
	/**
	 * @param chequeId the chequeId to set
	 */
	public void setChequeId(int chequeId) {
		this.chequeId = chequeId;
	}
	/**
	 * @return the currentBalance
	 */
	public double getCurrentBalance() {
		return currentBalance;
	}
	/**
	 * @param currentBalance the currentBalance to set
	 */
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	/**
	 * @return the chequeAmount
	 */
	public double getChequeAmount() {
		return ChequeAmount;
	}
	/**
	 * @param chequeAmount the chequeAmount to set
	 */
	public void setChequeAmount(double chequeAmount) {
		ChequeAmount = chequeAmount;
	}
	/**
	 * @return the chequeIssueDate
	 */
	public LocalDate getChequeIssueDate() {
		return chequeIssueDate;
	}
	/**
	 * @param chequeIssueDate the chequeIssueDate to set
	 */
	public void setChequeIssueDate(LocalDate chequeIssueDate) {
		this.chequeIssueDate = chequeIssueDate;
	}
	/**
	 * @return the chequeClosingBalance
	 */
	public double getChequeClosingBalance() {
		return chequeClosingBalance;
	}
	/**
	 * @param chequeClosingBalance the chequeClosingBalance to set
	 */
	public void setChequeClosingBalance(double chequeClosingBalance) {
		this.chequeClosingBalance = chequeClosingBalance;
	}
	/**
	 * @return the chequeHolderName
	 */
	public String getChequeHolderName() {
		return chequeHolderName;
	}
	/**
	 * @param chequeHolderName the chequeHolderName to set
	 */
	public void setChequeHolderName(String chequeHolderName) {
		this.chequeHolderName = chequeHolderName;
	}
	/**
	 * @return the debitAccNum
	 */
	public long getDebitAccNum() {
		return debitAccNum;
	}
	/**
	 * @param debitAccNum the debitAccNum to set
	 */
	public void setDebitAccNum(long debitAccNum) {
		this.debitAccNum = debitAccNum;
	}
	@Override
	public String toString() {
		return "Cheque [chequeId=" + chequeId + ", currentBalance=" + currentBalance + ", ChequeAmount=" + ChequeAmount
				+ ", chequeIssueDate=" + chequeIssueDate + ", chequeClosingBalance=" + chequeClosingBalance
				+ ", chequeHolderName=" + chequeHolderName + ", debitAccNum=" + debitAccNum + "]";
	}
	
	



	
	


}
