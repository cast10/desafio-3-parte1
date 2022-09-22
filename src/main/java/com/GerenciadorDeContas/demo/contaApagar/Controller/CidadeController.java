package com.GerenciadorDeContas.demo.contaApagar.Controller;

import com.GerenciadorDeContas.demo.contaApagar.Model.CidadeModel;
import com.GerenciadorDeContas.demo.contaApagar.Service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
public class CidadeController {
    @Autowired
    private CidadeService cidadeService;

    @GetMapping(path = "/cidade")
    public ResponseEntity<List<CidadeModel>> buscarCidade(){
    List<CidadeModel> listaCidade = cidadeService.buscaCidadeTodos();
        return ResponseEntity.ok(listaCidade);
    }

    @GetMapping(path = "/cidade/{id}")
    public ResponseEntity<Optional<CidadeModel>>buscarCidadeID(@PathVariable long id){
        return ResponseEntity.ok(cidadeService.buscarCidadeId());
    }


    @PostMapping(path = "/cidade")
    public ResponseEntity<CidadeModel> cadastrarCidade(@Valid @RequestBody CidadeModel cadastreCidade){
        CidadeModel cidadeNova = cidadeService.registrarCidade(cadastreCidade);
        return new ResponseEntity<>(cidadeNova, HttpStatus.CREATED);
    }


    @PutMapping(path = "/cidade/{id}")
    public ResponseEntity<CidadeModel>alteraCidade (@RequestBody CidadeModel altereUmaCidade, @PathVariable Long id){
        altereUmaCidade.setCidadeId(id);
        return ResponseEntity.ok (cidadeService.alterarCidade(altereUmaCidade));
    }

    @DeleteMapping(path = "/cidade/{id}")
    public ResponseEntity<Void> deletarCidade(@PathVariable long id ){
        cidadeService.deleteId(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
