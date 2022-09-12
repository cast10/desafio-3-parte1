package com.GerenciadorDeContas.demo.contaApagar.Repository;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaAPagarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaAPagarRepository extends JpaRepository<ContaAPagarModel, Long> {
}
