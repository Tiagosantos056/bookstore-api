package com.tiagosantos056.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tiagosantos056.bookstore.domain.Categoria;
import com.tiagosantos056.bookstore.domain.Livro;
import com.tiagosantos056.bookstore.repositories.CategoriaRepository;
import com.tiagosantos056.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication {
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

}
