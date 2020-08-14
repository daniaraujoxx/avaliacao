package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CursoDTO {

    private Long idCurso;
    private String nomeCurso;
    private Integer nrCargaHoraria;

}
