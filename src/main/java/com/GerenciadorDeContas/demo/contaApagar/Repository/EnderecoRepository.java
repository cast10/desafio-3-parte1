package com.GerenciadorDeContas.demo.contaApagar.Repository;

import com.GerenciadorDeContas.demo.contaApagar.Model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository <EnderecoModel, Long> {
}
