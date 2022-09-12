package com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long> {
}
