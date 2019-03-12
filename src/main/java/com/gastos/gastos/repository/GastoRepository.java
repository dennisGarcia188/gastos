package com.gastos.gastos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gastos.gastos.entity.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, String>{

	Optional<Gasto> findById(Long id);
	
	

}
