package org.edu.fabs.javabankservice.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    // precisao (precision) de inteiros e decimais (scale)
    // 9999999999999,99
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    // o nome da coluna é para evitar problemas com palavras reservadas
    @Column(name = "addicional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

}
