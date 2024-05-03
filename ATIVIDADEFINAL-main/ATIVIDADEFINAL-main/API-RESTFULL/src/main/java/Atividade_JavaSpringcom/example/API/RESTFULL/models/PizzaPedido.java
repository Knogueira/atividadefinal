package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="PizzaPedido")
public class PizzaPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPizzaPedido;

    @ManyToOne
    @JoinColumn(name = "idPedido") // chave estrangeira da tabela pedido
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idPizza") // chave estrangeira da tabela pizza
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "idTamanho") // chave estrangeira da tabela tamanho
    private Tamanho tamanho;

    @Column(columnDefinition = "TINYINT")
    private int quantidade;

    public PizzaPedido() {

    }

    public Long getIdPizzaPedido() {
        return idPizzaPedido;
    }

    public void setIdPizzaPedido(Long idPizzaPedido) {
        this.idPizzaPedido = idPizzaPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
