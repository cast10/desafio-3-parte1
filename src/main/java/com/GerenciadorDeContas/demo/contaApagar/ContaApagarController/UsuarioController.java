package com.GerenciadorDeContas.demo.contaApagar.ContaApagarController;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.UsuarioModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarService.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping(path = "/usuario")
    public List<UsuarioModel> buscarUsuario(){
        return usuarioService.todosUsuario();
    }

    @GetMapping(path = "/usuario/{id}")
    public Optional<UsuarioModel> buscarUsuarioId(@PathVariable long id){
        return usuarioService.buscarPorId(id);
    }
    @PostMapping(path = "/usuario")
    public UsuarioModel cadastrarUsuario(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.registrarUsuario(usuarioModel);
    }

    @DeleteMapping(path = "/usuario/{id}")
    public  void deletarConta(@PathVariable long id){
        usuarioService.deleteUsuarioId(id);
    }


}
