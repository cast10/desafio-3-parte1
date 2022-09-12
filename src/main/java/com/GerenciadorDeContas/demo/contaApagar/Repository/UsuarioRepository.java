package com.GerenciadorDeContas.demo.contaApagar.Repository;

import com.GerenciadorDeContas.demo.contaApagar.Model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long> {
}
