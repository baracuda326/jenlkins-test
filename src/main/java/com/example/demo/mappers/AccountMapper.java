package com.example.demo.mappers;

import com.example.demo.model.AccountDto;
import com.example.demo.models.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "iban", target = "iban")
    AccountDto accountToAccountDTO(Account account);
}
