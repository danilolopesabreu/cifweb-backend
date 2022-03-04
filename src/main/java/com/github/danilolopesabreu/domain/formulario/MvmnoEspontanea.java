package com.github.danilolopesabreu.domain.formulario;


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MvmnoEspontanea
 */
@Entity
@Table(name = "D02TB262_MVMNO_ESPONTANEA")
public class MvmnoEspontanea implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private MvmnoEspontaneaId id;
	private SlctoManutencaoCif slctoManutencaoCif;
	private char icMovimentacaoEspontanea;
	private Date fimVigencia;
	private String coUsuario;

	public MvmnoEspontanea() {
	}

	public MvmnoEspontanea(MvmnoEspontaneaId id, SlctoManutencaoCif slctoManutencaoCif, char icMovimentacaoEspontanea,
			String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.icMovimentacaoEspontanea = icMovimentacaoEspontanea;
		this.coUsuario = coUsuario;
	}

	public MvmnoEspontanea(MvmnoEspontaneaId id, SlctoManutencaoCif slctoManutencaoCif, char icMovimentacaoEspontanea,
			Date fimVigencia, String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.icMovimentacaoEspontanea = icMovimentacaoEspontanea;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuSqnclSlctoMntnoCif", column = @Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public MvmnoEspontaneaId getId() {
		return this.id;
	}

	public void setId(MvmnoEspontaneaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", referencedColumnName = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_SEQUENCIAL_CIF_SERVICO_200", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_ACAO_200", referencedColumnName = "NU_ACAO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_MODO_200", referencedColumnName = "NU_MODO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_GRUPO_200", referencedColumnName = "NU_GRUPO_200", nullable = false, insertable = false, updatable = false) })
	public SlctoManutencaoCif getSlctoManutencaoCif() {
		return this.slctoManutencaoCif;
	}

	public void setSlctoManutencaoCif(SlctoManutencaoCif slctoManutencaoCif) {
		this.slctoManutencaoCif = slctoManutencaoCif;
	}

	@Column(name = "IC_MOVIMENTACAO_ESPONTANEA", nullable = false, length = 1)
	public char getIcMovimentacaoEspontanea() {
		return this.icMovimentacaoEspontanea;
	}

	public void setIcMovimentacaoEspontanea(char icMovimentacaoEspontanea) {
		this.icMovimentacaoEspontanea = icMovimentacaoEspontanea;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM_VIGENCIA", length = 7)
	public Date getFimVigencia() {
		return this.fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	@Column(name = "CO_USUARIO", nullable = false, length = 8)
	public String getCoUsuario() {
		return this.coUsuario;
	}

	public void setCoUsuario(String coUsuario) {
		this.coUsuario = coUsuario;
	}

}
