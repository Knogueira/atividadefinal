package Atividade_JavaSpringcom.example.API.RESTFULL.models;

import jakarta.persistence.*;

@Entity
@Table(name="PizzaPedido_tem_Ingrediente")
public class PizzaPedidoIngrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPizzaPedido") // chave estrangeira da tabela pizzaPedido
    private PizzaPedido pizzaPedido;

    @ManyToOne
    @JoinColumn(name = "idIngrediente") // chave estrangeira da tabela ingrediente
    private Ingredientes ingredientes;

    public PizzaPedidoIngrediente (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PizzaPedido getPizzaPedido() {
        return pizzaPedido;
    }

    public void setPizzaPedido(PizzaPedido pizzaPedido) {
        this.pizzaPedido = pizzaPedido;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }
}