package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="Ingredientes")
public class Ingredientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngrediente;

    @Column
    private String nome;
    @Column
    private float precoIgrediente;

    public Ingredientes() {

    }

    public Long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoIgrediente() {
        return precoIgrediente;
    }

    public void setPrecoIgrediente(float precoIgrediente) {
        this.precoIgrediente = precoIgrediente;
    }
}

