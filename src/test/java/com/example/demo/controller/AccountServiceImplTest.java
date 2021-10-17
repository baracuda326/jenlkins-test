package com.example.demo.controller;

import com.example.demo.business.AccountService;
import com.example.demo.business.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountServiceImplTest {
    private AccountService accountService = new AccountServiceImpl();

    @Test
    void getAccounts() {
        assertEquals(accountService.getAccounts().getItems().size(), 1);
    }
}