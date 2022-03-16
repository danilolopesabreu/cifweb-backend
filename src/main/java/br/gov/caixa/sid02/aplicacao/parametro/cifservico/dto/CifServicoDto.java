package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.json.bind.annotation.JsonbTransient;

public class CifServicoDto {

	private String noServico;
	private CifServicoIdDto id;
	private Short nuSubgrupo;
	private Short nuTipo;
	private Short nuSubtipo;
	private char icServicoPrincipal;
	private Set<CifComplementoDto> complementos = new HashSet<CifComplementoDto>(0);
	@JsonbTransient
	private Set<CifComplementoDto> cifComplementosForFkD02tb201D02tb200Vncdo = new HashSet<CifComplementoDto>(0);
	private Set<CifCoreografiaDto> cifCoreografias = new HashSet<CifCoreografiaDto>(0);
	private Set<CifSrvcoPrpreFrmroDto> cifSrvcoPrpreFrmros = new HashSet<CifSrvcoPrpreFrmroDto>(0);
	private Set<SlctoManutencaoCifDto> slctoManutencaoCifs = new HashSet<SlctoManutencaoCifDto>(0);

	public CifServicoDto() {
	}

	public CifServicoDto(CifServicoIdDto id) {
		super();
		this.id = id;
	}

	public String getNoServico() {
		return noServico;
	}

	public void setNoServico(String noServico) {
		this.noServico = noServico;
	}

	public CifServicoIdDto getId() {
		return id;
	}

	public void setId(CifServicoIdDto id) {
		this.id = id;
	}

	public Short getNuSubgrupo() {
		return nuSubgrupo;
	}

	public void setNuSubgrupo(Short nuSubgrupo) {
		this.nuSubgrupo = nuSubgrupo;
	}

	public Short getNuTipo() {
		return nuTipo;
	}

	public void setNuTipo(Short nuTipo) {
		this.nuTipo = nuTipo;
	}

	public Short getNuSubtipo() {
		return nuSubtipo;
	}

	public void setNuSubtipo(Short nuSubtipo) {
		this.nuSubtipo = nuSubtipo;
	}

	public char getIcServicoPrincipal() {
		return icServicoPrincipal;
	}

	public void setIcServicoPrincipal(char icServicoPrincipal) {
		this.icServicoPrincipal = icServicoPrincipal;
	}

	public Set<CifComplementoDto> getComplementos() {
		return complementos;
	}

	public void setComplementos(Set<CifComplementoDto> complementos) {
		this.complementos = complementos;
	}

	public Set<CifComplementoDto> getCifComplementosForFkD02tb201D02tb200Vncdo() {
		return cifComplementosForFkD02tb201D02tb200Vncdo;
	}

	public void setCifComplementosForFkD02tb201D02tb200Vncdo(
			Set<CifComplementoDto> cifComplementosForFkD02tb201D02tb200Vncdo) {
		this.cifComplementosForFkD02tb201D02tb200Vncdo = cifComplementosForFkD02tb201D02tb200Vncdo;
	}

	public Set<CifCoreografiaDto> getCifCoreografias() {
		return cifCoreografias;
	}

	public void setCifCoreografias(Set<CifCoreografiaDto> cifCoreografias) {
		this.cifCoreografias = cifCoreografias;
	}

	public Set<CifSrvcoPrpreFrmroDto> getCifSrvcoPrpreFrmros() {
		return cifSrvcoPrpreFrmros;
	}

	public void setCifSrvcoPrpreFrmros(Set<CifSrvcoPrpreFrmroDto> cifSrvcoPrpreFrmros) {
		this.cifSrvcoPrpreFrmros = cifSrvcoPrpreFrmros;
	}

	public Set<SlctoManutencaoCifDto> getSlctoManutencaoCifs() {
		return slctoManutencaoCifs;
	}

	public void setSlctoManutencaoCifs(Set<SlctoManutencaoCifDto> slctoManutencaoCifs) {
		this.slctoManutencaoCifs = slctoManutencaoCifs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nuSubgrupo, nuSubtipo, nuTipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CifServicoDto other = (CifServicoDto) obj;
		return Objects.equals(id, other.id) && Objects.equals(nuSubgrupo, other.nuSubgrupo)
				&& Objects.equals(nuSubtipo, other.nuSubtipo) && Objects.equals(nuTipo, other.nuTipo);
	}

}
