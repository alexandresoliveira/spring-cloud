package dev.aleoliv.microsservice.fornecedor.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import dev.aleoliv.microsservice.fornecedor.models.InfoFornecedor;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

	Optional<InfoFornecedor> findByEstado(String estado);
}
