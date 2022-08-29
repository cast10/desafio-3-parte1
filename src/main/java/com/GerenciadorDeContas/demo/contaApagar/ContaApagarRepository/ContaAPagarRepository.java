package com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.ContaAPagarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaAPagarRepository extends JpaRepository<ContaAPagarModel, Long> {
}
