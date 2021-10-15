package com.example.demo;

import com.example.demo.controller.AccountService;
import com.example.demo.controller.AccountServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceIT {
    private AccountService accountService = new AccountServiceImpl();

    @Test
    public void getAccountsTest() {
        assertEquals(accountService.getAccounts().getItems().size(), 1);
    }
}
