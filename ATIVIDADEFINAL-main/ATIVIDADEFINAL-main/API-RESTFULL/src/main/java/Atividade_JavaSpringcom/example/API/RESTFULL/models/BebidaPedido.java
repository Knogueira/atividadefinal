package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="BebidaPedido")
public class BebidaPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPedido") // chave estrangeira da tabela pedido
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idBebida") // chave estrangeira da tabela bebida
    private Bebida bebida;

    @Column(columnDefinition = "TINYINT")
    private int quantidade;

    public BebidaPedido() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}