package com.GerenciadorDeContas.demo.contaApagar.ContaApagarController;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EnderecoModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarService.EnderecoService;
import org.hibernate.tuple.CreationTimestampGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.JpaEntityGraph;
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
    @DeleteMapping(path = "/gerenciador/{id}")
    public  void deletarEndereco(@PathVariable long id){
        enderecoService.deleteId(id);
    }



}
