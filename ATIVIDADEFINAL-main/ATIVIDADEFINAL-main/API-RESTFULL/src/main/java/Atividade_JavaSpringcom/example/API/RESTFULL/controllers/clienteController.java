package Atividade_JavaSpringcom.example.API.RESTFULL.controllers;

import Atividade_JavaSpringcom.example.API.RESTFULL.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class clienteController {

    @Autowired
    private clienteRepository clienteRepository;

    //incluir dados
    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public Cliente save(){
        Cliente u = new Cliente();
        u.setNome("Giselle");
        u = this.clienteRepository.save(u);
        return u;
    }

    @RequestMapping(value = "/mostrar{id}", method = RequestMethod.GET)
    public List<Cliente> findAll(){
        List<Cliente> cliente = this.clienteRepository.findAll();
        return cliente;
    }
    //mostrar dados
    @RequestMapping(value = "/mostrar", method = RequestMethod.GET)
    public Cliente findById(@PathVariable long id){
        Optional<Cliente> resultado = this.clienteRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Cliente não encontrado");
        }else{
            return resultado.get();
        }
    }
    //deletando dados
    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public Cliente deleteById(@PathVariable long id){
        Cliente cliente = findById(id);
        this.clienteRepository.deleteById(id);
        return cliente;
    }
    //alterando dados
    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Cliente updateById(@PathVariable long id, @RequestBody Cliente cliente){
        this.findById(id);
        cliente.setId(id);
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }
    
}
