package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "tb_modulo")
@Data
public class ModuloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger idModulo;

    @Column
    private String nome;

    @OneToOne
    @JoinColumn(name = "id_instrutor")
    private BigInteger idInstrutor;


}
