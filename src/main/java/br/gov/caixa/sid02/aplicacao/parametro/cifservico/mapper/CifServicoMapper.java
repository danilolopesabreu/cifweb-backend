package br.gov.caixa.sid02.aplicacao.parametro.cifservico.mapper;

import java.util.List;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.gov.caixa.sid02.aplicacao.dto.mapper.CycleAvoidingMappingContext;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CanalConteudoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifComplementoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifCoreografiaDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifServicoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifSrvcoPrpreFrmroDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.ClassificacaoCndoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.DetalheDebitoCndoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.FncneEspecialCndoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.PrioridadeConteudoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.PrpreFrmroSnlSaldoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.SaldoRsrvaSclCndoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.SistemaConteudoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.SlctoManutencaoCifDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.TipoConteudoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.TipoExtracaoCndoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.TipoPrpreFrmroDto;
import br.gov.caixa.sid02.dominio.formulario.modelo.SlctoManutencaoCif;
import br.gov.caixa.sid02.dominio.parametro.modelo.CanalConteudo;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifCoreografia;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifSrvcoPrpreFrmro;
import br.gov.caixa.sid02.dominio.parametro.modelo.ClassificacaoCndo;
import br.gov.caixa.sid02.dominio.parametro.modelo.DetalheDebitoCndo;
import br.gov.caixa.sid02.dominio.parametro.modelo.FncneEspecialCndo;
import br.gov.caixa.sid02.dominio.parametro.modelo.PrioridadeConteudo;
import br.gov.caixa.sid02.dominio.parametro.modelo.PrpreFrmroSnlSaldo;
import br.gov.caixa.sid02.dominio.parametro.modelo.SaldoRsrvaSclCndo;
import br.gov.caixa.sid02.dominio.parametro.modelo.SistemaConteudo;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoConteudo;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoExtracaoCndo;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoPrpreFrmro;

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
	
	TipoPrpreFrmroDto map(TipoPrpreFrmro value);

	TipoConteudoDto map(TipoConteudo value);

	SistemaConteudoDto map(SistemaConteudo value);

	CanalConteudoDto map(CanalConteudo value);

	SaldoRsrvaSclCndoDto map(SaldoRsrvaSclCndo value);

	DetalheDebitoCndoDto map(DetalheDebitoCndo value);

	FncneEspecialCndoDto map(FncneEspecialCndo value);

	PrpreFrmroSnlSaldoDto map(PrpreFrmroSnlSaldo value);

	TipoExtracaoCndoDto map(TipoExtracaoCndo value);

	ClassificacaoCndoDto map(ClassificacaoCndo value);

	PrioridadeConteudoDto map(PrioridadeConteudo value);
}
