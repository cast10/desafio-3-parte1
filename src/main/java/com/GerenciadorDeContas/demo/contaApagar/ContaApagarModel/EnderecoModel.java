package com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "endereco")

public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 30, nullable = false)
    private String logradouro;

    @Column(length = 30, nullable = false)
    private String bairro;

    @Column(length = 9, nullable = false)
    private String CEP;

    @Column(length = 30, nullable = false)
    private String pontoReferencia;

}
