package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Date;

public class CifSrvcoPrpreFrmroDto {

	private char icObrigatorio;
	private char icHabilitado;
	private Date inicioVigencia;
	private Date fimVigencia;
	private String coUsuario;

	public char getIcObrigatorio() {
		return icObrigatorio;
	}

	public void setIcObrigatorio(char icObrigatorio) {
		this.icObrigatorio = icObrigatorio;
	}

	public char getIcHabilitado() {
		return icHabilitado;
	}

	public void setIcHabilitado(char icHabilitado) {
		this.icHabilitado = icHabilitado;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
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
