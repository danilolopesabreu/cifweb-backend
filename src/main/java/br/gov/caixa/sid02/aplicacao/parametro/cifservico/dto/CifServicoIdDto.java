package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Objects;

public class CifServicoIdDto {
	
	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSequencialCifServico;

	public int getNuSequencialCifServico() {
		return nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(nuAcao, nuGrupo, nuModo, nuSequencialCifServico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CifServicoIdDto other = (CifServicoIdDto) obj;
		return nuAcao == other.nuAcao && nuGrupo == other.nuGrupo && nuModo == other.nuModo
				&& nuSequencialCifServico == other.nuSequencialCifServico;
	}

}
