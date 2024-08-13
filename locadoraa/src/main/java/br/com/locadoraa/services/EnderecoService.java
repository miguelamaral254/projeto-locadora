package br.com.locadoraa.services;


import br.com.locadoraa.model.Endereco;
import br.com.locadoraa.repositories.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> findById(int id) {
        return enderecoRepository.findById(id);
    }

    public void deleteById(int id) {
        enderecoRepository.deleteById(id);
    }
}
