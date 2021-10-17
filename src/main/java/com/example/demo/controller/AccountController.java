package com.example.demo.controller;


import com.example.demo.api.AccountsApiDelegate;
import com.example.demo.model.GetAccountsResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AccountController implements AccountsApiDelegate {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @Override
    public ResponseEntity<GetAccountsResponseDto> getAccounts() {
        return new ResponseEntity(accountService.getAccounts(), HttpStatus.OK);
    }
}
