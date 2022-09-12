package com.GerenciadorDeContas.demo.contaApagar.Controller;


import com.GerenciadorDeContas.demo.contaApagar.Model.ContaReceberModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.ContaReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class ContaReceberController {

    @Autowired
    private ContaReceberService contaReceberService;

    @GetMapping(path = "/contareceber")
    public List<ContaReceberModel> buscarContasReceber(){
        return contaReceberService.buscaCOntaReceberTodos();
    }

    @GetMapping(path = "/contareceber/{id}")
    public Optional<ContaReceberModel> buscarContaReceberID(@PathVariable long id){
        return contaReceberService.buscarPorIdContaReceber(id);
    }

    @PostMapping(path = "/contareceber")
    public ContaReceberModel cadastrarContaReceber(@RequestBody ContaReceberModel contaReceberModel){
        return contaReceberService.registrarContaReceber(contaReceberModel);
    }

    @PutMapping(path = "/contareceber/{id}")
    public ContaReceberModel alterzaContaReceber (@RequestBody ContaReceberModel contaReceberModel,@PathVariable Long id){
        return contaReceberService.alterarContaReceber(contaReceberModel);

    }
    @DeleteMapping(path = "/contareceber/{id}")
    public  void deletarContaRecebere(@PathVariable long id){
        contaReceberService.deleteIdContaReceber(id);
    }
}
