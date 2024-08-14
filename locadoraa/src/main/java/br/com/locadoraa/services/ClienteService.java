package br.com.locadoraa.services;

import br.com.locadoraa.model.Cliente;
import br.com.locadoraa.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        if (clienteRepository.existsById(cliente.getCpf())) {
            throw new DataIntegrityViolationException("Já existe um cliente com o CPF: " + cliente.getCpf());
        }
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(String cpf) {
        return clienteRepository.findById(cpf);
    }

    public void deleteById(String cpf) {
        clienteRepository.deleteById(cpf);
    }
}
