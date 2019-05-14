package marca;

import java.util.List;

import br.edu.unichristus.veiculos.Veiculo;


public class Marca {

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
