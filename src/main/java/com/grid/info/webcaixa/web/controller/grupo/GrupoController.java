package com.grid.info.webcaixa.web.controller.grupo;

import org.springframework.web.bind.annotation.RestController;

import com.grid.info.webcaixa.Domain.Entity.Grupo;
import com.grid.info.webcaixa.web.GrupoMapper;
import com.grid.info.webcaixa.web.dto.GrupoResponseDto;
import com.grid.info.webcaixa.web.services.GrupoServices;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/grupo")
@RequiredArgsConstructor
public class GrupoController {

    private final GrupoServices grupoServices;
    private final GrupoMapper grupoMapper;

    @GetMapping()
    public ResponseEntity<List<GrupoResponseDto>> getAllGrupos() {
        List<Grupo> grupos = grupoServices.getAllGrupos();
        List<GrupoResponseDto> dto = grupoMapper.toGrupoResponseList(grupos);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GrupoResponseDto> getGrupoPorId(@PathVariable Long id) {
        return grupoServices.getGrupoPorId(id);
    }

    @GetMapping("sub/{id}")
    public ResponseEntity<List<Grupo>> getGrupoSubGrupo(@PathVariable Long id) {
        return grupoServices.getGrupoSubPorId(id);
    }

}
