package br.com.locadoraa.repositories;

import br.com.locadoraa.model.Midia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MidiaRepository extends JpaRepository<Midia, Integer> {
}
