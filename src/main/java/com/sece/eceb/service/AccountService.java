package com.sece.eceb.service;

import com.sece.eceb.dto.Account;
import com.sece.eceb.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> getAccount() {
        return accountRepository.findAll();
    }

    public Account getAccount(Long id){
        return accountRepository.findById(id).get();
    }

    public String deleteAccount(Long id) {
        accountRepository.deleteById(id);
        return "Account deleted successfully";
    }

    public Account updateAccount(Long id, Account account) {
        Account existingAccount = accountRepository.findById(id).get();
        existingAccount.setName(account.getName());
        existingAccount.setPhoneNumber(account.getPhoneNumber());
        return accountRepository.save(existingAccount);
    }


}