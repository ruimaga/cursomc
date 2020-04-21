package com.ruimagalhaes.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ruimagalhaes.cursomc.domain.Categoria;
import com.ruimagalhaes.cursomc.repositories.CategoriaRepository;

/**
 * Se está usando Spring Boot e precisa executar 
 * algum código antes de iniciar um aplicativo, 
 * então pode utilizar ApplicationRunner ou CommandLineRunner
 * 
 * @author Rui
 *
 */
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
