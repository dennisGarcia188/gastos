package com.gastos.gastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastos.gastos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	Cliente findById(Long id);


}
