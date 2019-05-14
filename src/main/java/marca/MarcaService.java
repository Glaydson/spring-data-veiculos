package marca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {
	
	/*
	 * A CLASSE DE SERVIÇO DEVERÁ CONTEMPLAR OS MÉTODOS PARA
	 * 
	 * Salvar uma nova marca
	 * 
	 * Buscar todas as marcas
	 * 
	 * Buscar uma marca pelo nome
	 * 
	 * Buscar uma marca iniciando por uma determinada letra
	 *
	 */

	@Autowired
	private MarcaRepository repoMarcas;
	
}
