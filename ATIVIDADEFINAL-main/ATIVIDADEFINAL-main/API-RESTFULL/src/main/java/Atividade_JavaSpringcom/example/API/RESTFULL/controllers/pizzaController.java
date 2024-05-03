package Atividade_JavaSpringcom.example.API.RESTFULL.controllers;

import Atividade_JavaSpringcom.example.API.RESTFULL.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class pizzaController {

    @Autowired
    private pizzaRepository pizzaRepository;

    //incluir dados
    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public Pizza save(){
        Pizza u = new Pizza();
        u.setNome("Pizza de Mussarela");
        u = this.pizzaRepository.save(u);
        return u;
    }

    @RequestMapping(value = "/mostrar{id}", method = RequestMethod.GET)
    public List<Pizza> findAll(){
        List<Pizza> pizza = this.pizzaRepository.findAll();
        return pizza;
    }
    //mostrar dados
    @RequestMapping(value = "/mostrar", method = RequestMethod.GET)
    public Pizza findById(@PathVariable long id){
        Optional<Pizza> resultado = this.pizzaRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Pizza não encontrado");
        }else{
            return resultado.get();
        }
    }
    //deletando dados
    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public Pizza deleteById(@PathVariable long id){
        Pizza pizza = findById(id);
        this.pizzaRepository.deleteById(id);
        return pizza;
    }
    //alterando dados
    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Pizza updateById(@PathVariable long id, @RequestBody Pizza pizza){
        this.findById(id);
        pizza.setId(id);
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }

}

