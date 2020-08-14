package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.AlunoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.InstrutorEntity;
import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Data
public class TurmaDTO {

    private CursoDTO curso;

    private String dtInicio;

    private String dtFim;

    private List<InstrutorDTO> instrutores;

    private List<AlunoDTO> alunos;

    public void setCurso(CursoEntity curso) {
    }

    public void setAlunos(List<AlunoEntity> alunos) {
    }

    public void setInstrutores(List<InstrutorEntity> instrutores) {
    }

    public void setDtInicio(Date dtInicio) {
    }

    public void setDtFim(Date dtFinal) {
    }


}
