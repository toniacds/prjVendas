package com.prjVendas.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjVendas.entities.Pedido;
import com.prjVendas.repositories.PedidoRepository;

@Service
public class PedidoService {
	private final PedidoRepository pedidoRepository;

	@Autowired
	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public Pedido getPedidoByID(Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}

	public List<Pedido> getAllPedido() {
		return pedidoRepository.findAll();
	}

	public void deletePedido(Long id) {
		pedidoRepository.deleteById(id);
	}
}
