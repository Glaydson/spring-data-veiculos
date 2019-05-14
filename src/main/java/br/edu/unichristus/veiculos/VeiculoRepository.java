package br.edu.unichristus.veiculos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
	public Optional<Veiculo> findByPlacas(String placas);
	
	/** ESTA CLASSE DEVERA CONTER MAIS DOIS METODOS:
	 * 
	 *  1 - METODO PARA OBTER OS VEICULOS DE UMA DETERMINADA MARCA
	 *  
	 *  2 - METODO PARA OBTER OS VEICULOS DE UMA DETERMINADA MARCA E CUJO ANO
	 *      SEJA MAIOR OU IGUAL A UM ANO DADO.
	 * 
	 */
	
	

}
