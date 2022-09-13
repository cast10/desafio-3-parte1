package com.GerenciadorDeContas.demo.contaApagar.Controller;

import com.GerenciadorDeContas.demo.contaApagar.Model.EnderecoModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(path = "/endereco")
    public List<EnderecoModel>buscarEndereco(){
        return enderecoService.buscaEnderecoTodos();
    }

    @GetMapping(path = "/endereco/{id}")
    public Optional<EnderecoModel> buscarEnderecoID(@PathVariable long id){
        return enderecoService.buscarPorId(id);
    }

    @PostMapping(path = "/endereco")
    public EnderecoModel cadastrarEndereco(@RequestBody EnderecoModel enderecoModel){
        return enderecoService.registrarConta(enderecoModel);
    }

    @PutMapping(path = "/endereco/{id}")
    public EnderecoModel altereEnderecop (@RequestBody EnderecoModel enderecoModel,@PathVariable Long id){
        return enderecoService.alterarEndereco(enderecoModel);

    }
    @DeleteMapping(path = "/endereco/{id}")
    public  void deletarEndereco(@PathVariable long id){
        enderecoService.deleteId(id);
    }



}
