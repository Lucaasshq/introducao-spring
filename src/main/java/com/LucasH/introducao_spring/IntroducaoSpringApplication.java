package com.LucasH.introducao_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntroducaoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoSpringApplication.class, args);

	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\":\"Praca de sé\",\"localidade\":\"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do cep: " + response);

		};
	}

}
