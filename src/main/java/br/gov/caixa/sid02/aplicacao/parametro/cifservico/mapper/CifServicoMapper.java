package br.gov.caixa.sid02.aplicacao.parametro.cifservico.mapper;

import java.util.List;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.gov.caixa.sid02.aplicacao.dto.mapper.CycleAvoidingMappingContext;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifComplementoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifCoreografiaDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifServicoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifSrvcoPrpreFrmroDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.SlctoManutencaoCifDto;
import br.gov.caixa.sid02.dominio.formulario.modelo.SlctoManutencaoCif;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifCoreografia;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifSrvcoPrpreFrmro;

@Mapper(componentModel = "cdi")
public interface CifServicoMapper {
	
	@Mapping(target = "complementos", source = "cifComplementosForFkD02tb201D02tb200Vnclr")
	CifServicoDto fromCifServico(CifServico cifServico, @Context CycleAvoidingMappingContext context);
	 
	CifServico toCifServico(CifServicoDto cifServicoDto);
	
	List<CifServicoDto> fromListCifServico(List<CifServico> cifServicos);
	
	List<CifServico> toListCifServico(List<CifServicoDto> cifServicoDtos);
	
	List<CifComplementoDto> fromCifComplemento(List<CifComplemento> cifComplemento);
	
	@Mapping(target = "cifServicoVinculado", source = "cifServicoByFkD02tb201D02tb200Vncdo")
	CifComplementoDto cifComplementoToCifComplementoDto(CifComplemento cifComplemento, @Context CycleAvoidingMappingContext context);

	CifCoreografiaDto map(CifCoreografia cifCoreografia);
	
	CifSrvcoPrpreFrmroDto map(CifSrvcoPrpreFrmro cifSrvcoPrpreFrmro);
	
	SlctoManutencaoCifDto map(SlctoManutencaoCif slctoManutencaoCif);
}
