package br.gov.caixa.sid02.dominio.formulario.modelo;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SituacaoCifId
 */
@Embeddable
public class SituacaoCifId implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSequencialCifServico;
	private int nuSqnclSlctoMntnoCif;
	private Date inicioVigencia;

	public SituacaoCifId() {
	}

	public SituacaoCifId(byte nuAcao, byte nuModo, byte nuGrupo, int nuSequencialCifServico, int nuSqnclSlctoMntnoCif,
			Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuSqnclSlctoMntnoCif = nuSqnclSlctoMntnoCif;
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
		if (!(other instanceof SituacaoCifId))
			return false;
		SituacaoCifId castOther = (SituacaoCifId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuSqnclSlctoMntnoCif() == castOther.getNuSqnclSlctoMntnoCif())
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
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
