package dev.aleoliv.microsservice.fornecedor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.aleoliv.microsservice.fornecedor.models.InfoFornecedor;
import dev.aleoliv.microsservice.fornecedor.services.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	private final InfoService infoService;

	public InfoController(InfoService infoService) {
		this.infoService = infoService;
	}

	@GetMapping("/{estado}")
	public InfoFornecedor handle(@PathVariable String estado) {
		return infoService.execute(estado);
	}
}
