package br.edu.unichristus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de execução da aplicação Spring Boot
 * 
 * @author Glaydson
 *
 */
@SpringBootApplication
public class SpringDataVeiculosApplication {

	// AS FUNCIONALIDADES DEVEM SER TESTADAS USANDO-SE O POSTMAN
    // ESTA CLASSE SERVE APENAS PARA SUBIR A APLICAÇÃO E NÃO DEVE SER MODIFICADA!!

	public static void main(String[] args) {
		SpringApplication.run(SpringDataVeiculosApplication.class, args);
	}
}
