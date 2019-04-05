package com.gastos.gastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gastos.gastos.entity.Genero;

public interface GeneroRepository extends JpaRepository<Genero, String> {

	Genero findById(Long id);

	@Query(value = "select * from genero where name LIKE %:genero% AND dia_semana LIKE %:diaSemana%", nativeQuery = true)
	Genero pegaPercentual(String diaSemana, String genero);

}
