package dev.aleoliv.microsservice.fornecedor.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.aleoliv.microsservice.fornecedor.models.InfoFornecedor;
import dev.aleoliv.microsservice.fornecedor.repositories.InfoRepository;

@Service
public class InfoService {
	
	private final InfoRepository infoRepository;

	public InfoService(InfoRepository infoRepository) {
		this.infoRepository = infoRepository;
	}

	public InfoFornecedor execute(String estado) {
		Optional<InfoFornecedor> optionalEntity = infoRepository.findByEstado(estado);
		if (!optionalEntity.isPresent()) throw new RuntimeException("Fornecedor não encontrado!");
		return optionalEntity.get();
	}
}
