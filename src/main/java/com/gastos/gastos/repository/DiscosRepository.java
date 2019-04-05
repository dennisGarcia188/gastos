package com.gastos.gastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gastos.gastos.entity.Disco;

@Repository
public interface DiscosRepository extends JpaRepository<Disco, String> {

	Disco findById(Long idDisco);

	@Query(value = "select * from disco where id_disco = :idDisco", nativeQuery = true)
	Disco findByIdManual(Long idDisco);

}
