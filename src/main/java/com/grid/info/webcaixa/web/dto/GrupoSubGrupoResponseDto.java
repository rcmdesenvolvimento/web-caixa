package com.grid.info.webcaixa.web.dto;

import java.util.ArrayList;
import java.util.List;

import com.grid.info.webcaixa.Domain.Entity.SubGrupo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GrupoSubGrupoResponseDto {
    
    private Long id;
    private String nome;
    private List<SubGrupo> SubGrupo = new ArrayList<SubGrupo>();
    
}
