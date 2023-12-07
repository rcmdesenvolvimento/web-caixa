package com.grid.info.webcaixa.Domain.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lancamentos")
@Getter
@Setter
@NoArgsConstructor
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_lancamento", nullable = false)
    private LocalDate dataLancamento;

    @Column(name = "valor_lancamento", nullable = false)
    private BigDecimal valorLancamento;

    @Column(name = "situacao_lancamento", nullable = false)
    private String situacao;

    @ManyToOne
    @JoinColumn(name = "subgrupo_id")
    private SubGrupo subGrupo;

}
