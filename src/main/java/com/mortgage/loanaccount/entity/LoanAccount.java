package com.mortgage.loanaccount.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_table")
public class LoanAccount {

	@Id
	private int customerId;
	
	private String typeOfMortgage;
	
	private int accountNumber;
	
	private int totalLoanAmount;
	
	private int tenure;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private int outStandingCharges;
	
	private String loanStatus;
	

	
	private double interestrate;
	
	private double paidemi;
	
	


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getTypeOfMortgage() {
		return typeOfMortgage;
	}

	public void setTypeOfMortgage(String typeOfMortgage) {
		this.typeOfMortgage = typeOfMortgage;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	

	public long getTotalLoanAmount() {
		return totalLoanAmount;
	}

	

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getOutStandingCharges() {
		return outStandingCharges;
	}

	

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setTotalLoanAmount(int totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}

	public void setOutStandingCharges(int outStandingCharges) {
		this.outStandingCharges = outStandingCharges;
	}

	public double getPaidemi() {
		return paidemi;
	}

	public void setPaidemi(double paidemi) {
		this.paidemi = paidemi;
	}
	
	
}
