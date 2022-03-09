package com.mortgage.loanaccount.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgage.loanaccount.entity.LoanAccount;
import com.mortgage.loanaccount.exception.CustomerNotFoundException;
import com.mortgage.loanaccount.exception.LoanAccountNotFoundException;
import com.mortgage.loanaccount.repository.LoanRepository;

@Service
public  class LoanServiceImpl implements LoanService{

	@Autowired
	private LoanRepository loanRepository;

	@Override
	public LoanAccount updateEmi(LoanAccount loanaccount) throws LoanAccountNotFoundException{
		
		Optional<LoanAccount> optionalloanaccount = loanRepository.findById(loanaccount.getCustomerId());
		
		if(optionalloanaccount.isEmpty()) {
			throw new LoanAccountNotFoundException("Sorry! loanaccount is not existing with id: "+loanaccount.getCustomerId());
		}
		
		LoanAccount updatedEmi = loanRepository.save(loanaccount);
		
		return updatedEmi;
	}

	@Override
	public LoanAccount addEmi(LoanAccount loanAccount) {

		
		LoanAccount savedEmi=loanRepository.save(loanAccount);
		
		return savedEmi;
	
	}

	@Override
	public LoanAccount addInterest(LoanAccount loanAccount) {

		
		LoanAccount savedInterest=loanRepository.save(loanAccount);
		
		return savedInterest;
	
	}

	@Override
	public LoanAccount updateInterest(LoanAccount loanAccount) throws CustomerNotFoundException {
		
		Optional<LoanAccount> optionalProduct = loanRepository.findById(loanAccount.getCustomerId());
		
		if(optionalProduct.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! customer is not existing with id: "+loanAccount.getCustomerId());
		}
		
		LoanAccount updatedProduct = loanRepository.save(loanAccount);
		
		return updatedProduct;
	}
		
	
	
	
}
