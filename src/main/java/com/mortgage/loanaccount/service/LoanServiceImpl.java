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
	
	/****************************************************************************************************************************
	 - Method Name      : upDateEmi
	 - Input Parameters : loanaccount
	 - Return type      : updatedEmi
	 - Author           : Srinivas Thippakkagari
	 - Creation Date    : 06-03-2022
	 - Description      : Updating emi details into  the database.
	  ****************************************************************************************************************************/ 

	@Override
	public LoanAccount updateEmi(LoanAccount loanaccount) throws LoanAccountNotFoundException{
		
		Optional<LoanAccount> optionalloanaccount = loanRepository.findById(loanaccount.getCustomerId());
		
		if(optionalloanaccount.isEmpty()) {
			throw new LoanAccountNotFoundException("Sorry! loanaccount is not existing with id: "+loanaccount.getCustomerId());
		}
		
		LoanAccount updatedEmi = loanRepository.save(loanaccount);
		
		return updatedEmi;
	}

	/****************************************************************************************************************************
	 - Method Name      : addEmi
	 - Input Parameters : loanAccount
	 - Return type      : savededEmi
	 - Author           : Srinivas Thippakkagari
	 - Creation Date    : 06-03-2022
	 - Description      : adding emi details into  the database.
	  ****************************************************************************************************************************/ 

	
	@Override
	public LoanAccount addEmi(LoanAccount loanAccount) {

		
		LoanAccount savedEmi=loanRepository.save(loanAccount);
		
		return savedEmi;
	
	}

	/****************************************************************************************************************************
	 - Method Name      : addInterest
	 - Input Parameters : loanAccount
	 - Return type      : savedInterest
	 - Author           : Srinivas Thippakkagari
	 - Creation Date    : 06-03-2022
	 - Description      : Adding Interest details into  the database.
	  ****************************************************************************************************************************/ 

	
	@Override
	public LoanAccount addInterest(LoanAccount loanAccount) {

		
		LoanAccount savedInterest=loanRepository.save(loanAccount);
		
		return savedInterest;
	
	}

	/****************************************************************************************************************************
	 - Method Name      : upDateInterest
	 - Input Parameters : loanAccount
	 - Return type      : updated
	 - Author           : Srinivas Thippakkagari
	 - Creation Date    : 06-03-2022
	 - Description      : Update Interest details into  the database.
	  ****************************************************************************************************************************/ 

	
	@Override
	public LoanAccount updateInterest(LoanAccount loanAccount) throws CustomerNotFoundException {
		
		Optional<LoanAccount> optionalProduct = loanRepository.findById(loanAccount.getCustomerId());
		
		if(optionalProduct.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! customer is not existing with id: "+loanAccount.getCustomerId());
		}
		
		LoanAccount updatedInterest = loanRepository.save(loanAccount);
		
		return updatedInterest;
	}
		
	
	
	
}
