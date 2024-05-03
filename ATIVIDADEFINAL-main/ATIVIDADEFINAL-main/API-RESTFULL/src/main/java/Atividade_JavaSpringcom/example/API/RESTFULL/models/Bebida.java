package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="Bebida")
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBebida;

    @Column
    private String nome;
    @Column
    private float precoBase;

    public Bebida() {

    }

    public Long getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(Long idBebida) {
        this.idBebida = idBebida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }
}
