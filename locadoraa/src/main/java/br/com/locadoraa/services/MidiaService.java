package br.com.locadoraa.services;

import br.com.locadoraa.model.Midia;
import br.com.locadoraa.repositories.MidiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MidiaService {

    @Autowired
    private MidiaRepository midiaRepository;

    public Midia save(Midia midia) {
        return midiaRepository.save(midia);
    }

    public List<Midia> findAll() {
        return midiaRepository.findAll();
    }

    public Optional<Midia> findById(int id) {
        return midiaRepository.findById(id);
    }

    public void deleteById(int id) {
        midiaRepository.deleteById(id);
    }
}
