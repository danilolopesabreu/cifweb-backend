package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

public class CifCoreografiaDto {

	private CifCoreografiaIdDto id;
	private Date fimVigencia;
	private String coUsuario;

	public CifCoreografiaIdDto getId() {
		return id;
	}

	public void setId(CifCoreografiaIdDto id) {
		this.id = id;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	public String getCoUsuario() {
		return coUsuario;
	}

	public void setCoUsuario(String coUsuario) {
		this.coUsuario = coUsuario;
	}

}
