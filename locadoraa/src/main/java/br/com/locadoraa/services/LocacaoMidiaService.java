package br.com.locadoraa.services;

import br.com.locadoraa.model.LocacaoMidia;
import br.com.locadoraa.model.LocacaoMidiaId;
import br.com.locadoraa.repositories.LocacaoMidiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocacaoMidiaService {

    @Autowired
    private LocacaoMidiaRepository locacaoMidiaRepository;

    public LocacaoMidia save(LocacaoMidia locacaoMidia) {
        return locacaoMidiaRepository.save(locacaoMidia);
    }

    public List<LocacaoMidia> findAll() {
        return locacaoMidiaRepository.findAll();
    }

    public Optional<LocacaoMidia> findById(LocacaoMidiaId id) {
        return locacaoMidiaRepository.findById(id);
    }

    public void deleteById(LocacaoMidiaId id) {
        locacaoMidiaRepository.deleteById(id);
    }
}
