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



    @JsonIgnore
    @OneToMany(mappedBy = "estado_id",cascade = CascadeType.ALL)
    private List<CidadeModel> listacidades = new ArrayList<CidadeModel>();
}
