package com.prjVendas.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Pedido")
public class Pedido {
	
	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public String getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(String datapedido) {
		this.datapedido = datapedido;
	}

	public int getValortotal() {
		return valortotal;
	}

	public void setValortotal(int valortotal) {
		this.valortotal = valortotal;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpedido;
	
	private String datapedido;
	
	private int valortotal;
	
	private int idcliente;
	
}
