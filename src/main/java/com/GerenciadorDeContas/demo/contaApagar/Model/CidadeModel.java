package com.GerenciadorDeContas.demo.contaApagar.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cidade")
public class CidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cidadeId;

    @Column(length = 30, nullable = false)
    private String cidadeNome;

    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "cidadeId")
    private EstadoModel estado;

    @JsonIgnore
    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<EnderecoModel> enderecos = new ArrayList<>();

    public CidadeModel(String cidadeNome, EstadoModel estado) {
        this.cidadeNome = cidadeNome;
        this.estado = estado;
    }
}
