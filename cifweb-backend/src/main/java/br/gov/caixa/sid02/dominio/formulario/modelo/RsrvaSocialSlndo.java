package br.gov.caixa.sid02.dominio.formulario.modelo;


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

import br.gov.caixa.sid02.dominio.parametro.modelo.SaldoReservaSocial;

/**
 * RsrvaSocialSlndo
 */
@Entity
@Table(name = "D02TB254_RSRVA_SOCIAL_SLNDO")
public class RsrvaSocialSlndo implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private RsrvaSocialSlndoId id;
	private SaldoReservaSocial saldoReservaSocial;
	private SlctoManutencaoCif slctoManutencaoCif;
	private Date fimVigencia;
	private String coUsuario;

	public RsrvaSocialSlndo() {
	}

	public RsrvaSocialSlndo(RsrvaSocialSlndoId id, SaldoReservaSocial saldoReservaSocial,
			SlctoManutencaoCif slctoManutencaoCif, String coUsuario) {
		this.id = id;
		this.saldoReservaSocial = saldoReservaSocial;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.coUsuario = coUsuario;
	}

	public RsrvaSocialSlndo(RsrvaSocialSlndoId id, SaldoReservaSocial saldoReservaSocial,
			SlctoManutencaoCif slctoManutencaoCif, Date fimVigencia, String coUsuario) {
		this.id = id;
		this.saldoReservaSocial = saldoReservaSocial;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_250", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_250", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_250", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSqnclSlctoMntnoCif", column = @Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuAtrzaSldoRsrvaScl", column = @Column(name = "NU_ATRZA_SLDO_RSRVA_SCL_209", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public RsrvaSocialSlndoId getId() {
		return this.id;
	}

	public void setId(RsrvaSocialSlndoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NU_ATRZA_SLDO_RSRVA_SCL_209", nullable = false, insertable = false, updatable = false)
	public SaldoReservaSocial getSaldoReservaSocial() {
		return this.saldoReservaSocial;
	}

	public void setSaldoReservaSocial(SaldoReservaSocial saldoReservaSocial) {
		this.saldoReservaSocial = saldoReservaSocial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NU_ACAO_250", referencedColumnName = "NU_ACAO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_MODO_250", referencedColumnName = "NU_MODO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_GRUPO_250", referencedColumnName = "NU_GRUPO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_SEQUENCIAL_CIF_SERVICO_250", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", referencedColumnName = "NU_SQNCL_SLCTO_MNTNO_CIF", nullable = false, insertable = false, updatable = false) })
	public SlctoManutencaoCif getSlctoManutencaoCif() {
		return this.slctoManutencaoCif;
	}

	public void setSlctoManutencaoCif(SlctoManutencaoCif slctoManutencaoCif) {
		this.slctoManutencaoCif = slctoManutencaoCif;
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
