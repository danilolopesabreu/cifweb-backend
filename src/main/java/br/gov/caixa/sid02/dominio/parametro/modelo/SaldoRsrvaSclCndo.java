package br.gov.caixa.sid02.dominio.parametro.modelo;


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
 * SaldoRsrvaSclCndo
 */
@Entity
@Table(name = "D02TB210_SALDO_RSRVA_SCL_CNDO")
public class SaldoRsrvaSclCndo implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private SaldoRsrvaSclCndoId id;
	private CifSrvcoPrpreFrmro cifSrvcoPrpreFrmro;
	private SaldoReservaSocial saldoReservaSocial;
	private Date fimVigencia;
	private String coUsuario;

	public SaldoRsrvaSclCndo() {
	}

	public SaldoRsrvaSclCndo(SaldoRsrvaSclCndoId id, CifSrvcoPrpreFrmro cifSrvcoPrpreFrmro,
			SaldoReservaSocial saldoReservaSocial, String coUsuario) {
		this.id = id;
		this.cifSrvcoPrpreFrmro = cifSrvcoPrpreFrmro;
		this.saldoReservaSocial = saldoReservaSocial;
		this.coUsuario = coUsuario;
	}

	public SaldoRsrvaSclCndo(SaldoRsrvaSclCndoId id, CifSrvcoPrpreFrmro cifSrvcoPrpreFrmro,
			SaldoReservaSocial saldoReservaSocial, Date fimVigencia, String coUsuario) {
		this.id = id;
		this.cifSrvcoPrpreFrmro = cifSrvcoPrpreFrmro;
		this.saldoReservaSocial = saldoReservaSocial;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuSqnclCifPrpreFrmro", column = @Column(name = "NU_SQNCL_CIF_PRPRE_FRMRO_202", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)),
			@AttributeOverride(name = "nuAtrzaSldoRsrvaScl", column = @Column(name = "NU_ATRZA_SLDO_RSRVA_SCL_209", nullable = false, precision = 3, scale = 0)) })
	public SaldoRsrvaSclCndoId getId() {
		return this.id;
	}

	public void setId(SaldoRsrvaSclCndoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NU_SEQUENCIAL_CIF_SERVICO_200", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_ACAO_200", referencedColumnName = "NU_ACAO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_MODO_200", referencedColumnName = "NU_MODO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_GRUPO_200", referencedColumnName = "NU_GRUPO_200", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_SQNCL_CIF_PRPRE_FRMRO_202", referencedColumnName = "NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO", nullable = false, insertable = false, updatable = false) })
	public CifSrvcoPrpreFrmro getCifSrvcoPrpreFrmro() {
		return this.cifSrvcoPrpreFrmro;
	}

	public void setCifSrvcoPrpreFrmro(CifSrvcoPrpreFrmro cifSrvcoPrpreFrmro) {
		this.cifSrvcoPrpreFrmro = cifSrvcoPrpreFrmro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NU_ATRZA_SLDO_RSRVA_SCL_209", nullable = false, insertable = false, updatable = false)
	public SaldoReservaSocial getSaldoReservaSocial() {
		return this.saldoReservaSocial;
	}

	public void setSaldoReservaSocial(SaldoReservaSocial saldoReservaSocial) {
		this.saldoReservaSocial = saldoReservaSocial;
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
