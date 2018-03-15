package br.edu.unichristus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repoVeiculos;

	public void salvar(Veiculo v) {
		this.repoVeiculos.save(v);
		System.out.println("VEÍCULO PLACAS " + v.getPlacas() + " SALVO!");

	}

}
