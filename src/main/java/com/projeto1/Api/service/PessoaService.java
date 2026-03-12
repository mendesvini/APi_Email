package com.projeto1.Api.service;

import com.projeto1.Api.models.Pessoa;
import com.projeto1.Api.repository.PessoaRepository;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private PessoaRepository pessoaRepository;
    Pessoa pessoa =  new Pessoa();

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Autowired
    private EmailService emailService;

    public void salvar(Pessoa pessoa){
        pessoaRepository.save(pessoa);

        emailService.sendEmail(pessoa.getEmail(),"Novo usuario cadastrado com sucesso!","Ola " + pessoa.getNome() + " Seja bem vinda(o) a minha APi");
    }

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    public Pessoa findById(Integer id){
        return pessoaRepository.findById(id).get();
    }

    public void deletar(Integer id){
        pessoaRepository.deleteById(id);
    }

    public String atualizar(Pessoa pessoa, Integer id){
        Pessoa pessoaAtualizado = pessoaRepository.findById(id).get();

        pessoaAtualizado.setNome(pessoa.getNome());
        pessoaAtualizado.setEmail(pessoa.getEmail());
        pessoaAtualizado.setIdade(pessoa.getIdade());
        pessoaRepository.save(pessoaAtualizado);

        return "Pessoa atualizado com sucesso!";
    }
}
