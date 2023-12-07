package com.grid.info.webcaixa.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grid.info.webcaixa.Domain.Entity.Grupo;

import java.util.List;
import java.util.Optional;

public interface GrupoRepository extends JpaRepository<Grupo, Long> {

    Optional<Grupo> findById(Long id);
    List<Grupo> findGrupoSubGrupoById(Long id);
       
}
