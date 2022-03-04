package br.gov.caixa.sid02.dominio.parametro.modelo;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CifSrvcoPrpreFrmroId
 */
@Embeddable
public class CifSrvcoPrpreFrmroId implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private int nuSequencialCifServico;
	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSqnclCifSrvcoPrpreFrmro;

	public CifSrvcoPrpreFrmroId() {
	}

	public CifSrvcoPrpreFrmroId(int nuSequencialCifServico, byte nuAcao, byte nuModo, byte nuGrupo,
			int nuSqnclCifSrvcoPrpreFrmro) {
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSqnclCifSrvcoPrpreFrmro = nuSqnclCifSrvcoPrpreFrmro;
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

	@Column(name = "NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclCifSrvcoPrpreFrmro() {
		return this.nuSqnclCifSrvcoPrpreFrmro;
	}

	public void setNuSqnclCifSrvcoPrpreFrmro(int nuSqnclCifSrvcoPrpreFrmro) {
		this.nuSqnclCifSrvcoPrpreFrmro = nuSqnclCifSrvcoPrpreFrmro;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CifSrvcoPrpreFrmroId))
			return false;
		CifSrvcoPrpreFrmroId castOther = (CifSrvcoPrpreFrmroId) other;

		return (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSqnclCifSrvcoPrpreFrmro() == castOther.getNuSqnclCifSrvcoPrpreFrmro());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNuSequencialCifServico();
		result = 37 * result + this.getNuAcao();
		result = 37 * result + this.getNuModo();
		result = 37 * result + this.getNuGrupo();
		result = 37 * result + this.getNuSqnclCifSrvcoPrpreFrmro();
		return result;
	}

}
