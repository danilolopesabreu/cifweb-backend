package com.github.danilolopesabreu.domain.parametro;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FncneEspecialCndoId
 */
@Embeddable
public class FncneEspecialCndoId implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private short nuAcao;
	private short nuModo;
	private short nuGrupo;
	private int nuSequencialCifServico;
	private int nuSqnclCifPrpreFrmro;
	private int nuFuncionalidadeEspecial;
	private Date inicioVigencia;

	public FncneEspecialCndoId() {
	}

	public FncneEspecialCndoId(short nuAcao, short nuModo, short nuGrupo, int nuSequencialCifServico,
			int nuSqnclCifPrpreFrmro, int nuFuncionalidadeEspecial, Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuSqnclCifPrpreFrmro = nuSqnclCifPrpreFrmro;
		this.nuFuncionalidadeEspecial = nuFuncionalidadeEspecial;
		this.inicioVigencia = inicioVigencia;
	}

	@Column(name = "NU_ACAO_202", nullable = false, precision = 3, scale = 0)
	public short getNuAcao() {
		return this.nuAcao;
	}

	public void setNuAcao(short nuAcao) {
		this.nuAcao = nuAcao;
	}

	@Column(name = "NU_MODO_202", nullable = false, precision = 3, scale = 0)
	public short getNuModo() {
		return this.nuModo;
	}

	public void setNuModo(short nuModo) {
		this.nuModo = nuModo;
	}

	@Column(name = "NU_GRUPO_202", nullable = false, precision = 3, scale = 0)
	public short getNuGrupo() {
		return this.nuGrupo;
	}

	public void setNuGrupo(short nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO_202", nullable = false, precision = 9, scale = 0)
	public int getNuSequencialCifServico() {
		return this.nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	@Column(name = "NU_SQNCL_CIF_PRPRE_FRMRO_202", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclCifPrpreFrmro() {
		return this.nuSqnclCifPrpreFrmro;
	}

	public void setNuSqnclCifPrpreFrmro(int nuSqnclCifPrpreFrmro) {
		this.nuSqnclCifPrpreFrmro = nuSqnclCifPrpreFrmro;
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
		if (!(other instanceof FncneEspecialCndoId))
			return false;
		FncneEspecialCndoId castOther = (FncneEspecialCndoId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuSqnclCifPrpreFrmro() == castOther.getNuSqnclCifPrpreFrmro())
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
		result = 37 * result + this.getNuSqnclCifPrpreFrmro();
		result = 37 * result + this.getNuFuncionalidadeEspecial();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
