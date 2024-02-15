package com.prjVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjVendas.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
