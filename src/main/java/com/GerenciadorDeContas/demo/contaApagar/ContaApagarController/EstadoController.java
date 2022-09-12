package com.GerenciadorDeContas.demo.contaApagar.ContaApagarController;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EnderecoModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.EstadoModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarService.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(path = "/estado")
    public List<EstadoModel> buscarEstado(){
        return estadoService.buscaEstadoTodos();
    }

    @GetMapping(path = "/estado/{id}")
    public Optional<EstadoModel> buscarEstadoID(@PathVariable long id){
        return estadoService.buscarPorIdEstado(id);
    }

    @PostMapping(path = "/estado")
    public EstadoModel cadastrarEstado(@RequestBody EstadoModel estadoModel){
        return estadoService.registrarEstado(estadoModel);
    }

    @PutMapping(path = "/estado/{id}")
    public EstadoModel altereEstado (@RequestBody EstadoModel estadoModel,@PathVariable Long id){
        return estadoService.alterarEstado(estadoModel);

    }
    @DeleteMapping(path = "/estado/{id}")
    public  void deletarEndereco(@PathVariable long id){
        estadoService.deleteId(id);
    }



}
