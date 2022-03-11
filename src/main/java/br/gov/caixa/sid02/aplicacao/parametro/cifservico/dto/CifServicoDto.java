package br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto;

import java.util.HashSet;
import java.util.Set;

public class CifServicoDto {

	private CifServicoIdDto id;
	private Short nuSubgrupo;
	private Short nuTipo;
	private Short nuSubtipo;
	private char icServicoPrincipal;
	private String noServico;
	private Set<CifComplementoDto> cifComplementosForFkD02tb201D02tb200Vnclr = new HashSet<CifComplementoDto>(0);
	private Set<CifComplementoDto> cifComplementosForFkD02tb201D02tb200Vncdo = new HashSet<CifComplementoDto>(0);
	private Set<CifCoreografiaDto> cifCoreografias = new HashSet<CifCoreografiaDto>(0);
	private Set<CifSrvcoPrpreFrmroDto> cifSrvcoPrpreFrmros = new HashSet<CifSrvcoPrpreFrmroDto>(0);
	private Set<SlctoManutencaoCifDto> slctoManutencaoCifs = new HashSet<SlctoManutencaoCifDto>(0);

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

	public String getNoServico() {
		return noServico;
	}

	public void setNoServico(String noServico) {
		this.noServico = noServico;
	}

	public Set<CifComplementoDto> getCifComplementosForFkD02tb201D02tb200Vnclr() {
		return cifComplementosForFkD02tb201D02tb200Vnclr;
	}

	public void setCifComplementosForFkD02tb201D02tb200Vnclr(
			Set<CifComplementoDto> cifComplementosForFkD02tb201D02tb200Vnclr) {
		this.cifComplementosForFkD02tb201D02tb200Vnclr = cifComplementosForFkD02tb201D02tb200Vnclr;
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

}
