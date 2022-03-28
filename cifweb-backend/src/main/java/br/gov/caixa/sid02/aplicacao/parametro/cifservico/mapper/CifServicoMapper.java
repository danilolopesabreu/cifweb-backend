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
	
	@Mapping(target = "complementos", source = "cifComplementosForFkD02tb201D02tb2001")
	CifServicoDto fromCifServico(CifServico cifServico, @Context CycleAvoidingMappingContext context);
	 
	CifServico toCifServico(CifServicoDto cifServicoDto);
	
	List<CifServicoDto> fromListCifServico(List<CifServico> cifServicos);
	
	List<CifServico> toListCifServico(List<CifServicoDto> cifServicoDtos);
	
	List<CifComplementoDto> fromCifComplemento(List<CifComplemento> cifComplemento);
	
	@Mapping(target = "cifServicoVinculado", source = "cifServicoByFkD02tb201D02tb2002")
	CifComplementoDto cifComplementoToCifComplementoDto(CifComplemento cifComplemento, @Context CycleAvoidingMappingContext context);

	@Mapping(target = "nuFaixa", source = "id.nuFaixa")
	@Mapping(target = "nuCoreografia", source = "id.nuCoreografia")
	@Mapping(target = "nuPacote", source = "id.nuPacote")
	CifCoreografiaDto map(CifCoreografia cifCoreografia);
	
	CifSrvcoPrpreFrmroDto map(CifSrvcoPrpreFrmro cifSrvcoPrpreFrmro);
	
	SlctoManutencaoCifDto map(SlctoManutencaoCif slctoManutencaoCif);
	
	TipoPrpreFrmroDto map(TipoPrpreFrmro value);

	TipoConteudoDto map(TipoConteudo value);

	@Mapping(target = "nuSegmento", source = "id.nuSegmento")
	SistemaConteudoDto map(SistemaConteudo value);

	@Mapping(target = "nuCanalComercializacao", source = "id.nuCanalComercializacao")
	CanalConteudoDto map(CanalConteudo value);

	@Mapping(target = "nuAtrzaSldoRsrvaScl", source = "id.nuAtrzaSldoRsrvaScl")
	@Mapping(target = "nuTipoAtrzaSaldoRsrvaScl", source = "saldoReservaSocial.nuTipoAtrzaSaldoRsrvaScl")
	@Mapping(target = "deTipoAtrzaSaldoRsrvaScl", source = "saldoReservaSocial.deTipoAtrzaSaldoRsrvaScl")
	SaldoRsrvaSclCndoDto map(SaldoRsrvaSclCndo value);

	@Mapping(target = "nuTipoDetalheDebito", source = "tipoDetalheDebito.nuTipoDetalheDebito")
	@Mapping(target = "deTipoDetalheDebito", source = "tipoDetalheDebito.deTipoDetalheDebito")
	DetalheDebitoCndoDto map(DetalheDebitoCndo value);

	@Mapping(target = "nuFuncionalidadeEspecial", source = "id.nuFuncionalidadeEspecial")
	FncneEspecialCndoDto map(FncneEspecialCndo value);

	PrpreFrmroSnlSaldoDto map(PrpreFrmroSnlSaldo value);

	@Mapping(target = "nuTipoExtracao", source = "id.nuTipoExtracao")
	@Mapping(target = "coTipoExtracao", source = "tipoExtracao.coTipoExtracao")
	@Mapping(target = "noTipoExtracao", source = "tipoExtracao.noTipoExtracao")
	TipoExtracaoCndoDto map(TipoExtracaoCndo value);

	@Mapping(target = "nuClassificacaoLncmo", source = "id.nuClassificacaoLncmo")
	ClassificacaoCndoDto map(ClassificacaoCndo value);

	@Mapping(target = "nuPrioridade", source = "id.nuPrioridade")
	PrioridadeConteudoDto map(PrioridadeConteudo value);
}
