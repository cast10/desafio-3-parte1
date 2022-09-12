package com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<CidadeModel, Long> {
}
