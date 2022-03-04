package com.github.danilolopesabreu.domain.parametro;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CanalConteudoId
 */
@Embeddable
public class CanalConteudoId implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSequencialCifServico;
	private int nuSqnclCifPrpreFrmro;
	private int nuCanalComercializacaoO;
	private Date inicioVigencia;

	public CanalConteudoId() {
	}

	public CanalConteudoId(byte nuAcao, byte nuModo, byte nuGrupo, int nuSequencialCifServico, int nuSqnclCifPrpreFrmro,
			int nuCanalComercializacaoO, Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuSqnclCifPrpreFrmro = nuSqnclCifPrpreFrmro;
		this.nuCanalComercializacaoO = nuCanalComercializacaoO;
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

	@Column(name = "NU_SQNCL_CIF_PRPRE_FRMRO_202", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclCifPrpreFrmro() {
		return this.nuSqnclCifPrpreFrmro;
	}

	public void setNuSqnclCifPrpreFrmro(int nuSqnclCifPrpreFrmro) {
		this.nuSqnclCifPrpreFrmro = nuSqnclCifPrpreFrmro;
	}

	@Column(name = "NU_CANAL_COMERCIALIZACAO_O15", nullable = false, precision = 9, scale = 0)
	public int getNuCanalComercializacaoO() {
		return this.nuCanalComercializacaoO;
	}

	public void setNuCanalComercializacaoO(int nuCanalComercializacaoO) {
		this.nuCanalComercializacaoO = nuCanalComercializacaoO;
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
		if (!(other instanceof CanalConteudoId))
			return false;
		CanalConteudoId castOther = (CanalConteudoId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuSqnclCifPrpreFrmro() == castOther.getNuSqnclCifPrpreFrmro())
				&& (this.getNuCanalComercializacaoO() == castOther.getNuCanalComercializacaoO())
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
		result = 37 * result + this.getNuCanalComercializacaoO();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
