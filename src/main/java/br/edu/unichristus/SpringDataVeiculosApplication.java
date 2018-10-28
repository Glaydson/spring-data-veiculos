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

	/**
	 * ATIVIDADE PRÁTICA - SPRING DATA E SPRING MVC
	 * 
	 * NESTA ATIVIDADE CONSTRUÍREMOS UMA APLICAÇÃO SIMPLES ENVOLVENDO VEÍCULOS E
	 * SUAS MARCAS. SÃO DADAS: - CLASSE Veiculo - ENTIDADE QUE REPRESENTA UM VEÍCULO
	 * - INTERFACE VeiculoRepository - REPOSITÓRIO PARA VEÍCULOS - CLASSE VeiculoService - 
	 * CLASSE DE SERVIÇO PARA VEÍCULOS - CLASSE VeiculosController - CONTROLADOR 
	 * PARA VEÍCULOS - CLASSE Aplicacao
	 * (ESTA CLASSE) - CLASSE PARA RODAR A APLICAÇÃO - SCRIPT data.sql - SCRIPT PARA
	 * CARREGAR DADOS NAS TABELAS DE VEÍCULOS E MARCAS
	 * 
	 * PREPARAÇÃO: - CRIAR UM BANCO DE DADOS (SCHEMA) CHAMADO "veiculosdb" USANDO O
	 * MYSQL WORKBENCH
	 * 
	 * - CRIAR A CLASSE Marca PARA REPRESENTAR A MARCA DE UM VEÍCULO - CONFIGURAR
	 * COMO ENTIDADE PERSISTENTE - CONFIGURAR O NOME DA TABELA PARA TB_MARCAS
	 * 
	 * - CONFIGURAR OS ATRIBUTOS DA CLASSE Marca: - marcaID - Long, chave primária -
	 * campo MARCA_ID - nome - String, tamanho 20, obrigatório, não aceita valores
	 * repetidos - campo NOME_MARCA - veiculos - Lista de objetos da classe Veiculo
	 * - construtor padrão (vazio) - construtor recebendo o parâmetro nome - métodos
	 * get e set para todos os atributos - método toString (Utilize o LOMBOK)
	 * 
	 * - CRIAR O RELACIONAMENTO ENTRE MARCA E VEICULO - Uma marca possui vários
	 * veículos. A classe Veiculo é a "dona" da relação - Usar o atributo fetch com
	 * o valor FetchType.EAGER, para permitir que se possa acessar os veículos de
	 * uma marca.
	 * 
	 * - CRIAR A INTERFACE MarcaRepository e a classe de serviço MarcaService
	 * 
	 * - CRIAR A CLASSE MarcasController (RestController) com o mapeamento "/marcas"
	 * 
	 * - RODAR A CLASSE DE EXECUÇÃO E VERIFICAR A CRIAÇÃO DAS TABELAS
	 * 
	 * - IMPLEMENTE, NAS CLASSES DE REPOSITÓRIO, SERVIÇO E CONTROLLER, OS MÉTODOS NECESSÁRIOS
	 * PARA EXECUTAR OS EXERCÍCIOS SOLICITADOS NO MÉTODO MAIN
	 * 
	 * - AO FINAL, COMPACTAR A PASTA DO PROJETO E ENVIAR ATRAVÉS DA TAREFA ABERTA NO
	 * EAD
	 * 
	 */

	@Override
	public void run(String... args) throws ParseException {
		
		// AS FUNCIONALIDADES ABAIXO DEVEM SER TESTADAS USANDO-SE O POSTMAN

		/** 1 - INSERIR UM NOVO VEÍCULO PARA A MARCA CITROEN */

		/** 2 - LISTAR OS VEÍCULOS DA MARCA CHEVROLET */

		/** 3 - LISTAR OS VEÍCULOS DA MARCA FIAT POSTERIORES A 2009 */
		
		/** 4 - LISTAR TODAS AS MARCAS QUE INICIAM COM A LETRA F */

		/** 5 - LISTAR TODAS AS MARCAS COM OS SEUS VEÍCULOS */

		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataVeiculosApplication.class, args);
	}
}
