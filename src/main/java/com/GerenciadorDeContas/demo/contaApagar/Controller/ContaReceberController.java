package com.GerenciadorDeContas.demo.contaApagar.Controller;


import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.ContaReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
public class ContaReceberController {

    @Autowired
    private ContaReceberService contaReceberService;

    @GetMapping(path = "/contareceber")
    public ResponseEntity<List<ContaReceberModel>> buscarContasReceber(){
        return ResponseEntity.ok (contaReceberService.buscaCOntaReceberTodos());
    }

    @GetMapping(path = "/contareceber/{id}")
    public ResponseEntity<Optional<ContaReceberModel>> buscarContaReceberID(@PathVariable long id){
        return ResponseEntity.ok(contaReceberService.buscarPorIdContaReceber(id));
    }

    @PostMapping(path = "/contareceber")
    public ResponseEntity<ContaReceberModel> cadastrarContaReceber(@Valid @RequestBody ContaReceberModel cadastraNovaConta){
        ContaReceberModel novoRecebimento = contaReceberService.registrarContaReceber(cadastraNovaConta);
        return new ResponseEntity<>(novoRecebimento,  HttpStatus.CREATED);
    }

    @PutMapping(path = "/contareceber/{id}")
    public ResponseEntity<ContaReceberModel>alterarContaReceber(@RequestBody ContaReceberModel alterandoConta, Long id) {
        alterandoConta.setContaReceberId(id);
        return ResponseEntity.ok (contaReceberService.alterarContaReceber(alterandoConta));

    }
    @DeleteMapping(path = "/contareceber/{id}")
    public ResponseEntity<Void>deletarContaRecebere(@PathVariable long id){
        contaReceberService.deleteIdContaReceber(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
