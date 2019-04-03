package com.gastos.gastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastos.gastos.entity.Genero;

public interface CashBackRepository extends JpaRepository<Genero, String>{

	Genero findById(Long id);

}
