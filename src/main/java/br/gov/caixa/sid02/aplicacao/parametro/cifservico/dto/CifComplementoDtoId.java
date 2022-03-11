package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

public class CifComplementoDtoId {

	private byte nuAcaoVinculador;
	private byte nuModoVinculador;
	private byte nuGrupoVinculador;
	private int nuSqnclCifSrvcoVinculador;
	private Date inicioVigencia;

	public byte getNuAcaoVinculador() {
		return nuAcaoVinculador;
	}

	public void setNuAcaoVinculador(byte nuAcaoVinculador) {
		this.nuAcaoVinculador = nuAcaoVinculador;
	}

	public byte getNuModoVinculador() {
		return nuModoVinculador;
	}

	public void setNuModoVinculador(byte nuModoVinculador) {
		this.nuModoVinculador = nuModoVinculador;
	}

	public byte getNuGrupoVinculador() {
		return nuGrupoVinculador;
	}

	public void setNuGrupoVinculador(byte nuGrupoVinculador) {
		this.nuGrupoVinculador = nuGrupoVinculador;
	}

	public int getNuSqnclCifSrvcoVinculador() {
		return nuSqnclCifSrvcoVinculador;
	}

	public void setNuSqnclCifSrvcoVinculador(int nuSqnclCifSrvcoVinculador) {
		this.nuSqnclCifSrvcoVinculador = nuSqnclCifSrvcoVinculador;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

}
