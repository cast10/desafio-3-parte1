package com.GerenciadorDeContas.demo.contaApagar.Model;


import com.GerenciadorDeContas.demo.contaApagar.Model.enuns.RecebimentoAlugueis;
import com.GerenciadorDeContas.demo.contaApagar.Model.enuns.Status;
import com.GerenciadorDeContas.demo.contaApagar.Model.enuns.TipoRecebido;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "contareceber")
public class ContaReceberModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contaReceberId;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column(length = 30, nullable = false)
    private String recebimento;

    @Column(length = 15, nullable = false)
    private BigDecimal valorRecebido;

    private RecebimentoAlugueis recebimentoAlugueis;

    @Column(length = 15, nullable = false)
    private LocalDate dataDeVencimento;

    @Column(length = 15, nullable = false)
    private LocalDateTime dataDeRecebimento;

    @Enumerated(value = EnumType .STRING)
    private TipoRecebido tipoRecebido;

   @ManyToOne
   @JoinColumn(name = "usuario_id", referencedColumnName = "codigo")
   private UsuarioModel usuario;



}



