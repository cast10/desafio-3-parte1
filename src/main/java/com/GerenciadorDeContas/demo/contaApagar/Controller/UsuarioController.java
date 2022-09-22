package com.GerenciadorDeContas.demo.contaApagar.Controller;

//import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;//
import com.GerenciadorDeContas.demo.contaApagar.Model.UsuarioModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping(path = "/usuario")
    public ResponseEntity<List<UsuarioModel>> buscarUsuario(){
        return ResponseEntity.ok(usuarioService.todosUsuario());
    }

    @GetMapping(path = "/usuario/{id}")
    public ResponseEntity<Optional<UsuarioModel>> buscarUsuarioId(@PathVariable long id){
        return ResponseEntity.ok(usuarioService.buscarPorId(id));
    }

    @PostMapping(path = "/usuario")
    public ResponseEntity <UsuarioModel> cadastrarUsuario(@RequestBody UsuarioModel cadastreUsuario){
        UsuarioModel novoUsuario = usuarioService.registrarUsuario(cadastreUsuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    @PutMapping(path = "/usuario/{id}")
    ResponseEntity<UsuarioModel>alteraUsuario (@RequestBody UsuarioModel altereUsuario, @PathVariable Long id) {
        altereUsuario.setId(id);
        return ResponseEntity.ok(usuarioService.alterarUsuario(altereUsuario));
    }

    @DeleteMapping(path = "/usuario/{id}")
    public ResponseEntity<Void>deletarConta(@PathVariable long id){
        usuarioService.deleteUsuarioId(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


}
