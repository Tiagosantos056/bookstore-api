package com.tiagosantos056.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagosantos056.bookstore.domain.Categoria;
import com.tiagosantos056.bookstore.domain.Livro;
import com.tiagosantos056.bookstore.repositories.CategoriaRepository;
import com.tiagosantos056.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;

	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Empreendedorismo", "Livros sobre Negócios e Empresas");
		Categoria cat3 = new Categoria(null, "Marketing", "Livros de Marketing e Propaganda");
		Categoria cat4 = new Categoria(null, "Auto ajuda", "Livros de Auto ajuda");
		Categoria cat5 = new Categoria(null, "Desenvolvimento pessoal", "Livros de Desenvolvimento Pessoal");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "O renomado especialista em software, Robert C. Martin, apresenta um paradigma revolucionário com Código limpo: Habilidades Práticas do Agile Software.", cat1);
		Livro l2 = new Livro(null, "Do mil ao Milhão sem cortar o cafézinho", "Thiago Nigro", "Livro sobre investimentos e Negócios.", cat2);
		Livro l3 = new Livro(null, "PLD", "Pablo Marçal", "Programa Liberdade Digital.", cat3);
		Livro l4 = new Livro(null, "Sonho Grande", "Jorge Paulo Lemman", "O sonho de construir a maior cervejaria do mundo", cat4);
		Livro l5 = new Livro(null, "Mais esperto que o diabo", "Napoleon Hill", "O segredo revelado do sucesso", cat5);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
	
}
