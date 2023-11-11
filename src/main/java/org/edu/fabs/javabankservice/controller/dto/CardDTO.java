package org.edu.fabs.javabankservice.controller.dto;

import org.edu.fabs.javabankservice.domain.model.Card;

import java.math.BigDecimal;

public record CardDTO(String number, BigDecimal limit) {

    public CardDTO(Card model) {
        this(model.getNumber(), model.getLimit());
    }

    public Card toModel() {
        Card model = new Card();
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }

}
