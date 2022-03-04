package com.github.danilolopesabreu.domain.formulario;


import com.github.danilolopesabreu.domain.parametro.CifServico;
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
 * SlctoManutencaoCif
 */
@Entity
@Table(name = "D02TB250_SLCTO_MANUTENCAO_CIF")
public class SlctoManutencaoCif implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private SlctoManutencaoCifId id;
	private CifServico cifServico;
	private Date inicioVigencia;
	private Date fimVigencia;
	private String coUsuario;
	private Set<SlctoCifDscroEspfa> slctoCifDscroEspfas = new HashSet<SlctoCifDscroEspfa>(0);
	private Set<DetalheDebitoSlndo> detalheDebitoSlndos = new HashSet<DetalheDebitoSlndo>(0);
	private Set<ClassificacaoSlndo> classificacaoSlndos = new HashSet<ClassificacaoSlndo>(0);
	private Set<CmptoFncneEspecial> cmptoFncneEspecials = new HashSet<CmptoFncneEspecial>(0);
	private Set<Sistema> sistemas = new HashSet<Sistema>(0);
	private Set<FncneEspecialSlndo> fncneEspecialSlndos = new HashSet<FncneEspecialSlndo>(0);
	private Set<MvmnoEspontanea> mvmnoEspontaneas = new HashSet<MvmnoEspontanea>(0);
	private Set<Canal> canals = new HashSet<Canal>(0);
	private Set<TipoExtracaoSlndo> tipoExtracaoSlndos = new HashSet<TipoExtracaoSlndo>(0);
	private Set<Saldo> saldos = new HashSet<Saldo>(0);
	private Set<Custo> custos = new HashSet<Custo>(0);
	private Set<TipoPrioridadeSlndo> tipoPrioridadeSlndos = new HashSet<TipoPrioridadeSlndo>(0);
	private Set<RsrvaSocialSlndo> rsrvaSocialSlndos = new HashSet<RsrvaSocialSlndo>(0);
	private Set<DmndaSlctoMntnoCif> dmndaSlctoMntnoCifs = new HashSet<DmndaSlctoMntnoCif>(0);
	private Set<SituacaoCif> situacaoCifs = new HashSet<SituacaoCif>(0);
	private Set<SituacaoMotivo> situacaoMotivos = new HashSet<SituacaoMotivo>(0);
	private Set<PacoteTarifa> pacoteTarifas = new HashSet<PacoteTarifa>(0);
	private Set<SlctoCifDscroGeral> slctoCifDscroGerals = new HashSet<SlctoCifDscroGeral>(0);
	private Set<ProdutoPropriedade> produtoPropriedades = new HashSet<ProdutoPropriedade>(0);

	public SlctoManutencaoCif() {
	}

	public SlctoManutencaoCif(SlctoManutencaoCifId id, CifServico cifServico, Date inicioVigencia, String coUsuario) {
		this.id = id;
		this.cifServico = cifServico;
		this.inicioVigencia = inicioVigencia;
		this.coUsuario = coUsuario;
	}

	public SlctoManutencaoCif(SlctoManutencaoCifId id, CifServico cifServico, Date inicioVigencia, Date fimVigencia,
			String coUsuario, Set<SlctoCifDscroEspfa> slctoCifDscroEspfas, Set<DetalheDebitoSlndo> detalheDebitoSlndos,
			Set<ClassificacaoSlndo> classificacaoSlndos, Set<CmptoFncneEspecial> cmptoFncneEspecials,
			Set<Sistema> sistemas, Set<FncneEspecialSlndo> fncneEspecialSlndos, Set<MvmnoEspontanea> mvmnoEspontaneas,
			Set<Canal> canals, Set<TipoExtracaoSlndo> tipoExtracaoSlndos, Set<Saldo> saldos, Set<Custo> custos,
			Set<TipoPrioridadeSlndo> tipoPrioridadeSlndos, Set<RsrvaSocialSlndo> rsrvaSocialSlndos,
			Set<DmndaSlctoMntnoCif> dmndaSlctoMntnoCifs, Set<SituacaoCif> situacaoCifs,
			Set<SituacaoMotivo> situacaoMotivos, Set<PacoteTarifa> pacoteTarifas,
			Set<SlctoCifDscroGeral> slctoCifDscroGerals, Set<ProdutoPropriedade> produtoPropriedades) {
		this.id = id;
		this.cifServico = cifServico;
		this.inicioVigencia = inicioVigencia;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
		this.slctoCifDscroEspfas = slctoCifDscroEspfas;
		this.detalheDebitoSlndos = detalheDebitoSlndos;
		this.classificacaoSlndos = classificacaoSlndos;
		this.cmptoFncneEspecials = cmptoFncneEspecials;
		this.sistemas = sistemas;
		this.fncneEspecialSlndos = fncneEspecialSlndos;
		this.mvmnoEspontaneas = mvmnoEspontaneas;
		this.canals = canals;
		this.tipoExtracaoSlndos = tipoExtracaoSlndos;
		this.saldos = saldos;
		this.custos = custos;
		this.tipoPrioridadeSlndos = tipoPrioridadeSlndos;
		this.rsrvaSocialSlndos = rsrvaSocialSlndos;
		this.dmndaSlctoMntnoCifs = dmndaSlctoMntnoCifs;
		this.situacaoCifs = situacaoCifs;
		this.situacaoMotivos = situacaoMotivos;
		this.pacoteTarifas = pacoteTarifas;
		this.slctoCifDscroGerals = slctoCifDscroGerals;
		this.produtoPropriedades = produtoPropriedades;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuSqnclSlctoMntnoCif", column = @Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)) })
	public SlctoManutencaoCifId getId() {
		return this.id;
	}

	public void setId(SlctoManutencaoCifId id) {
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<SlctoCifDscroEspfa> getSlctoCifDscroEspfas() {
		return this.slctoCifDscroEspfas;
	}

	public void setSlctoCifDscroEspfas(Set<SlctoCifDscroEspfa> slctoCifDscroEspfas) {
		this.slctoCifDscroEspfas = slctoCifDscroEspfas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<DetalheDebitoSlndo> getDetalheDebitoSlndos() {
		return this.detalheDebitoSlndos;
	}

	public void setDetalheDebitoSlndos(Set<DetalheDebitoSlndo> detalheDebitoSlndos) {
		this.detalheDebitoSlndos = detalheDebitoSlndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<ClassificacaoSlndo> getClassificacaoSlndos() {
		return this.classificacaoSlndos;
	}

	public void setClassificacaoSlndos(Set<ClassificacaoSlndo> classificacaoSlndos) {
		this.classificacaoSlndos = classificacaoSlndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<CmptoFncneEspecial> getCmptoFncneEspecials() {
		return this.cmptoFncneEspecials;
	}

	public void setCmptoFncneEspecials(Set<CmptoFncneEspecial> cmptoFncneEspecials) {
		this.cmptoFncneEspecials = cmptoFncneEspecials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<Sistema> getSistemas() {
		return this.sistemas;
	}

	public void setSistemas(Set<Sistema> sistemas) {
		this.sistemas = sistemas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<FncneEspecialSlndo> getFncneEspecialSlndos() {
		return this.fncneEspecialSlndos;
	}

	public void setFncneEspecialSlndos(Set<FncneEspecialSlndo> fncneEspecialSlndos) {
		this.fncneEspecialSlndos = fncneEspecialSlndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<MvmnoEspontanea> getMvmnoEspontaneas() {
		return this.mvmnoEspontaneas;
	}

	public void setMvmnoEspontaneas(Set<MvmnoEspontanea> mvmnoEspontaneas) {
		this.mvmnoEspontaneas = mvmnoEspontaneas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<Canal> getCanals() {
		return this.canals;
	}

	public void setCanals(Set<Canal> canals) {
		this.canals = canals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<TipoExtracaoSlndo> getTipoExtracaoSlndos() {
		return this.tipoExtracaoSlndos;
	}

	public void setTipoExtracaoSlndos(Set<TipoExtracaoSlndo> tipoExtracaoSlndos) {
		this.tipoExtracaoSlndos = tipoExtracaoSlndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<Saldo> getSaldos() {
		return this.saldos;
	}

	public void setSaldos(Set<Saldo> saldos) {
		this.saldos = saldos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<Custo> getCustos() {
		return this.custos;
	}

	public void setCustos(Set<Custo> custos) {
		this.custos = custos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<TipoPrioridadeSlndo> getTipoPrioridadeSlndos() {
		return this.tipoPrioridadeSlndos;
	}

	public void setTipoPrioridadeSlndos(Set<TipoPrioridadeSlndo> tipoPrioridadeSlndos) {
		this.tipoPrioridadeSlndos = tipoPrioridadeSlndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<RsrvaSocialSlndo> getRsrvaSocialSlndos() {
		return this.rsrvaSocialSlndos;
	}

	public void setRsrvaSocialSlndos(Set<RsrvaSocialSlndo> rsrvaSocialSlndos) {
		this.rsrvaSocialSlndos = rsrvaSocialSlndos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<DmndaSlctoMntnoCif> getDmndaSlctoMntnoCifs() {
		return this.dmndaSlctoMntnoCifs;
	}

	public void setDmndaSlctoMntnoCifs(Set<DmndaSlctoMntnoCif> dmndaSlctoMntnoCifs) {
		this.dmndaSlctoMntnoCifs = dmndaSlctoMntnoCifs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<SituacaoCif> getSituacaoCifs() {
		return this.situacaoCifs;
	}

	public void setSituacaoCifs(Set<SituacaoCif> situacaoCifs) {
		this.situacaoCifs = situacaoCifs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<SituacaoMotivo> getSituacaoMotivos() {
		return this.situacaoMotivos;
	}

	public void setSituacaoMotivos(Set<SituacaoMotivo> situacaoMotivos) {
		this.situacaoMotivos = situacaoMotivos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<PacoteTarifa> getPacoteTarifas() {
		return this.pacoteTarifas;
	}

	public void setPacoteTarifas(Set<PacoteTarifa> pacoteTarifas) {
		this.pacoteTarifas = pacoteTarifas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<SlctoCifDscroGeral> getSlctoCifDscroGerals() {
		return this.slctoCifDscroGerals;
	}

	public void setSlctoCifDscroGerals(Set<SlctoCifDscroGeral> slctoCifDscroGerals) {
		this.slctoCifDscroGerals = slctoCifDscroGerals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slctoManutencaoCif")
	public Set<ProdutoPropriedade> getProdutoPropriedades() {
		return this.produtoPropriedades;
	}

	public void setProdutoPropriedades(Set<ProdutoPropriedade> produtoPropriedades) {
		this.produtoPropriedades = produtoPropriedades;
	}

}
