package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

public class CifCoreografiaIdDto {

	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSequencialCifServico;
	private short nuFaixa;
	private int nuCoreografia;
	private int nuPacote;
	private Date inicioVigencia;

	public byte getNuAcao() {
		return nuAcao;
	}

	public void setNuAcao(byte nuAcao) {
		this.nuAcao = nuAcao;
	}

	public byte getNuModo() {
		return nuModo;
	}

	public void setNuModo(byte nuModo) {
		this.nuModo = nuModo;
	}

	public byte getNuGrupo() {
		return nuGrupo;
	}

	public void setNuGrupo(byte nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	public int getNuSequencialCifServico() {
		return nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	public short getNuFaixa() {
		return nuFaixa;
	}

	public void setNuFaixa(short nuFaixa) {
		this.nuFaixa = nuFaixa;
	}

	public int getNuCoreografia() {
		return nuCoreografia;
	}

	public void setNuCoreografia(int nuCoreografia) {
		this.nuCoreografia = nuCoreografia;
	}

	public int getNuPacote() {
		return nuPacote;
	}

	public void setNuPacote(int nuPacote) {
		this.nuPacote = nuPacote;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

}
