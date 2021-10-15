package com.example.demo;

import lombok.Data;

@Data
public class Account {

    private final String iban;

    public Account(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }
}