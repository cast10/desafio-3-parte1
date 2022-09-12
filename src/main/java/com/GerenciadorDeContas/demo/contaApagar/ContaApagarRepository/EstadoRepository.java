package com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<EstadoModel, Long> {
}
