package com.github.danilolopesabreu.domain.formulario;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProdutoPropriedadeId
 */
@Embeddable
public class ProdutoPropriedadeId implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private short nuAcao;
	private short nuModo;
	private short nuGrupo;
	private int nuSequencialCifServico;
	private int nuSqnclSlctoMntnoCif;
	private int nuProdutoO;
	private int nuPropriedadeProdutoO;
	private Date inicioVigencia;

	public ProdutoPropriedadeId() {
	}

	public ProdutoPropriedadeId(short nuAcao, short nuModo, short nuGrupo, int nuSequencialCifServico,
			int nuSqnclSlctoMntnoCif, int nuProdutoO, int nuPropriedadeProdutoO, Date inicioVigencia) {
		this.nuAcao = nuAcao;
		this.nuModo = nuModo;
		this.nuGrupo = nuGrupo;
		this.nuSequencialCifServico = nuSequencialCifServico;
		this.nuSqnclSlctoMntnoCif = nuSqnclSlctoMntnoCif;
		this.nuProdutoO = nuProdutoO;
		this.nuPropriedadeProdutoO = nuPropriedadeProdutoO;
		this.inicioVigencia = inicioVigencia;
	}

	@Column(name = "NU_ACAO_250", nullable = false, precision = 3, scale = 0)
	public short getNuAcao() {
		return this.nuAcao;
	}

	public void setNuAcao(short nuAcao) {
		this.nuAcao = nuAcao;
	}

	@Column(name = "NU_MODO_250", nullable = false, precision = 3, scale = 0)
	public short getNuModo() {
		return this.nuModo;
	}

	public void setNuModo(short nuModo) {
		this.nuModo = nuModo;
	}

	@Column(name = "NU_GRUPO_250", nullable = false, precision = 3, scale = 0)
	public short getNuGrupo() {
		return this.nuGrupo;
	}

	public void setNuGrupo(short nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	@Column(name = "NU_SEQUENCIAL_CIF_SERVICO_250", nullable = false, precision = 9, scale = 0)
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

	@Column(name = "NU_PRODUTO_O28", nullable = false, precision = 9, scale = 0)
	public int getNuProdutoO() {
		return this.nuProdutoO;
	}

	public void setNuProdutoO(int nuProdutoO) {
		this.nuProdutoO = nuProdutoO;
	}

	@Column(name = "NU_PROPRIEDADE_PRODUTO_O28", nullable = false, precision = 9, scale = 0)
	public int getNuPropriedadeProdutoO() {
		return this.nuPropriedadeProdutoO;
	}

	public void setNuPropriedadeProdutoO(int nuPropriedadeProdutoO) {
		this.nuPropriedadeProdutoO = nuPropriedadeProdutoO;
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
		if (!(other instanceof ProdutoPropriedadeId))
			return false;
		ProdutoPropriedadeId castOther = (ProdutoPropriedadeId) other;

		return (this.getNuAcao() == castOther.getNuAcao()) && (this.getNuModo() == castOther.getNuModo())
				&& (this.getNuGrupo() == castOther.getNuGrupo())
				&& (this.getNuSequencialCifServico() == castOther.getNuSequencialCifServico())
				&& (this.getNuSqnclSlctoMntnoCif() == castOther.getNuSqnclSlctoMntnoCif())
				&& (this.getNuProdutoO() == castOther.getNuProdutoO())
				&& (this.getNuPropriedadeProdutoO() == castOther.getNuPropriedadeProdutoO())
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
		result = 37 * result + this.getNuProdutoO();
		result = 37 * result + this.getNuPropriedadeProdutoO();
		result = 37 * result + (getInicioVigencia() == null ? 0 : this.getInicioVigencia().hashCode());
		return result;
	}

}
