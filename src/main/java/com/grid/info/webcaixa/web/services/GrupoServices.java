package com.grid.info.webcaixa.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.grid.info.webcaixa.Domain.Entity.Grupo;
import com.grid.info.webcaixa.repository.interfaces.GrupoRepository;
import com.grid.info.webcaixa.web.GrupoMapper;
import com.grid.info.webcaixa.web.dto.GrupoResponseDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GrupoServices {

    private final GrupoRepository grupoRepository;
    private final GrupoMapper grupoMapper;

    public List<Grupo> getAllGrupos() {
        List<Grupo> listGrupos = grupoRepository.findAll();
        return listGrupos;

    }

    public ResponseEntity<GrupoResponseDto> getGrupoPorId(Long id) {

        Optional<Grupo> grupoOpt = grupoRepository.findById(id);

        if (grupoOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        GrupoResponseDto dto = grupoMapper.toGrupoResponse(grupoOpt.get());

        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    public ResponseEntity<List<Grupo>> getGrupoSubPorId(Long id) {
        List<Grupo> dto = grupoRepository.findGrupoSubGrupoById(id);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}
