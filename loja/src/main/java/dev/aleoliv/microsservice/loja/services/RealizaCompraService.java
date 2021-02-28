package dev.aleoliv.microsservice.loja.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.aleoliv.microsservice.loja.controllers.dtos.CompraDto;
import dev.aleoliv.microsservice.loja.controllers.dtos.InfoFornecedorDto;

@Service
public class RealizaCompraService {
	
	private final RestTemplate restTemplate;

	public RealizaCompraService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void execute(CompraDto compra) {
		ResponseEntity<InfoFornecedorDto> responseEntity = restTemplate.exchange(
				"http://FORNECEDOR/info/" + compra.getEndereco().getEstado(), 
				HttpMethod.GET, 
				null, 
				InfoFornecedorDto.class);
		System.out.println(responseEntity.getBody().getEndereco());
	}
}
