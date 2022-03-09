package com.mortgage.loanaccount.service;



import com.mortgage.loanaccount.entity.LoanAccount;
import com.mortgage.loanaccount.exception.CustomerNotFoundException;
import com.mortgage.loanaccount.exception.LoanAccountNotFoundException;


public interface LoanService{
	
	public LoanAccount updateEmi(LoanAccount loanaccount) throws LoanAccountNotFoundException;
	public LoanAccount addEmi(LoanAccount loanAccount);
	public LoanAccount addInterest(LoanAccount loanAccount);
	public LoanAccount updateInterest(LoanAccount loanAccount) throws CustomerNotFoundException;

	
	
}
