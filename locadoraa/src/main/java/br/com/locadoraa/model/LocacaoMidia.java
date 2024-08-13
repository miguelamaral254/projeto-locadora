package br.com.locadoraa.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LocacaoMidia")
public class LocacaoMidia {

    @EmbeddedId
    private LocacaoMidiaId id;

    public LocacaoMidia() {}

    public LocacaoMidia(LocacaoMidiaId id) {
        this.id = id;
    }

    // Getters and setters
    public LocacaoMidiaId getId() {
        return id;
    }

    public void setId(LocacaoMidiaId id) {
        this.id = id;
    }
}
