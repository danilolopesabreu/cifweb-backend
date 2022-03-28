package br.gov.caixa.sid02.dominio.parametro.modelo;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gov.caixa.sid02.dominio.formulario.modelo.SlctoManutencaoCif;

/**
 * CifServico
 */
@Entity
@Table(name = "D02TB200_CIF_SERVICO")
public class CifServico implements java.io.Serializable { private static final long serialVersionUID = 1L;

	private CifServicoId id;
	private Short nuSubgrupo;
	private Short nuTipo;
	private Short nuSubtipo;
	private String icServicoPrincipal;
	private String noServico;
	private Set<CifCoreografia> cifCoreografias = new HashSet<CifCoreografia>(0);
	private Set<CifComplemento> cifComplementosForFkD02tb201D02tb2002 = new HashSet<CifComplemento>(0);
	private Set<SlctoManutencaoCif> slctoManutencaoCifs = new HashSet<SlctoManutencaoCif>(0);
	private Set<CifComplemento> cifComplementosForFkD02tb201D02tb2001 = new HashSet<CifComplemento>(0);
	private Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros = new HashSet<CifSrvcoPrpreFrmro>(0);

	public CifServico() {
	}

	public CifServico(CifServicoId id, String icServicoPrincipal, String noServico) {
		this.id = id;
		this.icServicoPrincipal = icServicoPrincipal;
		this.noServico = noServico;
	}

	public CifServico(CifServicoId id, Short nuSubgrupo, Short nuTipo, Short nuSubtipo, String icServicoPrincipal,
			String noServico, Set<CifCoreografia> cifCoreografias,
			Set<CifComplemento> cifComplementosForFkD02tb201D02tb2002, Set<SlctoManutencaoCif> slctoManutencaoCifs,
			Set<CifComplemento> cifComplementosForFkD02tb201D02tb2001, Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros) {
		this.id = id;
		this.nuSubgrupo = nuSubgrupo;
		this.nuTipo = nuTipo;
		this.nuSubtipo = nuSubtipo;
		this.icServicoPrincipal = icServicoPrincipal;
		this.noServico = noServico;
		this.cifCoreografias = cifCoreografias;
		this.cifComplementosForFkD02tb201D02tb2002 = cifComplementosForFkD02tb201D02tb2002;
		this.slctoManutencaoCifs = slctoManutencaoCifs;
		this.cifComplementosForFkD02tb201D02tb2001 = cifComplementosForFkD02tb201D02tb2001;
		this.cifSrvcoPrpreFrmros = cifSrvcoPrpreFrmros;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "nuAcao", column = @Column(name = "NU_ACAO_P15", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuModo", column = @Column(name = "NU_MODO_P15", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuGrupo", column = @Column(name = "NU_GRUPO_P15", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nuSequencialCifServico", column = @Column(name = "NU_SEQUENCIAL_CIF_SERVICO", nullable = false, precision = 9, scale = 0)) })
	public CifServicoId getId() {
		return this.id;
	}

	public void setId(CifServicoId id) {
		this.id = id;
	}

	@Column(name = "NU_SUBGRUPO_P15", precision = 3, scale = 0)
	public Short getNuSubgrupo() {
		return this.nuSubgrupo;
	}

	public void setNuSubgrupo(Short nuSubgrupo) {
		this.nuSubgrupo = nuSubgrupo;
	}

	@Column(name = "NU_TIPO_P15", precision = 3, scale = 0)
	public Short getNuTipo() {
		return this.nuTipo;
	}

	public void setNuTipo(Short nuTipo) {
		this.nuTipo = nuTipo;
	}

	@Column(name = "NU_SUBTIPO_P15", precision = 3, scale = 0)
	public Short getNuSubtipo() {
		return this.nuSubtipo;
	}

	public void setNuSubtipo(Short nuSubtipo) {
		this.nuSubtipo = nuSubtipo;
	}

	@Column(name = "IC_SERVICO_PRINCIPAL", nullable = false, length = 1)
	public String getIcServicoPrincipal() {
		return this.icServicoPrincipal;
	}

	public void setIcServicoPrincipal(String icServicoPrincipal) {
		this.icServicoPrincipal = icServicoPrincipal;
	}

	@Column(name = "NO_SERVICO", nullable = false, length = 80)
	public String getNoServico() {
		return this.noServico;
	}

	public void setNoServico(String noServico) {
		this.noServico = noServico;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifServico")
	public Set<CifCoreografia> getCifCoreografias() {
		return this.cifCoreografias;
	}

	public void setCifCoreografias(Set<CifCoreografia> cifCoreografias) {
		this.cifCoreografias = cifCoreografias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifServicoByFkD02tb201D02tb2002")
	public Set<CifComplemento> getCifComplementosForFkD02tb201D02tb2002() {
		return this.cifComplementosForFkD02tb201D02tb2002;
	}

	public void setCifComplementosForFkD02tb201D02tb2002(Set<CifComplemento> cifComplementosForFkD02tb201D02tb2002) {
		this.cifComplementosForFkD02tb201D02tb2002 = cifComplementosForFkD02tb201D02tb2002;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifServico")
	public Set<SlctoManutencaoCif> getSlctoManutencaoCifs() {
		return this.slctoManutencaoCifs;
	}

	public void setSlctoManutencaoCifs(Set<SlctoManutencaoCif> slctoManutencaoCifs) {
		this.slctoManutencaoCifs = slctoManutencaoCifs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifServicoByFkD02tb201D02tb2001")
	public Set<CifComplemento> getCifComplementosForFkD02tb201D02tb2001() {
		return this.cifComplementosForFkD02tb201D02tb2001;
	}

	public void setCifComplementosForFkD02tb201D02tb2001(Set<CifComplemento> cifComplementosForFkD02tb201D02tb2001) {
		this.cifComplementosForFkD02tb201D02tb2001 = cifComplementosForFkD02tb201D02tb2001;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cifServico")
	public Set<CifSrvcoPrpreFrmro> getCifSrvcoPrpreFrmros() {
		return this.cifSrvcoPrpreFrmros;
	}

	public void setCifSrvcoPrpreFrmros(Set<CifSrvcoPrpreFrmro> cifSrvcoPrpreFrmros) {
		this.cifSrvcoPrpreFrmros = cifSrvcoPrpreFrmros;
	}

	public CifServico(CifServicoId id, Short nuSubgrupo, Short nuTipo, Short nuSubtipo, String icServicoPrincipal,
			String noServico) {
		super();
		this.id = id;
		this.nuSubgrupo = nuSubgrupo;
		this.nuTipo = nuTipo;
		this.nuSubtipo = nuSubtipo;
		this.icServicoPrincipal = icServicoPrincipal;
		this.noServico = noServico;
	}

}
