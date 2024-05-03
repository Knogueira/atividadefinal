package Atividade_JavaSpringcom.example.API.RESTFULL.controllers;

import Atividade_JavaSpringcom.example.API.RESTFULL.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class bebidaController {

    @Autowired
    private bibidaRepository bebidaRepository;

    //incluir dados
    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public Bebida save(){
        Bebida u = new Bebida();
        u.setNome("Coca");
        u = this.bebidaRepository.save(u);
        return u;
    }

    @RequestMapping(value = "/mostrar{id}", method = RequestMethod.GET)
    public List<Bebida> findAll(){
        List<Bebida> bebida = this.bebidaRepository.findAll();
        return bebida;
    }
    //mostrar dados
    @RequestMapping(value = "/mostrar", method = RequestMethod.GET)
    public Bebida findById(@PathVariable long id){
        Optional<Bebida> resultado = this.bebidaRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Bebida não encontrado");
        }else{
            return resultado.get();
        }
    }
    //deletando dados
    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public Bebida deleteById(@PathVariable long id){
        Bebida bebida = findById(id);
        this.bebidaRepository.deleteById(id);
        return bebida;
    }
    //alterando dados
    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Bebida updateById(@PathVariable long id, @RequestBody Bebida bebida){
        this.findById(id);
        bebida.setId(id);
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

}

