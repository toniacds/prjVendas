package com.prjVendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjVendas.entities.Pedido;
import com.prjVendas.servicies.PedidoService;

@RestController
@RequestMapping("/Pedido")
public class PedidoController {

	private final PedidoService pedidoService;

	@Autowired
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	@GetMapping("/{id}")
	public Pedido getPedido(@RequestBody Long id) {
		return  pedidoService.getPedidoByID(id);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Pedido>> findAllPedidocontrol() {
		List<Pedido> pedido = pedidoService.getAllPedido();
		return ResponseEntity.ok(pedido);
	}

	@PostMapping("/")
	public ResponseEntity<Pedido> insertPedidoControl(@RequestBody Pedido pedido) {
		Pedido novopedido = pedidoService.savePedido(pedido);
		return ResponseEntity.status(HttpStatus.CREATED).body(novopedido);
	}

	@DeleteMapping("/id")
	public void deletePedido(@PathVariable Long idpedido) {
		pedidoService.deletePedido(idpedido);
	}
	
}
