package br.gov.caixa.sid02.dominio.parametro.repository;

import java.util.List;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;

public interface CifServicoRepository {

	public CifServico consultarPorCifServicoId(final CifServicoId cifServicoId);
	
	public List<CifServico> listarCifsServicosPrincipais();
	
}
