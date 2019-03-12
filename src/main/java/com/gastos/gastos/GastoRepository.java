package com.gastos.gastos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, String>{

	Optional<Gasto> findById(Long id);
	
	

}
