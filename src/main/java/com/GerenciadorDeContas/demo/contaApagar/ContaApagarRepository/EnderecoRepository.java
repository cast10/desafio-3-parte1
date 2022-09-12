package com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository <EnderecoModel, Long> {
}
