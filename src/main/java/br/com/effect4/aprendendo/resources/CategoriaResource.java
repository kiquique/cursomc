package br.com.effect4.aprendendo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
        return "REST está Funcionando!";
    }
}
