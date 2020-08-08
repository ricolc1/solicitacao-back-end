package br.mil.md.sc1.solicitacaobackend.dto;

import br.mil.md.sc1.solicitacaobackend.enumerated.Banda;
import br.mil.md.sc1.solicitacaobackend.enumerated.VozEDados;

public class SolicitacaoDTO {
	
	private String terminal;
	private Banda banda;
	private String finalidade;
	private String areaGeolocalizacao;
	private String regimeOperacao;
	private String inicio;
	private String fim;
	private int bandaKbps;
	private VozEDados vozEDados;
	private String redeDaFs;
	private String contato;
	private String observacoes;
	
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public Banda getBanda() {
		return banda;
	}
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	public String getAreaGeolocalizacao() {
		return areaGeolocalizacao;
	}
	public void setAreaGeolocalizacao(String areaGeolocalizacao) {
		this.areaGeolocalizacao = areaGeolocalizacao;
	}
	public String getRegimeOperacao() {
		return regimeOperacao;
	}
	public void setRegimeOperacao(String regimeOperacao) {
		this.regimeOperacao = regimeOperacao;
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
	public int getBandaKbps() {
		return bandaKbps;
	}
	public void setBandaKbps(int bandaKbps) {
		this.bandaKbps = bandaKbps;
	}
	public VozEDados getVozEDados() {
		return vozEDados;
	}
	public void setVozEDados(VozEDados vozEDados) {
		this.vozEDados = vozEDados;
	}
	public String getRedeDaFs() {
		return redeDaFs;
	}
	public void setRedeDaFs(String redeDaFs) {
		this.redeDaFs = redeDaFs;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
