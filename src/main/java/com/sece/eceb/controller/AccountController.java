package com.sece.eceb.controller;

import java.util.List;

import com.sece.eceb.dto.Account;
import com.sece.eceb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping("/account")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/account")
    public List<Account> getAccount() {
        return accountService.getAccount();
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable Long id){
        return accountService.getAccount(id);
    }

    @DeleteMapping("/account/{id}")
    public String deleteAccount(@PathVariable Long id) {
        return accountService.deleteAccount(id);
    }

    @PutMapping("/account/{id}")
    public Account updateAccount(@PathVariable Long id, @RequestBody Account account) {
        return accountService.updateAccount(id, account);
    }


}