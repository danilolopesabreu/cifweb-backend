package com.github.danilolopesabreu.domain.formulario;


import java.math.BigDecimal;
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
 * DmndaSlctoMntnoCif
 */
@Entity
@Table(name = "D02TB269_DMNDA_SLCTO_MNTNO_CIF")
public class DmndaSlctoMntnoCif implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private DmndaSlctoMntnoCifId id;
	private SlctoManutencaoCif slctoManutencaoCif;
	private int nuUnidadeDemanda;
	private String coUsuarioDemanda;
	private BigDecimal nuDemanda;
	private Date fimVigencia;
	private String coUsuario;

	public DmndaSlctoMntnoCif() {
	}

	public DmndaSlctoMntnoCif(DmndaSlctoMntnoCifId id, SlctoManutencaoCif slctoManutencaoCif, int nuUnidadeDemanda,
			String coUsuarioDemanda, BigDecimal nuDemanda, String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.nuUnidadeDemanda = nuUnidadeDemanda;
		this.coUsuarioDemanda = coUsuarioDemanda;
		this.nuDemanda = nuDemanda;
		this.coUsuario = coUsuario;
	}

	public DmndaSlctoMntnoCif(DmndaSlctoMntnoCifId id, SlctoManutencaoCif slctoManutencaoCif, int nuUnidadeDemanda,
			String coUsuarioDemanda, BigDecimal nuDemanda, Date fimVigencia, String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.nuUnidadeDemanda = nuUnidadeDemanda;
		this.coUsuarioDemanda = coUsuarioDemanda;
		this.nuDemanda = nuDemanda;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSqnclSlctoMntnoCif", column = @Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public DmndaSlctoMntnoCifId getId() {
		return this.id;
	}

	public void setId(DmndaSlctoMntnoCifId id) {
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

	@Column(name = "NU_UNIDADE_DEMANDA", nullable = false, precision = 5, scale = 0)
	public int getNuUnidadeDemanda() {
		return this.nuUnidadeDemanda;
	}

	public void setNuUnidadeDemanda(int nuUnidadeDemanda) {
		this.nuUnidadeDemanda = nuUnidadeDemanda;
	}

	@Column(name = "CO_USUARIO_DEMANDA", nullable = false, length = 8)
	public String getCoUsuarioDemanda() {
		return this.coUsuarioDemanda;
	}

	public void setCoUsuarioDemanda(String coUsuarioDemanda) {
		this.coUsuarioDemanda = coUsuarioDemanda;
	}

	@Column(name = "NU_DEMANDA", nullable = false, precision = 20, scale = 0)
	public BigDecimal getNuDemanda() {
		return this.nuDemanda;
	}

	public void setNuDemanda(BigDecimal nuDemanda) {
		this.nuDemanda = nuDemanda;
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
