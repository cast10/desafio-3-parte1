package com.GerenciadorDeContas.demo.contaApagar.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String usuarioNome;

    @Column(length = 10, nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 30, nullable = false)
    @Email
    private String email;

    @Column(length = 11, nullable = false)
    @CPF
    private String cpf;

   // @JsonIgnore
    //@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
   // private List<ContaReceberModel> contaReceber = new ArrayList<>();

   // @JsonIgnore
   // @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
   // private List<EnderecoModel> enderecos = new ArrayList<>();

   // public UsuarioModel(String nomeUsuario, LocalDate dataNascimento, String email, String cpf) {
     //   this.usuarioNome = nomeUsuario;
       // this.dataNascimento = dataNascimento;
       // this.email = email;
       // this.cpf = cpf;


    }

