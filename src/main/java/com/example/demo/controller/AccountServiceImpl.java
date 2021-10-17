package com.example.demo.controller;

import com.example.demo.model.AccountDto;
import com.example.demo.model.GetAccountsResponseDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public GetAccountsResponseDto getAccounts() {
        return new GetAccountsResponseDto().addItemsItem(new AccountDto().iban("test"));
    }
}