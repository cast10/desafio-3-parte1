package com.GerenciadorDeContas.demo.contaApagar.Model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "estado")
public class EstadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estadoId;

    @Column(length = 20, nullable = false)
    private String estadoNome;

    @Column(length = 30, nullable = false)
    private String uf;

}
