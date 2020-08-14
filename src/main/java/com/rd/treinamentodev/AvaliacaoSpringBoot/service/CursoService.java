package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CursoService {

    @Autowired
    private CursoService service;

    @Autowired
    private CursoRepository repository;


    public CursoDTO parseToDTO(CursoEntity entity){
        CursoDTO dto = new CursoDTO();

        if(entity == null)
            return dto;

        dto.setIdCurso(entity.getIdCurso());
        dto.setNomeCurso(entity.getNomeCurso());
        dto.setNrCargaHoraria(entity.getNrCargaHoraria());
        return dto;
    }

    public CursoEntity parseToEntity(CursoDTO dto, CursoEntity entity) {
        if (entity == null)
            entity = new CursoEntity();

        if (dto == null)
            return entity;

        entity.setIdCurso(dto.getIdCurso());
        entity.setNomeCurso(dto.getNomeCurso());
        entity.setNrCargaHoraria(dto.getNrCargaHoraria());

        return entity;
    }

    public void cadastrar(CursoDTO dto) {
        CursoEntity entity = service.parseToEntity(dto, null);
        if(entity.getIdCurso() != null)
            repository.save(entity);
    }


}
