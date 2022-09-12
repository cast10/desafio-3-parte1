package com.GerenciadorDeContas.demo.contaApagar.ContaApagarService;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.ContaAPagarModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.UsuarioModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> todosUsuario() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioModel registrarUsuario(UsuarioModel usuarioModel) {

        usuarioModel.getId();
        usuarioModel.getUsuarioNome();
        usuarioModel.getEmail();
        usuarioModel.getCPF();
        usuarioModel.getDataNascimento();


        return usuarioRepository.save(usuarioModel);
    }

    public void deleteUsuarioId(Long id) {
        usuarioRepository.deleteById(id);
    }

}
