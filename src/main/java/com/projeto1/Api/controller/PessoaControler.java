package com.projeto1.Api.controller;

import com.projeto1.Api.models.Pessoa;
import com.projeto1.Api.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class PessoaControler {

    private PessoaService pessoaService;

    public PessoaControler(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public void  salvar(@RequestBody Pessoa pessoa){
        pessoaService.salvar(pessoa);
    }

    @GetMapping
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public Pessoa findById(@PathVariable Integer id) {
        return pessoaService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        pessoaService.deletar(id);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Integer id, @RequestBody Pessoa pessoa){

        String atualizada = pessoaService.atualizar(pessoa, id);
        return atualizada;
    }
}
