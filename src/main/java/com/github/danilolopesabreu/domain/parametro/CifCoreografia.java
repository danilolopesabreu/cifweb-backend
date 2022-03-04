package com.github.danilolopesabreu.domain.parametro;


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
 * CifCoreografia
 */
@Entity
@Table(name = "D02TB203_CIF_COREOGRAFIA")
public class CifCoreografia implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private CifCoreografiaId id;
	private CifServico cifServico;
	private Date fimVigencia;
	private String coUsuario;

	public CifCoreografia() {
	}

	public CifCoreografia(CifCoreografiaId id, CifServico cifServico, String coUsuario) {
		this.id = id;
		this.cifServico = cifServico;
		this.coUsuario = coUsuario;
	}

	public CifCoreografia(CifCoreografiaId id, CifServico cifServico, Date fimVigencia, String coUsuario) {
		this.id = id;
		this.cifServico = cifServico;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuFaixa", column = @Column(name = "NU_FAIXA", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "nuCoreografia", column = @Column(name = "NU_COREOGRAFIA", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "nuPacote", column = @Column(name = "NU_PACOTE", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public CifCoreografiaId getId() {
		return this.id;
	}

	public void setId(CifCoreografiaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NU_SEQUENCIAL_CIF_SERVICO_200", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_ACAO_200", referencedColumnName = "NU_ACAO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_MODO_200", referencedColumnName = "NU_MODO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_GRUPO_200", referencedColumnName = "NU_GRUPO_P15", nullable = false, insertable = false, updatable = false) })
	public CifServico getCifServico() {
		return this.cifServico;
	}

	public void setCifServico(CifServico cifServico) {
		this.cifServico = cifServico;
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
