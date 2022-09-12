package com.GerenciadorDeContas.demo.contaApagar.Controller;

import com.GerenciadorDeContas.demo.contaApagar.Model.ContaAPagarModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.ContaAPagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasAPagarController {

    @Autowired
    private ContaAPagarService contaAPagarService;

    @GetMapping (path = "/gerenciador")
    public List <ContaAPagarModel> buscarConta(){
        return contaAPagarService.buscaTodos();
    }

    @GetMapping(path = "/gerenciador/{id}")
    public Optional<ContaAPagarModel> buscarContaId(@PathVariable long id){
        return contaAPagarService.buscarId(id);
    }

   // @GetMapping(path = "/gerenciador/status/{status}")
    //public Optional<ContaAPagarModel> buscarContaId(@PathVariable Status status){
     //   return contaAPagarService.buscarId(status);
    //}

   // @GetMapping(path = "/gerenciador/tipo/{tipo}")
    //public Optional<ContaAPagarModel> buscarContaId(@PathVariable Tipo tipo) {
      //  return contaAPagarService.buscarId(tipo);
    //}

    @PostMapping(path = "/gerenciador")
    public ContaAPagarModel cadastrarConta(@RequestBody ContaAPagarModel contaAPagarModel){
        return contaAPagarService.registrarConta(contaAPagarModel);
    }

    @PutMapping(path = "/gerenciador/{id}")
    public ContaAPagarModel alterarStatus (@RequestBody ContaAPagarModel contaAPagarModel,@PathVariable Long id){
        return contaAPagarService.alterarStatusConta(contaAPagarModel);

    }
    @DeleteMapping(path = "/gerenciador/{id}")
    public  void deletarConta(@PathVariable long id){
        contaAPagarService.deleteId(id);
    }

}