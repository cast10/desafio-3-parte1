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
@Table(name = "estado")
public class EstadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String estadoNome;

    @Column(length = 30, nullable = false)
    private String uf;

    @JsonIgnore
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<CidadeModel> cidade = new ArrayList<>();


}
