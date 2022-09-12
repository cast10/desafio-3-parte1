package com.GerenciadorDeContas.demo.contaApagar.ContaApagarController;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.CidadeModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarService.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class CidadeController {
    @Autowired
    private CidadeService cidadeService;

    @GetMapping(path = "/cidade")
    public List<CidadeModel> buscarCidade(){
        return cidadeService.buscaCidadeTodos();
    }

    @GetMapping(path = "/cidade/{id}")
    public Optional<CidadeModel> buscarCidadeID(@PathVariable long id){
        return cidadeService.buscarCidadeId(id);
    }

    @PostMapping(path = "/cidade")
    public CidadeModel cadastrarCidade(@RequestBody CidadeModel cidadeModel){
        return cidadeService.registrarCidade(cidadeModel);
    }

    @PutMapping(path = "/cidade/{id}")
    public CidadeModel alterzaCidade (@RequestBody CidadeModel cidadeModel,@PathVariable Long id){
        return cidadeService.alterarCidade(cidadeModel);

    }
    @DeleteMapping(path = "/cidade/{id}")
    public  void deletarCidade(@PathVariable long id){
        cidadeService.deleteId(id);
    }
}
