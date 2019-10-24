package br.edu.unichristus.marca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {
	
	/*
	 * A CLASSE DE SERVIÇO DEVERÁ CONTEMPLAR OS MÉTODOS PARA
	 * 
	 * Salvar uma nova marca - salvar
	 * 
	 * Buscar todas as marcas - buscarTodas
	 * 
	 * Buscar uma marca pelo nome - buscarPeloNome
	 * 
	 * Buscar as marcas iniciando por uma determinada letra - buscarIniciandoPor
	 *
	 */

	@Autowired
	private MarcaRepository repoMarcas;
	
}
