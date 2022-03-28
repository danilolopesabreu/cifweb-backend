package com.github.danilolopesabreu.domain.parametro;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CifCoreografiaId
 */
@Embeddable
public class CifCoreografiaId implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private short nuAcao;
	private short nuModo;
	private short nuGrupo;
	private int nuSequencialCifServico;
	private short nuFaixa;
	private int nuCoreografia;
	private int nuPacote;
	private Date inicioVigencia;

	public CifCoreografiaId() {
	}

	public CifCoreografiaId(short nuAcao, short nuModo, short nuGrupo, int nuSequencialCifServico, short nuFaixa,
			int nuCoreografia, int nuPacote, Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuFaixa = nuFaixa;
		this.nuCoreografia = nuCoreografia;
		this.nuPacote = nuPacote;
		this.inicioVigencia = inicioVigencia;
	}

	@Column(name = "NU_ACAO_200", nullable = false, precision = 3, scale = 0)
	public short getNuAcao() {
		return this.nuAcao;
	}

	public void setNuAcao(short nuAcao) {
		this.nuAcao = nuAcao;
	}

	@Column(name = "NU_MODO_200", nullable = false, precision = 3, scale = 0)
	public short getNuModo() {
		return this.nuModo;
	}

	public void setNuModo(short nuModo) {
		this.nuModo = nuModo;
	}

	@Column(name = "NU_GRUPO_200", nullable = false, precision = 3, scale = 0)
	public short getNuGrupo() {
		return this.nuGrupo;
	}

	public void setNuGrupo(short nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)
	public int getNuSequencialCifServico() {
		return this.nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	@Column(name = "NU_FAIXA", nullable = false, precision = 4, scale = 0)
	public short getNuFaixa() {
		return this.nuFaixa;
	}

	public void setNuFaixa(short nuFaixa) {
		this.nuFaixa = nuFaixa;
	}

	@Column(name = "NU_COREOGRAFIA", nullable = false, precision = 5, scale = 0)
	public int getNuCoreografia() {
		return this.nuCoreografia;
	}

	public void setNuCoreografia(int nuCoreografia) {
		this.nuCoreografia = nuCoreografia;
	}

	@Column(name = "NU_PACOTE", nullable = false, precision = 5, scale = 0)
	public int getNuPacote() {
		return this.nuPacote;
	}

	public void setNuPacote(int nuPacote) {
		this.nuPacote = nuPacote;
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
		if (!(other instanceof CifCoreografiaId))
			return false;
		CifCoreografiaId castOther = (CifCoreografiaId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuFaixa() == castOther.getNuFaixa())
				&& (this.getNuCoreografia() == castOther.getNuCoreografia())
				&& (this.getNuPacote() == castOther.getNuPacote())
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
		result = 37 * result + this.getNuFaixa();
		result = 37 * result + this.getNuCoreografia();
		result = 37 * result + this.getNuPacote();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
