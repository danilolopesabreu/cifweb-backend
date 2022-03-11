package br.gov.caixa.sid02.aplicacao.parametro.cifservico.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.repository.CifComplementoRepository;

@ApplicationScoped
public class CifComplementoService {

	@Inject
	protected CifComplementoRepository cifComplementoRepository;
	
	public List<CifComplemento> listarComplementosPorCifServicoVinculador(CifServicoId cifServicoId){
		
		final List<CifComplemento> retorno = cifComplementoRepository.listarComplementosPorCifServicoVinculador(cifServicoId);
		
		return retorno;
	}
}
