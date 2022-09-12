package com.GerenciadorDeContas.demo.contaApagar.Model;

import com.GerenciadorDeContas.demo.contaApagar.Model.enuns.Status;
import com.GerenciadorDeContas.demo.contaApagar.Model.enuns.Tipo;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "gerenciador")
public class ContaAPagarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String nome;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column(length = 10, nullable = false)
    @Enumerated(value = EnumType .STRING)
    private Tipo tipo;

    @Column(length = 10, nullable = false)
    private Double Valor;

    @Column(length = 10, nullable = false)
    private LocalDate dataDeVencimento;

    @Column(length = 10)
    private LocalDateTime dataDePagamento;

}