package com.rd.treinamentodev.AvaliacaoSpringBoot.controller;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.AlunoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.ResultData;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.AlunoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController<alunoDTO> {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private ResultData resultData;

    @PostMapping("/aluno")
    public ResponseEntity gravar(@RequestBody AlunoDTO alunoDTO) {
        ResultData resultData = null;

        if (alunoDTO.getCpf() == null)
            resultData = new ResultData(HttpStatus.BAD_REQUEST.value(), "CPF não informado!");
        else if (alunoDTO.getCpf() == null)
            resultData = new ResultData(HttpStatus.BAD_REQUEST.value(), "CPF não informado!");

        if (resultData != null)
            return ResponseEntity.badRequest().body(resultData);
        else {

            try {
                ResponseEntity alunoEntity = alunoService.gravar(alunoDTO);
                ResultData<AlunoEntity> resultData1 = new ResultData<AlunoEntity>(HttpStatus.OK.value(), "CPF registrado com sucesso!");
                return ResponseEntity.status(HttpStatus.CREATED).body(resultData);
            } catch (Exception e) {
                ResultData resultData1 = new ResultData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "CPF já registrado", e.getMessage());
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(alunoDTO);


                     }

                }
        }

    }