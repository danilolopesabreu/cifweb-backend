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
 * CifComplemento
 */
@Entity
@Table(name = "D02TB201_CIF_COMPLEMENTO")
public class CifComplemento implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private CifComplementoId id;
	private CifServico cifServicoByFkD02tb201D02tb2002;
	private CifServico cifServicoByFkD02tb201D02tb2001;
	private TipoVinculo tipoVinculo;
	private String icMandatorio;
	private Date fimVigencia;
	private String coUsuario;

	public CifComplemento() {
	}

	public CifComplemento(CifComplementoId id, CifServico cifServicoByFkD02tb201D02tb2002,
			CifServico cifServicoByFkD02tb201D02tb2001, TipoVinculo tipoVinculo, String icMandatorio,
			String coUsuario) {
		this.id = id;
		this.cifServicoByFkD02tb201D02tb2002 = cifServicoByFkD02tb201D02tb2002;
		this.cifServicoByFkD02tb201D02tb2001 = cifServicoByFkD02tb201D02tb2001;
		this.tipoVinculo = tipoVinculo;
		this.icMandatorio = icMandatorio;
		this.coUsuario = coUsuario;
	}

	public CifComplemento(CifComplementoId id, CifServico cifServicoByFkD02tb201D02tb2002,
			CifServico cifServicoByFkD02tb201D02tb2001, TipoVinculo tipoVinculo, String icMandatorio, Date fimVigencia,
			String coUsuario) {
		this.id = id;
		this.cifServicoByFkD02tb201D02tb2002 = cifServicoByFkD02tb201D02tb2002;
		this.cifServicoByFkD02tb201D02tb2001 = cifServicoByFkD02tb201D02tb2001;
		this.tipoVinculo = tipoVinculo;
		this.icMandatorio = icMandatorio;
		this.fimVigencia = fimVigencia;
		this.coUsuario = coUsuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcaoVinculador", column = @Column(name = "NU_ACAO_VINCULADOR_200", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuModoVinculador", column = @Column(name = "NU_MODO_VINCULADOR_200", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuGrupoVinculador", column = @Column(name = "NU_GRUPO_VINCULADOR_200", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuSqnclCifSrvcoVnclr", column = @Column(name = "NU_SQNCL_CIF_SRVCO_VNCLR_200", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "inicioVigencia", column = @Column(name = "DT_INICIO_VIGENCIA", nullable = false, length = 7)) })
	public CifComplementoId getId() {
		return this.id;
	}

	public void setId(CifComplementoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NU_ACAO_VINCULADO_200", referencedColumnName = "NU_ACAO_P15", nullable = false),
			@JoinColumn(name = "NU_MODO_VINCULADO_200", referencedColumnName = "NU_MODO_P15", nullable = false),
			@JoinColumn(name = "NU_GRUPO_VINCULADO_200", referencedColumnName = "NU_GRUPO_P15", nullable = false),
			@JoinColumn(name = "NU_SQNCL_CIF_SRVCO_VNCDO_200", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO", nullable = false) })
	public CifServico getCifServicoByFkD02tb201D02tb2002() {
		return this.cifServicoByFkD02tb201D02tb2002;
	}

	public void setCifServicoByFkD02tb201D02tb2002(CifServico cifServicoByFkD02tb201D02tb2002) {
		this.cifServicoByFkD02tb201D02tb2002 = cifServicoByFkD02tb201D02tb2002;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NU_ACAO_VINCULADOR_200", referencedColumnName = "NU_ACAO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_MODO_VINCULADOR_200", referencedColumnName = "NU_MODO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_GRUPO_VINCULADOR_200", referencedColumnName = "NU_GRUPO_P15", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NU_SQNCL_CIF_SRVCO_VNCLR_200", referencedColumnName = "NU_SEQUENCIAL_CIF_SERVICO", nullable = false, insertable = false, updatable = false) })
	public CifServico getCifServicoByFkD02tb201D02tb2001() {
		return this.cifServicoByFkD02tb201D02tb2001;
	}

	public void setCifServicoByFkD02tb201D02tb2001(CifServico cifServicoByFkD02tb201D02tb2001) {
		this.cifServicoByFkD02tb201D02tb2001 = cifServicoByFkD02tb201D02tb2001;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NU_TIPO_VINCULO_204", nullable = false)
	public TipoVinculo getTipoVinculo() {
		return this.tipoVinculo;
	}

	public void setTipoVinculo(TipoVinculo tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	@Column(name = "IC_MANDATORIO", nullable = false, length = 1)
	public String getIcMandatorio() {
		return this.icMandatorio;
	}

	public void setIcMandatorio(String icMandatorio) {
		this.icMandatorio = icMandatorio;
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
