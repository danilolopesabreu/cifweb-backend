package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.Objects;

public class CifServicoIdDto {

	private Short nuAcao;
	private Short nuModo;
	private Short nuGrupo;
	private int nuSequencialCifServico;

	public Short getNuAcao() {
		return nuAcao;
	}

	public void setNuAcao(Short nuAcao) {
		this.nuAcao = nuAcao;
	}

	public Short getNuModo() {
		return nuModo;
	}

	public void setNuModo(Short nuModo) {
		this.nuModo = nuModo;
	}

	public Short getNuGrupo() {
		return nuGrupo;
	}

	public void setNuGrupo(Short nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	public int getNuSequencialCifServico() {
		return nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
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
