package br.com.locadoraa.repositories;

import br.com.locadoraa.model.LocacaoMidia;
import br.com.locadoraa.model.LocacaoMidiaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoMidiaRepository extends JpaRepository<LocacaoMidia, LocacaoMidiaId> {
}
