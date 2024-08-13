package br.com.locadoraa.services;

import br.com.locadoraa.model.Funcionario;
import br.com.locadoraa.repositories.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findById(String cpf) {
        return funcionarioRepository.findById(cpf);
    }

    public void deleteById(String cpf) {
        funcionarioRepository.deleteById(cpf);
    }
}
