package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="Pizza")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPizza;

    @Column
    private String nome;
    @Column
    private float precoBase;
    @Column
    private boolean personalizada;

    public Pizza() {

    }

    public Long getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Long idPizza) {
        this.idPizza = idPizza;
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

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }
}