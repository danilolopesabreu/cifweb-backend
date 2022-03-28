package com.github.danilolopesabreu.domain.parametro;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CifServicoId
 */
@Embeddable
public class CifServicoId implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private short nuAcao;
	private short nuModo;
	private short nuGrupo;
	private int nuSequencialCifServico;

	public CifServicoId() {
	}

	public CifServicoId(short nuAcao, short nuModo, short nuGrupo, int nuSequencialCifServico) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	@Column(name = "NU_ACAO_P15", nullable = false, precision = 3, scale = 0)
	public short getNuAcao() {
		return this.nuAcao;
	}

	public void setNuAcao(short nuAcao) {
		this.nuAcao = nuAcao;
	}

	@Column(name = "NU_MODO_P15", nullable = false, precision = 3, scale = 0)
	public short getNuModo() {
		return this.nuModo;
	}

	public void setNuModo(short nuModo) {
		this.nuModo = nuModo;
	}

	@Column(name = "NU_GRUPO_P15", nullable = false, precision = 3, scale = 0)
	public short getNuGrupo() {
		return this.nuGrupo;
	}

	public void setNuGrupo(short nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO", nullable = false, precision = 9, scale = 0)
	public int getNuSequencialCifServico() {
		return this.nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CifServicoId))
			return false;
		CifServicoId castOther = (CifServicoId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNuAcao();
		result = 37 * result + this.getNuModo();
		result = 37 * result + this.getNuGrupo();
		result = 37 * result + this.getNuSequencialCifServico();
		return result;
	}

}
