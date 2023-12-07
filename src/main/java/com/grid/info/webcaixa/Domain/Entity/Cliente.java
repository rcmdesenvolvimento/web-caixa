package com.grid.info.webcaixa.Domain.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "cep", nullable = false, length = 8) // 22710310
    private String cep;

    @Column(name = "logradouro", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "bairro", nullable = false, length = 50)
    private String bairro;

    @Column(name = "localidade", nullable = false, length = 30) // Estado
    private String localidade;

    @Column(name = "uf", nullable = false, length = 2)
    private String uf;

}
