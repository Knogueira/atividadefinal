package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="Fornada")
public class Fornada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFornada;

    @Column(columnDefinition = "TINYINT")
    private int numFornada;
    @Column(columnDefinition = "TINYINT")
    private int quantPizza;

    public Fornada() {

    }

    public Long getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(Long idFornada) {
        this.idFornada = idFornada;
    }

    public int getNumFornada() {
        return numFornada;
    }

    public void setNumFornada(int numFornada) {
        this.numFornada = numFornada;
    }

    public int getQuantPizza() {
        return quantPizza;
    }

    public void setQuantPizza(int quantPizza) {
        this.quantPizza = quantPizza;
    }
}
