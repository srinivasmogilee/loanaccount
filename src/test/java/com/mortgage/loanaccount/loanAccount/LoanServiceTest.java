package com.mortgage.loanaccount.loanAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



import java.time.LocalDate;
import java.util.Optional;



import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortgage.loanaccount.entity.LoanAccount;
import com.mortgage.loanaccount.repository.LoanRepository;
import com.mortgage.loanaccount.service.LoanService;
import com.mortgage.loanaccount.service.LoanServiceImpl;


@SpringBootTest
public class LoanServiceTest {

@InjectMocks
private LoanService loanService = new LoanServiceImpl();
@Mock
private LoanRepository loanRepository;

@Test
public void testgetUpdateInterestDetailsByCustomerId() {
LoanAccount loanAccount = new LoanAccount();
loanAccount.setCustomerId(1);
loanAccount.setAccountNumber(1234567890);
loanAccount.setTypeOfMortgage("dummyname");
loanAccount.setTotalLoanAmount(300000000);
loanAccount.setStartDate(LocalDate.of(2022, 03, 1));
loanAccount.setEndDate(LocalDate.of(2027, 03, 1));
loanAccount.setTenure(5);
loanAccount.setOutStandingCharges(34567);
loanAccount.setLoanStatus("active");
loanAccount.setPaidemi(3452);

Optional<LoanAccount> optionalLoanAccount = Optional.of(loanAccount);
int customerId = 1;

when(loanRepository.findById(1)).thenReturn(optionalLoanAccount);
LoanAccount updatedLoanAccount = loanRepository.save(loanAccount);
}

@Test
public void testgetUpdateEmidetailsByCustomerId() {
LoanAccount loanAccount = new LoanAccount();
loanAccount.setCustomerId(1);
loanAccount.setAccountNumber(1234567890);
loanAccount.setTypeOfMortgage("dummyname");
loanAccount.setTotalLoanAmount(300000000);
loanAccount.setStartDate(LocalDate.of(2022, 03, 1));
loanAccount.setEndDate(LocalDate.of(2027, 03, 1));
loanAccount.setTenure(5);
loanAccount.setOutStandingCharges(34567);
loanAccount.setLoanStatus("active");
loanAccount.setPaidemi(3452);

Optional<LoanAccount> optionalLoanAccount = Optional.of(loanAccount);
int customerId = 1;

when(loanRepository.findById(1)).thenReturn(optionalLoanAccount);

LoanAccount updatedLoanAccount = loanRepository.save(loanAccount);
}
@Test
public void testSaveInterestDetailsByCustomerId() {
LoanAccount loanAccount = new LoanAccount();
loanAccount.setCustomerId(1);
loanAccount.setAccountNumber(1234567890);
loanAccount.setTypeOfMortgage("dummyname");
loanAccount.setTotalLoanAmount(300000000);
loanAccount.setStartDate(LocalDate.of(2022, 03, 1));
loanAccount.setEndDate(LocalDate.of(2027, 03, 1));
loanAccount.setTenure(5);
loanAccount.setOutStandingCharges(34567);
loanAccount.setLoanStatus("active");
loanAccount.setPaidemi(3452);

Optional<LoanAccount> optionalLoanAccount = Optional.of(loanAccount);
int customerId = 1;

when(loanRepository.save(loanAccount)).thenReturn(loanAccount); 
loanService.addEmi(loanAccount);
verify(loanRepository,times(1)).save(loanAccount);

}

@Test
public void testSaveEmiDetailsByCustomerId() {
LoanAccount loanAccount = new LoanAccount();
loanAccount.setCustomerId(1);
loanAccount.setAccountNumber(1234567890);
loanAccount.setTypeOfMortgage("dummyname");
loanAccount.setTotalLoanAmount(300000000);
loanAccount.setStartDate(LocalDate.of(2022, 03, 1));
loanAccount.setEndDate(LocalDate.of(2027, 03, 1));
loanAccount.setTenure(5);
loanAccount.setOutStandingCharges(34567);
loanAccount.setLoanStatus("active");
loanAccount.setPaidemi(3452);

when(loanRepository.save(loanAccount)).thenReturn(loanAccount); 

loanService.addEmi(loanAccount);
verify(loanRepository,times(1)).save(loanAccount);

}

}