package com.prjVendas.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
	
	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getClientenome() {
		return clientenome;
	}

	public void setClientenome(String clientenome) {
		this.clientenome = clientenome;
	}

	public String getClienteemail() {
		return clienteemail;
	}

	public void setClienteemail(String clienteemail) {
		this.clienteemail = clienteemail;
	}

	public int getClientefone() {
		return clientefone;
	}

	public void setClientefone(int clientefone) {
		this.clientefone = clientefone;
	}

	public String getClientenascimento() {
		return clientenascimento;
	}

	public void setClientenascimento(String clientenascimento) {
		this.clientenascimento = clientenascimento;
	}

	private String clientenome;
	
	private String clienteemail;
	
	private int clientefone;
	
	private String clientenascimento;

}
