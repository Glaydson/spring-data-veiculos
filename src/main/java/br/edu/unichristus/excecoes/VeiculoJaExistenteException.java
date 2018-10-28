package br.edu.unichristus.excecoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class VeiculoJaExistenteException extends RuntimeException {

	public VeiculoJaExistenteException(String placas) {
		super("Veículo com a placa " + placas + " já existe!");
	}

	
}
