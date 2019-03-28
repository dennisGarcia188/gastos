package com.gastos.gastos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gastos.gastos.entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, String>{
	
	Optional<Venda> findById(Long id);

}
