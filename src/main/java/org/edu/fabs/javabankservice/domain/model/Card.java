package org.edu.fabs.javabankservice.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    // o nome da coluna é para evitar problemas com palavras reservadas
    // 9999999999999,99
    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;


}