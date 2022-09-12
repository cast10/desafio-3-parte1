package com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "cidade")
public class CidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cidadeId;

    @Column(length = 30, nullable = false)
    private String cidadeNome;
}
