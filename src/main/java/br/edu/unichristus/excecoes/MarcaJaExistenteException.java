package br.edu.unichristus.excecoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class MarcaJaExistenteException extends RuntimeException {

	public MarcaJaExistenteException(String nome) {
		super("A marca " + nome + " já existe!");
	}

}
