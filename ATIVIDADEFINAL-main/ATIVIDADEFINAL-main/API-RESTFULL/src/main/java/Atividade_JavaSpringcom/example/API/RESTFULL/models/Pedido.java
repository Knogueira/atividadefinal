package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Pedido")
public class Pedido{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @ManyToOne
    @JoinColumn(name = "idCliente") // chave estrangeira da tabela cliente
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idFornada") // chave estrangeira da tabela fornada
    private Fornada fornada;

    @Column
    private LocalDateTime dataHora;

    public Pedido() {

    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornada getFornada() {
        return fornada;
    }

    public void setFornada(Fornada fornada) {
        this.fornada = fornada;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}