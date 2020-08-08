package br.mil.md.sc1.solicitacaobackend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mil.md.sc1.solicitacaobackend.dto.SolicitacaoDTO;
import br.mil.md.sc1.solicitacaobackend.service.SolicitacaoService;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoResource {
	
	@Autowired
	private SolicitacaoService service;

	@CrossOrigin("*")
	@GetMapping
	public ResponseEntity<List<SolicitacaoDTO>> getSolicitacoes() {
		return ResponseEntity.ok(service.getListaDeSolicitacoes());
	}
	
	@CrossOrigin("*")
	@PutMapping
	public ResponseEntity<String> addSolicitacao(@RequestBody SolicitacaoDTO solicitacaoDTO) {
		service.add(solicitacaoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Solicitação adicionada");
	}
}
