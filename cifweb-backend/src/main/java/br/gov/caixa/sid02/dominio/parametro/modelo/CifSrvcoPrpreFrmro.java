package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CifSrvcoPrpreFrmro
 */
@Entity
@Table(name = "D02TB202_CIF_SRVCO_PRPRE_FRMRO")
public class CifSrvcoPrpreFrmro implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private CifSrvcoPrpreFrmroId id;
	private CifServico cifServico;
	private TipoPrpreFrmro tipoPrpreFrmro;
	private TipoConteudo tipoConteudo;
	private String icObrigatorio;
	private String icHabilitado;
	private Date inicioVigencia;
	private Date fimVigencia;
	private String coUsuario;
	private Set<SistemaConteudo> sistemaConteudos = new HashSet<SistemaConteudo>(0);
	private Set<CanalConteudo> canalConteudos = new HashSet<CanalConteudo>(0);
	private Set<SaldoRsrvaSclCndo> saldoRsrvaSclCndos = new HashSet<SaldoRsrvaSclCndo>(0);
	private Set<DetalheDebitoCndo> detalheDebitoCndos = new HashSet<DetalheDebitoCndo>(0);
	private Set<FncneEspecialCndo> fncneEspecialCndos = new HashSet<FncneEspecialCndo>(0);
	private Set<PrpreFrmroSnlSaldo> prpreFrmroSnlSaldos = new HashSet<PrpreFrmroSnlSaldo>(0);
	private Set<TipoExtracaoCndo> tipoExtracaoCndos = new HashSet<TipoExtracaoCndo>(0);
	private Set<ClassificacaoCndo> classificacaoCndos = new HashSet<ClassificacaoCndo>(0);
	private Set<PrioridadeConteudo> prioridadeConteudos = new HashSet<PrioridadeConteudo>(0);

	public CifSrvcoPrpreFrmro() {
	}

	public CifSrvcoPrpreFrmro(CifSrvcoPrpreFrmroId id, CifServico cifServico, TipoPrpreFrmro tipoPrpreFrmro,
			TipoConteudo tipoConteudo, String icObrigatorio, String icHabilitado, Date inicioVigencia,
			String coUsuario) {
		this.id = id;
		this.cifServico = cifServico;
		this.tipoPrpreFrmro = tipoPrpreFrmro;
		this.tipoConteudo = tipoConteudo;
		this.icObrigatorio = icObrigatorio;
		this.icHabilitado = icHabilitado;
		this.inicioVigencia = inicioVigencia;
		this.coUsuario = coUsuario;
	}

	public CifSrvcoPrpreFrmro(CifSrvcoPrpreFrmroId id, CifServico cifServico, TipoPrpreFrmro tipoPrpreFrmro,
			TipoConteudo tipoConteudo, String icObrigatorio, String icHabilitado, Date inicioVigencia, Date fimVigencia,
			String coUsuario, Set<SistemaConteudo> sistemaConteudos, Set<CanalConteudo> canalConteudos,
			Set<SaldoRsrvaSclCndo> saldoRsrvaSclCndos, Set<DetalheDebitoCndo> detalheDebitoCndos,
			Set<FncneEspecialCndo> fncneEspecialCndos, Set<PrpreFrmroSnlSaldo> prpreFrmroSnlSaldos,
			Set<TipoExtracaoCndo> tipoExtracaoCndos, Set<ClassificacaoCndo> classificacaoCndos,
			Set<PrioridadeConteudo> prioridadeConteudos) {
		this.id = id;
		this.cifServico = cifServico;
		this.tipoPrpreFrmro = tipoPrpreFrmro;
		this.tipoConteudo = tipoConteudo;
		this.icObrigatorio = icObrigatorio;
		this.icHabilitado = icHabilitado;
		this.inicioVigencia = inicioVigencia;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
		this.sistemaConteudos = sistemaConteudos;
		this.canalConteudos = canalConteudos;
		this.saldoRsrvaSclCndos = saldoRsrvaSclCndos;
		this.detalheDebitoCndos = detalheDebitoCndos;
		this.fncneEspecialCndos = fncneEspecialCndos;
		this.prpreFrmroSnlSaldos = prpreFrmroSnlSaldos;
		this.tipoExtracaoCndos = tipoExtracaoCndos;
		this.classificacaoCndos = classificacaoCndos;
		this.prioridadeConteudos = prioridadeConteudos;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSqnclCifSrvcoPrpreFrmro", column = @Column(name = "NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO", nullable = false, precision = 9, scale = 0)) })
	public CifSrvcoPrpreFrmroId getId() {
		return this.id;
	}

	public void setId(CifSrvcoPrpreFrmroId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NU_ACAO_200", referencedColumnName = "NU_ACAO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_MODO_200", referencedColumnName = "NU_MODO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_GRUPO_200", referencedColumnName = "NU_GRUPO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_SEQUENCIAL_CIF_SERVICO_200", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO", nullable = false, insertable = false, updatable = false) })
	public CifServico getCifServico() {
		return this.cifServico;
	}

	public void setCifServico(CifServico cifServico) {
		this.cifServico = cifServico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NU_TIPO_PRPRE_FORMULARIO_205", nullable = false)
	public TipoPrpreFrmro getTipoPrpreFrmro() {
		return this.tipoPrpreFrmro;
	}

	public void setTipoPrpreFrmro(TipoPrpreFrmro tipoPrpreFrmro) {
		this.tipoPrpreFrmro = tipoPrpreFrmro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NU_TIPO_CONTEUDO_206", nullable = false)
	public TipoConteudo getTipoConteudo() {
		return this.tipoConteudo;
	}

	public void setTipoConteudo(TipoConteudo tipoConteudo) {
		this.tipoConteudo = tipoConteudo;
	}

	@Column(name = "IC_OBRIGATORIO", nullable = false, length = 1)
	public String getIcObrigatorio() {
		return this.icObrigatorio;
	}

	public void setIcObrigatorio(String icObrigatorio) {
		this.icObrigatorio = icObrigatorio;
	}

	@Column(name = "IC_HABILITADO", nullable = false, length = 1)
	public String getIcHabilitado() {
		return this.icHabilitado;
	}

	public void setIcHabilitado(String icHabilitado) {
		this.icHabilitado = icHabilitado;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)
	public Date getInicioVigencia() {
		return this.inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<SistemaConteudo> getSistemaConteudos() {
		return this.sistemaConteudos;
	}

	public void setSistemaConteudos(Set<SistemaConteudo> sistemaConteudos) {
		this.sistemaConteudos = sistemaConteudos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<CanalConteudo> getCanalConteudos() {
		return this.canalConteudos;
	}

	public void setCanalConteudos(Set<CanalConteudo> canalConteudos) {
		this.canalConteudos = canalConteudos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<SaldoRsrvaSclCndo> getSaldoRsrvaSclCndos() {
		return this.saldoRsrvaSclCndos;
	}

	public void setSaldoRsrvaSclCndos(Set<SaldoRsrvaSclCndo> saldoRsrvaSclCndos) {
		this.saldoRsrvaSclCndos = saldoRsrvaSclCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<DetalheDebitoCndo> getDetalheDebitoCndos() {
		return this.detalheDebitoCndos;
	}

	public void setDetalheDebitoCndos(Set<DetalheDebitoCndo> detalheDebitoCndos) {
		this.detalheDebitoCndos = detalheDebitoCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<FncneEspecialCndo> getFncneEspecialCndos() {
		return this.fncneEspecialCndos;
	}

	public void setFncneEspecialCndos(Set<FncneEspecialCndo> fncneEspecialCndos) {
		this.fncneEspecialCndos = fncneEspecialCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<PrpreFrmroSnlSaldo> getPrpreFrmroSnlSaldos() {
		return this.prpreFrmroSnlSaldos;
	}

	public void setPrpreFrmroSnlSaldos(Set<PrpreFrmroSnlSaldo> prpreFrmroSnlSaldos) {
		this.prpreFrmroSnlSaldos = prpreFrmroSnlSaldos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<TipoExtracaoCndo> getTipoExtracaoCndos() {
		return this.tipoExtracaoCndos;
	}

	public void setTipoExtracaoCndos(Set<TipoExtracaoCndo> tipoExtracaoCndos) {
		this.tipoExtracaoCndos = tipoExtracaoCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<ClassificacaoCndo> getClassificacaoCndos() {
		return this.classificacaoCndos;
	}

	public void setClassificacaoCndos(Set<ClassificacaoCndo> classificacaoCndos) {
		this.classificacaoCndos = classificacaoCndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifSrvcoPrpreFrmro")
	public Set<PrioridadeConteudo> getPrioridadeConteudos() {
		return this.prioridadeConteudos;
	}

	public void setPrioridadeConteudos(Set<PrioridadeConteudo> prioridadeConteudos) {
		this.prioridadeConteudos = prioridadeConteudos;
	}

}
