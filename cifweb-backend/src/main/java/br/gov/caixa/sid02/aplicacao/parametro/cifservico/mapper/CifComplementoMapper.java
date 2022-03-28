package br.gov.caixa.sid02.aplicacao.parametro.cifservico.mapper;

import java.util.List;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

import br.gov.caixa.sid02.aplicacao.dto.mapper.CycleAvoidingMappingContext;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CanalConteudoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifComplementoDto;
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
public interface CifComplementoMapper {

	CifComplementoDto fromCifComplemento(CifComplemento cifComplemento);

	CifComplemento toCifComplemento(CifComplementoDto cifComplementoDto);

	List<CifComplementoDto> fromListCifComplemento(List<CifComplemento> cifComplementos, @Context CycleAvoidingMappingContext context);

	List<CifComplemento> toListCifComplemento(List<CifComplementoDto> cifComplementoDtos);

	SlctoManutencaoCifDto map(SlctoManutencaoCif value);

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
