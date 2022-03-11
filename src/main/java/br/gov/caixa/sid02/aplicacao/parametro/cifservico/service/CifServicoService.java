package br.gov.caixa.sid02.aplicacao.parametro.cifservico.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.repository.CifServicoRepository;

@ApplicationScoped
public class CifServicoService {
	
	@Inject
	protected CifServicoRepository cifServicoRepository;
	
	@Inject
	protected CifComplementoService cifComplementoService;
	
	public List<CifServico> listarPrincipaisCifServico(){
		return this.cifServicoRepository.listarCifsServicosPrincipais();
	}
	
	public List<CifComplemento> listarComplementosCifServico(CifServicoId cifServicoId){
		return this.cifComplementoService.listarComplementosPorCifServicoVinculador(cifServicoId);
	}
	
}
