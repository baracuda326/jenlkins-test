package com.example.demo.controller;


import com.example.demo.api.AccountsApiDelegate;
import com.example.demo.model.GetAccountsResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AccountController implements AccountsApiDelegate {
    private final AccountServiceImpl accountService;

    public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @Override
    public ResponseEntity<GetAccountsResponseDto> getAccounts() {
        return new ResponseEntity(accountService.getAccounts(), HttpStatus.OK);
    }
}
