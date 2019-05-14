package marca;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
	
	/*
	 * NESTE REPOSITÓRIO DEVERÃO SER IMPLEMENTADOS OS MÉTODOS PARA
	 * 
	 * Buscar uma marca a partir do seu nome
	 * 
	 * Buscar uma marca iniciando por uma determinada letra
	 * 
	 */

}
