package com.GerenciadorDeContas.demo.contaApagar.Service;

import com.GerenciadorDeContas.demo.contaApagar.Model.UsuarioModel;
import com.GerenciadorDeContas.demo.contaApagar.Repository.UsuarioRepository;
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
        usuarioModel.getCpf();
        usuarioModel.getDataNascimento();


        return usuarioRepository.save(usuarioModel);
    }
    public UsuarioModel alterarUsuario(UsuarioModel usuarioModel) {


        usuarioModel.getUsuarioNome();
        usuarioModel.getEmail();
        usuarioModel.getCpf();
        usuarioModel.getDataNascimento();


        return usuarioRepository.save(usuarioModel);
    }



    public void deleteUsuarioId(Long id) {
        usuarioRepository.deleteById(id);
    }

}
