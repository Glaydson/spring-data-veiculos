package br.edu.unichristus;

import java.text.ParseException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de execução da aplicação Spring Boot
 * 
 * @author Glaydson
 *
 */
@SpringBootApplication
public class SpringDataVeiculosApplication implements CommandLineRunner {

	

	@Override
	public void run(String... args) throws ParseException {
		
		// AS FUNCIONALIDADES ABAIXO DEVEM SER TESTADAS USANDO-SE O POSTMAN

		/** 1 - INSERIR UM NOVO VEÍCULO PARA A MARCA CITROEN */

		/** 2 - LISTAR OS VEÍCULOS DA MARCA CHEVROLET */

		/** 3 - LISTAR OS VEÍCULOS DA MARCA FIAT POSTERIORES A 2009 */
		
		/** 4 - LISTAR TODAS AS MARCAS QUE INICIAM COM A LETRA F */
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataVeiculosApplication.class, args);
	}
}
