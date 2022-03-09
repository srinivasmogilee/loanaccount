package com.mortgage.loanaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgage.loanaccount.entity.LoanAccount;
import com.mortgage.loanaccount.exception.LoanAccountNotFoundException;
import com.mortgage.loanaccount.service.LoanService;


@RestController
@RequestMapping("/loan")
public class LoanController {


	@Autowired
	private LoanService loanService;
	
	@PutMapping("/updateemi")
	public ResponseEntity<LoanAccount> modifyEmi(@RequestBody LoanAccount loanaccount) throws LoanAccountNotFoundException{
		LoanAccount updatedEmi = loanService.updateEmi(loanaccount);
		return new ResponseEntity<>(updatedEmi, HttpStatus.OK);
	}
	
	@PostMapping("/saveemi")
	public ResponseEntity<LoanAccount> addEmi(@RequestBody LoanAccount loanAccount){
		
		LoanAccount newLoanInterest = loanService.addEmi(loanAccount);
		ResponseEntity<LoanAccount> responseEntity=new ResponseEntity(newLoanInterest, HttpStatus.CREATED);
		return responseEntity;
	
   }
	@PutMapping("/updateInterest")
	public ResponseEntity<LoanAccount> modifyaddInterest(@RequestBody LoanAccount loanaccount) throws LoanAccountNotFoundException{
		LoanAccount updatedInterest = loanService.updateEmi(loanaccount);
		return new ResponseEntity<>(updatedInterest, HttpStatus.OK);
	}
	
	@PostMapping("/saveinterest")
	public ResponseEntity<LoanAccount> addInterest(@RequestBody LoanAccount loanAccount){
		
		LoanAccount newLoanInterest = loanService.addInterest(loanAccount);
		ResponseEntity<LoanAccount> responseEntity=new ResponseEntity(newLoanInterest, HttpStatus.CREATED);
		return responseEntity;
	
   }


}