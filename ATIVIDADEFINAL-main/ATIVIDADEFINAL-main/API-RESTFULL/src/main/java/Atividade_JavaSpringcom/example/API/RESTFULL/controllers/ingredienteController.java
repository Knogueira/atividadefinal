package Atividade_JavaSpringcom.example.API.RESTFULL.controllers;

import Atividade_JavaSpringcom.example.API.RESTFULL.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class ingredienteController {

    @Autowired
    private ingredienteRepository ingredienteRepository;

    //incluir dados
    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public Ingrediente save(){
        Ingrediente u = new Ingrediente();
        u.setNome("Farinha");
        u = this.ingredienteRepository.save(u);
        return u;
    }

    @RequestMapping(value = "/mostrar{id}", method = RequestMethod.GET)
    public List<Ingrediente> findAll(){
        List<Ingrediente> ingrediente = this.ingredienteRepository.findAll();
        return ingrediente;
    }
    //mostrar dados
    @RequestMapping(value = "/mostrar", method = RequestMethod.GET)
    public Ingrediente findById(@PathVariable long id){
        Optional<Ingrediente> resultado = this.ingredienteRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Ingrediente não encontrado");
        }else{
            return resultado.get();
        }
    }
    //deletando dados
    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public Ingrediente deleteById(@PathVariable long id){
        Ingrediente ingrediente = findById(id);
        this.ingredienteRepository.deleteById(id);
        return ingrediente;
    }
    //alterando dados
    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Ingrediente updateById(@PathVariable long id, @RequestBody Ingrediente ingrediente){
        this.findById(id);
        ingrediente.setId(id);
        ingrediente = this.ingredienteRepository.save(ingrediente);
        return ingrediente;
    }

}

