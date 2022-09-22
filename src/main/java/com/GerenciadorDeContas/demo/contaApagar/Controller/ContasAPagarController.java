package com.GerenciadorDeContas.demo.contaApagar.Controller;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaAPagarModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.ContaAPagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasAPagarController {

    @Autowired
    private ContaAPagarService contaAPagarService;

    @GetMapping (path = "/gerenciador")
    public ResponseEntity<List<ContaAPagarModel>> buscarConta(){
        return ResponseEntity.ok(contaAPagarService.buscaTodos());
    }

    @GetMapping(path = "/gerenciador/{id}")
    public ResponseEntity<Optional<ContaAPagarModel>> buscarContaId(@PathVariable long id){
        return ResponseEntity.ok(contaAPagarService.buscarId(id));
    }


    @PostMapping(path = "/gerenciador")
    public ResponseEntity <ContaAPagarModel> cadastrarConta(@RequestBody ContaAPagarModel cadastreConta){
        ContaAPagarModel novaConta = contaAPagarService.registrarConta(cadastreConta);
        return new ResponseEntity<>(novaConta, HttpStatus.CREATED);
    }

    @PutMapping(path = "/gerenciador/{id}")
    public ResponseEntity<ContaAPagarModel> alterarStatus (@RequestBody ContaAPagarModel altereConta,@PathVariable Long id){
        altereConta.setId(id);
        return ResponseEntity.ok(contaAPagarService.alterarStatusConta(altereConta));

    }
    @DeleteMapping(path = "/gerenciador/{id}")
    public ResponseEntity <Void>deletarConta(@PathVariable long id){
        contaAPagarService.deleteId(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    // @GetMapping(path = "/gerenciador/status/{status}")
    //public Optional<ContaAPagarModel> buscarContaId(@PathVariable Status status){
    //   return contaAPagarService.buscarId(status);
    //}

    // @GetMapping(path = "/gerenciador/tipo/{tipo}")
    //public Optional<ContaAPagarModel> buscarContaId(@PathVariable Tipo tipo) {
    //  return contaAPagarService.buscarId(tipo);
    //}
}