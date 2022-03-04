package com.github.danilolopesabreu.domain.formulario;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SlctoManutencaoCifId
 */
@Embeddable
public class SlctoManutencaoCifId implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private int nuSqnclSlctoMntnoCif;
	private int nuSequencialCifServico;
	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;

	public SlctoManutencaoCifId() {
	}

	public SlctoManutencaoCifId(int nuSqnclSlctoMntnoCif, int nuSequencialCifServico, byte nuAcao, byte nuModo,
			byte nuGrupo) {
		this.nuSqnclSlctoMntnoCif = nuSqnclSlctoMntnoCif;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
	}

	@Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclSlctoMntnoCif() {
		return this.nuSqnclSlctoMntnoCif;
	}

	public void setNuSqnclSlctoMntnoCif(int nuSqnclSlctoMntnoCif) {
		this.nuSqnclSlctoMntnoCif = nuSqnclSlctoMntnoCif;
	}

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)
	public int getNuSequencialCifServico() {
		return this.nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	@Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)
	public byte getNuAcao() {
		return this.nuAcao;
	}

	public void setNuAcao(byte nuAcao) {
		this.nuAcao = nuAcao;
	}

	@Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)
	public byte getNuModo() {
		return this.nuModo;
	}

	public void setNuModo(byte nuModo) {
		this.nuModo = nuModo;
	}

	@Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)
	public byte getNuGrupo() {
		return this.nuGrupo;
	}

	public void setNuGrupo(byte nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SlctoManutencaoCifId))
			return false;
		SlctoManutencaoCifId castOther = (SlctoManutencaoCifId) other;

		return (this.getNuSqnclSlctoMntnoCif() == castOther.getNuSqnclSlctoMntnoCif())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNuSqnclSlctoMntnoCif();
		result = 37 * result + this.getNuSequencialCifServico();
		result = 37 * result + this.getNuAcao();
		result = 37 * result + this.getNuModo();
		result = 37 * result + this.getNuGrupo();
		return result;
	}

}
