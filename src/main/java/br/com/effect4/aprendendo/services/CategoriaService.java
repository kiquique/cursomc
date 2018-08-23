package br.com.effect4.aprendendo.services;

import br.com.effect4.aprendendo.domain.Categoria;
import br.com.effect4.aprendendo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
