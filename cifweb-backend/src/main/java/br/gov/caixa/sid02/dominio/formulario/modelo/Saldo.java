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

/**
 * Saldo
 */
@Entity
@Table(name = "D02TB263_SALDO")
public class Saldo implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private SaldoId id;
	private SlctoManutencaoCif slctoManutencaoCif;
	private byte nuSinal;
	private Date fimVigencia;
	private String coUsuario;

	public Saldo() {
	}

	public Saldo(SaldoId id, SlctoManutencaoCif slctoManutencaoCif, byte nuSinal, String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.nuSinal = nuSinal;
		this.coUsuario = coUsuario;
	}

	public Saldo(SaldoId id, SlctoManutencaoCif slctoManutencaoCif, byte nuSinal, Date fimVigencia, String coUsuario) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.nuSinal = nuSinal;
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
			@AttributeOverride(name = "nuTipoSaldo", column = @Column(name = "NU_TIPO_SALDO_P48", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public SaldoId getId() {
		return this.id;
	}

	public void setId(SaldoId id) {
		this.id = id;
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

	@Column(name = "NU_SINAL", nullable = false, precision = 2, scale = 0)
	public byte getNuSinal() {
		return this.nuSinal;
	}

	public void setNuSinal(byte nuSinal) {
		this.nuSinal = nuSinal;
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
