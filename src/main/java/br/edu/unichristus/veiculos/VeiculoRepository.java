package br.edu.unichristus.veiculos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	public Veiculo findByPlacas(String placas);

	public List<Veiculo> findByMarcaNome(String nomeMarca);

	public List<Veiculo> findByMarcaNomeAndAnoGreaterThan(String nomeMarca, int ano);

}
