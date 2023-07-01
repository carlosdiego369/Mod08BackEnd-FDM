package com.devsuperior.desafio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio01Application implements CommandLineRunner {

    public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
    }

	@Override
	public void run (String... args) throws Exception{
		System.out.println("Teste!");
	}

}
