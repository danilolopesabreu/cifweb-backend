package br.gov.caixa.sid02.aplicacao.parametro.cifservico.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.gov.caixa.sid02.dominio.parametro.repository.CifComplementoRepository;

@ApplicationScoped
public class CifComplementoService {

	@Inject
	protected CifComplementoRepository cifComplementoRepository;
	
}
