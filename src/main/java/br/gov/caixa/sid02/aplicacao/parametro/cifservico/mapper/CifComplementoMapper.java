package br.gov.caixa.sid02.aplicacao.parametro.cifservico.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifComplementoDto;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;

@Mapper(componentModel = "cdi")
public interface CifComplementoMapper {

	CifComplementoDto fromCifComplemento(CifComplemento cifComplemento);
	
	CifComplemento toCifComplemento(CifComplementoDto cifComplementoDto);
	
	List<CifComplementoDto> fromListCifComplemento(List<CifComplemento> cifComplementos);
	
	List<CifComplemento> toListCifComplemento(List<CifComplementoDto> cifComplementoDtos);
}
