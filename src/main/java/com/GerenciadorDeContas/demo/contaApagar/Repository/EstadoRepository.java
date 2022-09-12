package com.GerenciadorDeContas.demo.contaApagar.Repository;

import com.GerenciadorDeContas.demo.contaApagar.Model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<EstadoModel, Long> {
}
