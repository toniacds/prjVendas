package com.prjVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjVendas.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
