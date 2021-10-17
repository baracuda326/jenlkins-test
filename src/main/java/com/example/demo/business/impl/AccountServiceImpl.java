package com.example.demo.business.impl;

import com.example.demo.business.AccountService;
import com.example.demo.mappers.AccountMapper;
import com.example.demo.model.AccountDto;
import com.example.demo.model.GetAccountsResponseDto;
import com.example.demo.models.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public GetAccountsResponseDto getAccounts() {
        AccountDto accountDto = AccountMapper.INSTANCE.accountToAccountDTO(new Account("dima"));
        return new GetAccountsResponseDto().addItemsItem(accountDto);
    }
}
