package br.gov.caixa.sid02.aplicacao.parametro.cifservico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifCoreografiaDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifServicoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifSrvcoPrpreFrmroDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.SlctoManutencaoCifDto;
import br.gov.caixa.sid02.dominio.formulario.modelo.SlctoManutencaoCif;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifCoreografia;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifSrvcoPrpreFrmro;

@Mapper(componentModel = "cdi")
public interface CifServicoMapper {
	
	CifServicoDto fromCifServico(CifServico cifServico);
	
	CifServico toCifServico(CifServicoDto cifServicoDto);
	
	List<CifServicoDto> fromListCifServico(List<CifServico> cifServico);
	
	List<CifServico> toListCifServico(List<CifServicoDto> cifServicoDto);
	
	CifCoreografiaDto map(CifCoreografia value);
	
	CifSrvcoPrpreFrmroDto map(CifSrvcoPrpreFrmro value);
	
	SlctoManutencaoCifDto map(SlctoManutencaoCif value);
}
