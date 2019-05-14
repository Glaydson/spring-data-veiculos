package br.edu.unichristus.veiculos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;
import marca.Marca;

@Entity
@Table(name = "TB_VEICULOS")
@Data
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VEICULO_ID")
	private Long veiculoID;

	@Column(name = "ANO_VEICULO", nullable = false)
	private Integer ano;

	@Column(name = "PLACAS_VEICULO", nullable = false, length = 8, unique = true)
	private String placas;
	
	@ManyToOne
	@JoinColumn(name="MARCA_ID")
	@JsonIgnoreProperties("veiculos")
	private Marca marca;

	public Veiculo() {

	}

	public Veiculo(Integer ano, String placas) {
		this.ano = ano;
		this.placas = placas;
	}

	@Override
	public String toString() {
		// Remover a linha abaixo e descomentar a seguinte após configurar a classe Marca
		return "";
		//return "Veiculo [veiculoID=" + veiculoID + ", ano=" + ano + ", placas=" + placas + ", marca=" + marca.getNome() + "]";
	}


	
}
