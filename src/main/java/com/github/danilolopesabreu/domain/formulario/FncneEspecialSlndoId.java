package com.github.danilolopesabreu.domain.formulario;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FncneEspecialSlndoId
 */
@Embeddable
public class FncneEspecialSlndoId implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSequencialCifServico;
	private int nuSqnclSlctoMntnoCif;
	private int nuFuncionalidadeEspecial;
	private Date inicioVigencia;

	public FncneEspecialSlndoId() {
	}

	public FncneEspecialSlndoId(byte nuAcao, byte nuModo, byte nuGrupo, int nuSequencialCifServico,
			int nuSqnclSlctoMntnoCif, int nuFuncionalidadeEspecial, Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuSqnclSlctoMntnoCif = nuSqnclSlctoMntnoCif;
		this.nuFuncionalidadeEspecial = nuFuncionalidadeEspecial;
		this.inicioVigencia = inicioVigencia;
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

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)
	public int getNuSequencialCifServico() {
		return this.nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	@Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclSlctoMntnoCif() {
		return this.nuSqnclSlctoMntnoCif;
	}

	public void setNuSqnclSlctoMntnoCif(int nuSqnclSlctoMntnoCif) {
		this.nuSqnclSlctoMntnoCif = nuSqnclSlctoMntnoCif;
	}

	@Column(name = "NU_FUNCIONALIDADE_ESPECIAL_P21", nullable = false, precision = 9, scale = 0)
	public int getNuFuncionalidadeEspecial() {
		return this.nuFuncionalidadeEspecial;
	}

	public void setNuFuncionalidadeEspecial(int nuFuncionalidadeEspecial) {
		this.nuFuncionalidadeEspecial = nuFuncionalidadeEspecial;
	}

	@Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)
	public Date getInicioVigencia() {
		return this.inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FncneEspecialSlndoId))
			return false;
		FncneEspecialSlndoId castOther = (FncneEspecialSlndoId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuSqnclSlctoMntnoCif() == castOther.getNuSqnclSlctoMntnoCif())
				&& (this.getNuFuncionalidadeEspecial() == castOther.getNuFuncionalidadeEspecial())
				&& ((this.getInicioVigencia() == castOther.getInicioVigencia())
						|| (this.getInicioVigencia() != null && castOther.getInicioVigencia() != null
								&& this.getInicioVigencia().equals(castOther.getInicioVigencia())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNuAcao();
		result = 37 * result + this.getNuModo();
		result = 37 * result + this.getNuGrupo();
		result = 37 * result + this.getNuSequencialCifServico();
		result = 37 * result + this.getNuSqnclSlctoMntnoCif();
		result = 37 * result + this.getNuFuncionalidadeEspecial();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
