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
@Table(name = "cidade")
public class CidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cidadeId;

    @Column(length = 30, nullable = false)
    private String cidadeNome;

   //@ManyToOne
   //@JoinColumn(name = "estado_id", referencedColumnName = "codigo")
    //private EstadoModel estado_id;


   //@JsonIgnore
   //@OneToMany(mappedBy = "cidade_id",cascade = CascadeType.ALL)
   //private List<EnderecoModel> listaDeEndereco = new ArrayList<EnderecoModel>();
}
