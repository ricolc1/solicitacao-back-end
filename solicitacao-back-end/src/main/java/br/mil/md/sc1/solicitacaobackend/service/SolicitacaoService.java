package br.mil.md.sc1.solicitacaobackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.mil.md.sc1.solicitacaobackend.dto.SolicitacaoDTO;

@Service
public class SolicitacaoService {

	private List<SolicitacaoDTO> listaDeSolicitacoes = new ArrayList<SolicitacaoDTO>();
	
	public List<SolicitacaoDTO> getSolicitacoes() {
		return listaDeSolicitacoes;
	}

	public void add(SolicitacaoDTO solicitacaoDTO) {
		listaDeSolicitacoes.add(solicitacaoDTO);
	}

	public List<SolicitacaoDTO> getListaDeSolicitacoes() {
		return listaDeSolicitacoes;
	}

}
