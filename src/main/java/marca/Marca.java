package marca;

import java.util.List;

import br.edu.unichristus.veiculos.Veiculo;


public class Marca {
	
	/*
	 * ESTA CLASSE DEVERA SER CONFIGURADA COMO UMA ENTIDADE PERSISTENTE, TABELA TB_MARCAS
	 * CONFIGURAR A CHAVE PRIMÁRIA E CAMPOS CONFORME ORIENTAÇÃO DO EXERCÍCIO
	 */

	private Long marcaID;
	
	private String nome;
	
	private List<Veiculo> veiculos;
	
	public Marca() { }
	
	public Marca(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Marca [marcaID=" + marcaID + ", nome=" + nome + ", veiculos=" + veiculos + "]";
	}
	
	
	
}
