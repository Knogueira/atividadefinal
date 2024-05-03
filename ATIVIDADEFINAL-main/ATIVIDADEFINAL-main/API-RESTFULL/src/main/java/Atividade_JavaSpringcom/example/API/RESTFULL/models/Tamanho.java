package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="Tamanho")
public class Tamanho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTamanho;

    @Column
    private String nome;
    @Column
    private float desconto;

    public Tamanho() {

    }

    public Long getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(Long idTamanho) {
        this.idTamanho = idTamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
