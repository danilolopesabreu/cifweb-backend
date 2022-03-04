package br.gov.caixa.sid02.aplicacao.parametro.cifservico.service;

import java.util.List;

import javax.inject.Inject;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.repository.CifServicoRepository;

public class CifServicoService {
	
	@Inject
	private CifServicoRepository cifServicoRepository;
	
	public List<CifServico> listarPrincipaisCifServico(){
		return null;
	}
	
	public List<CifServico> consultarCifServicoVinculado(final CifServico cifServicoVinculador){
		return null;
	}
	
}
