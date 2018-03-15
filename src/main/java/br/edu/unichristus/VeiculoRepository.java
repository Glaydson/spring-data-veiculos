package br.edu.unichristus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
	/** ESTA CLASSE DEVER� CONTER DOIS M�TODOS:
	 * 
	 *  1 - METODO PARA OBTER OS VEICULOS DE UMA DETERMINADA MARCA
	 *  
	 *  2 - METODO PARA OBTER OS VEICULOS DE UMA DETERMINADA MARCA E CUJO ANO
	 *      SEJA MAIOR OU IGUAL A UM ANO DADO.
	 * 
	 */
	
	

}
