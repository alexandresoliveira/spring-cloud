package dev.aleoliv.microsservice.loja.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.aleoliv.microsservice.loja.controllers.dtos.CompraDto;
import dev.aleoliv.microsservice.loja.services.RealizaCompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	private RealizaCompraService compraService;

	public CompraController(RealizaCompraService compraService) {
		this.compraService = compraService;
	}

	@PostMapping
	public void handle(@RequestBody CompraDto compraDto) {
		compraService.execute(compraDto);
	}
}
