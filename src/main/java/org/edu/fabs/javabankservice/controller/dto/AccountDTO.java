package org.edu.fabs.javabankservice.controller.dto;

import org.edu.fabs.javabankservice.domain.model.Account;

import java.math.BigDecimal;

public record AccountDTO(String number, String agency, BigDecimal balance, BigDecimal limit) {

    public AccountDTO(Account model) {
        this(model.getNumber(), model.getAgency(), model.getBalance(), model.getLimit());
    }
    public Account toModel() {
        Account model = new Account();
        model.setNumber(this.number);
        model.setAgency(this.agency);
        model.setBalance(this.balance);
        model.setLimit(this.limit);
        return model;
    }

}
