package br.edu.unichristus.veiculos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unichristus.excecoes.VeiculoJaExistenteException;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repoVeiculos;

	public Veiculo salvar(Veiculo v) {
		Veiculo veiculoBD = this.repoVeiculos.findByPlacas(v.getPlacas());
		if (veiculoBD != null) throw new VeiculoJaExistenteException(v.getPlacas());
		Veiculo veiculoSalvo = this.repoVeiculos.save(v);
		return veiculoSalvo;
	}

	public List<Veiculo> buscarTodos() {
		return this.repoVeiculos.findAll();
	}

	public Veiculo buscarPeloID(Long id) {
		return this.repoVeiculos.findById(id).get();
	}
	
	public List<Veiculo> buscarPelaMarca(String nomeMarca) {
		return this.repoVeiculos.findByMarcaNome(nomeMarca);
	}
	
	public List<Veiculo> buscarPelaMarcaAno(String nomeMarca, int ano) {
		return this.repoVeiculos.findByMarcaNomeAndAnoGreaterThan(nomeMarca, ano);
	}

}
