package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClassificacaoCndoId
 */
@Embeddable
public class ClassificacaoCndoId implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private byte nuAcao;
	private byte nuModo;
	private byte nuGrupo;
	private int nuSqnclCifPrpreFrmro;
	private int nuSequencialCifServico;
	private short nuClassificacaoLncmo;
	private Date inicioVigencia;

	public ClassificacaoCndoId() {
	}

	public ClassificacaoCndoId(byte nuAcao, byte nuModo, byte nuGrupo, int nuSqnclCifPrpreFrmro,
			int nuSequencialCifServico, short nuClassificacaoLncmo, Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSqnclCifPrpreFrmro = nuSqnclCifPrpreFrmro;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuClassificacaoLncmo = nuClassificacaoLncmo;
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

	@Column(name = "NU_SQNCL_CIF_PRPRE_FRMRO_202", nullable = false, precision = 9, scale = 0)
	public int getNuSqnclCifPrpreFrmro() {
		return this.nuSqnclCifPrpreFrmro;
	}

	public void setNuSqnclCifPrpreFrmro(int nuSqnclCifPrpreFrmro) {
		this.nuSqnclCifPrpreFrmro = nuSqnclCifPrpreFrmro;
	}

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)
	public int getNuSequencialCifServico() {
		return this.nuSequencialCifServico;
	}

	public void setNuSequencialCifServico(int nuSequencialCifServico) {
		this.nuSequencialCifServico = nuSequencialCifServico;
	}

	@Column(name = "NU_CLASSIFICACAO_LNCMO_P17", nullable = false, precision = 3, scale = 0)
	public short getNuClassificacaoLncmo() {
		return this.nuClassificacaoLncmo;
	}

	public void setNuClassificacaoLncmo(short nuClassificacaoLncmo) {
		this.nuClassificacaoLncmo = nuClassificacaoLncmo;
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
		if (!(other instanceof ClassificacaoCndoId))
			return false;
		ClassificacaoCndoId castOther = (ClassificacaoCndoId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSqnclCifPrpreFrmro() == castOther.getNuSqnclCifPrpreFrmro())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuClassificacaoLncmo() == castOther.getNuClassificacaoLncmo())
				&& ((this.getInicioVigencia() == castOther.getInicioVigencia())
						|| (this.getInicioVigencia() != null && castOther.getInicioVigencia() != null
								&& this.getInicioVigencia().equals(castOther.getInicioVigencia())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNuAcao();
		result = 37 * result + this.getNuModo();
		result = 37 * result + this.getNuGrupo();
		result = 37 * result + this.getNuSqnclCifPrpreFrmro();
		result = 37 * result + this.getNuSequencialCifServico();
		result = 37 * result + this.getNuClassificacaoLncmo();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
