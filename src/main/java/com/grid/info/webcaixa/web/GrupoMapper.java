package com.grid.info.webcaixa.web;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.grid.info.webcaixa.Domain.Entity.Grupo;
import com.grid.info.webcaixa.web.dto.GrupoResponseDto;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GrupoMapper {

    private final ModelMapper mapper;

    public GrupoResponseDto toGrupoResponse(Grupo grupo){
        return mapper.map(grupo,GrupoResponseDto.class);
     }

    public List<GrupoResponseDto> toGrupoResponseList(List<Grupo> grupos){
        return grupos.stream()
                .map(this::toGrupoResponse)
                .collect(Collectors.toList());
     }
}
