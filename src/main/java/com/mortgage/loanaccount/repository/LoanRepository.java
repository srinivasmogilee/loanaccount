package com.mortgage.loanaccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortgage.loanaccount.entity.LoanAccount;


//@Repository
public interface LoanRepository extends JpaRepository<LoanAccount,Integer>{

}
