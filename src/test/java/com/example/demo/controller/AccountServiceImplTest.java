package com.example.demo.controller;

import com.example.demo.business.AccountService;
import com.example.demo.business.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountServiceImplTest {
    private AccountService accountService = new AccountServiceImpl();

    @Test
    void getAccounts() {
        assertThat(accountService.getAccounts().getItems().size()).isEqualTo(1);
    }
}