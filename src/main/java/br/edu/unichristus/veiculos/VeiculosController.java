package br.edu.unichristus.veiculos;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

	@Autowired
	private VeiculoService servicoVeiculos;

	@GetMapping("/todos")
	public List<Veiculo> buscarTodos() {
		return servicoVeiculos.buscarTodos();
	}

	@GetMapping("/{id}")
	public Veiculo buscarPeloID(@PathVariable Long id) {
		return servicoVeiculos.buscarPeloID(id);
	}

	@GetMapping("/buscar/marca/{nomeMarca}")
	public List<Veiculo> buscarPelaMarca(@PathVariable String nomeMarca) {
		return servicoVeiculos.buscarPelaMarca(nomeMarca);
	}

	@GetMapping("/buscar/marcaAno")
	public List<Veiculo> buscarPelaMarcaAno(@RequestParam String nomeMarca, @RequestParam int ano) {
		return servicoVeiculos.buscarPelaMarcaAno(nomeMarca, ano);
	}

	@PostMapping("/novo")
	public ResponseEntity<Object> salvar(@Valid @RequestBody Veiculo veiculo) {
		Veiculo veiculoSalvo = servicoVeiculos.salvar(veiculo);
		URI local = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(veiculoSalvo.getVeiculoID()).toUri();
		return ResponseEntity.created(local).build();
	}

}
