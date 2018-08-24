package br.com.effect4.aprendendo;

import br.com.effect4.aprendendo.domain.Categoria;
import br.com.effect4.aprendendo.domain.Produto;
import br.com.effect4.aprendendo.repositories.CategoriaRepository;
import br.com.effect4.aprendendo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AprendendoApplication implements CommandLineRunner {

	@Autowired
    private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(AprendendoApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Desenvolvimento");

        Produto p1 = new Produto(null, "Computador", 2000.00);
        Produto p2 = new Produto(null, "Impressora", 800.00);
        Produto p3 = new Produto(null, "Mouse", 80.00);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p1, p3));

        p1.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p2.getCategorias().addAll(Arrays.asList(cat1));
        p3.getCategorias().addAll(Arrays.asList(cat1, cat2));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        this.produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
}
