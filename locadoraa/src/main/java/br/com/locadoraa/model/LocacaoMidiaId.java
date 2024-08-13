package br.com.locadoraa.model;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LocacaoMidiaId implements Serializable {

    @Column(name = "locacao_id")
    private Integer locacaoId;

    @Column(name = "midia_id")
    private Integer midiaId;

    public LocacaoMidiaId() {}

    public LocacaoMidiaId(Integer locacaoId, Integer midiaId) {
        this.locacaoId = locacaoId;
        this.midiaId = midiaId;
    }

    // Getters and setters
    public Integer getLocacaoId() {
        return locacaoId;
    }

    public void setLocacaoId(Integer locacaoId) {
        this.locacaoId = locacaoId;
    }

    public Integer getMidiaId() {
        return midiaId;
    }

    public void setMidiaId(Integer midiaId) {
        this.midiaId = midiaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocacaoMidiaId that = (LocacaoMidiaId) o;
        return Objects.equals(locacaoId, that.locacaoId) &&
                Objects.equals(midiaId, that.midiaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locacaoId, midiaId);
    }
}
