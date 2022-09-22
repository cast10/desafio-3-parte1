package com.GerenciadorDeContas.demo.contaApagar.Controller;

import com.GerenciadorDeContas.demo.contaApagar.Model.EnderecoModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(path = "/endereco")
    public ResponseEntity<List<EnderecoModel>> buscarEndereco(){
        return ResponseEntity.ok (enderecoService.buscaEnderecoTodos());
    }

    @GetMapping(path = "/endereco/{id}")
    public ResponseEntity<Optional<EnderecoModel>> buscarEnderecoID(@PathVariable long id){
        return ResponseEntity.ok(enderecoService.buscarPorId(id));
    }

    @PostMapping(path = "/endereco")
    public ResponseEntity <EnderecoModel> cadastrarEndereco(@RequestBody EnderecoModel cadastrarEndereco){
        EnderecoModel novoEndereco = enderecoService.registrarEndereco(cadastrarEndereco);
        return new ResponseEntity<>(novoEndereco, HttpStatus.CREATED);
    }

    @PutMapping(path = "/endereco/{id}")
    public ResponseEntity<EnderecoModel> altereEnderecop (@RequestBody EnderecoModel alterarNovoEndereco,@PathVariable Long id){
        alterarNovoEndereco.setId(id);
        return ResponseEntity.ok(enderecoService.alterarEndereco(alterarNovoEndereco));

    }
    @DeleteMapping(path = "/endereco/{id}")
    public ResponseEntity <Void> deletarEndereco(@PathVariable long id){
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }



}
