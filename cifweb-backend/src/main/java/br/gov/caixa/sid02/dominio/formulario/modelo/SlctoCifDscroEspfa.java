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
 * SlctoCifDscroEspfa
 */
@Entity
@Table(name = "D02TB252_SLCTO_CIF_DSCRO_ESPFA")
public class SlctoCifDscroEspfa implements java.io.Serializable {private static final long serialVersionUID = 1L;

	private SlctoCifDscroEspfaId id;
	private SlctoManutencaoCif slctoManutencaoCif;
	private Date fimVigencia;
	private String coUsuario;
	private String noCif;
	private String noAbreviadoCif;
	private String noReduzidoCif;

	public SlctoCifDscroEspfa() {
	}

	public SlctoCifDscroEspfa(SlctoCifDscroEspfaId id, SlctoManutencaoCif slctoManutencaoCif, String coUsuario,
			String noCif, String noAbreviadoCif, String noReduzidoCif) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.coUsuario = coUsuario;
		this.noCif = noCif;
		this.noAbreviadoCif = noAbreviadoCif;
		this.noReduzidoCif = noReduzidoCif;
	}

	public SlctoCifDscroEspfa(SlctoCifDscroEspfaId id, SlctoManutencaoCif slctoManutencaoCif, Date fimVigencia,
			String coUsuario, String noCif, String noAbreviadoCif, String noReduzidoCif) {
		this.id = id;
		this.slctoManutencaoCif = slctoManutencaoCif;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
		this.noCif = noCif;
		this.noAbreviadoCif = noAbreviadoCif;
		this.noReduzidoCif = noReduzidoCif;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_200", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "nuSqnclSlctoMntnoCif", column = @Column(name = "NU_SQNCL_SLCTO_MNTNO_CIF_250", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public SlctoCifDscroEspfaId getId() {
		return this.id;
	}

	public void setId(SlctoCifDscroEspfaId id) {
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

	@Column(name = "NO_CIF", nullable = false, length = 60)
	public String getNoCif() {
		return this.noCif;
	}

	public void setNoCif(String noCif) {
		this.noCif = noCif;
	}

	@Column(name = "NO_ABREVIADO_CIF", nullable = false, length = 25)
	public String getNoAbreviadoCif() {
		return this.noAbreviadoCif;
	}

	public void setNoAbreviadoCif(String noAbreviadoCif) {
		this.noAbreviadoCif = noAbreviadoCif;
	}

	@Column(name = "NO_REDUZIDO_CIF", nullable = false, length = 10)
	public String getNoReduzidoCif() {
		return this.noReduzidoCif;
	}

	public void setNoReduzidoCif(String noReduzidoCif) {
		this.noReduzidoCif = noReduzidoCif;
	}

}
