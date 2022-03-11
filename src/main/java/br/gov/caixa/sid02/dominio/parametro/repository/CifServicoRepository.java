package br.gov.caixa.sid02.dominio.parametro.repository;

import java.util.List;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoVinculo;

public interface CifServicoRepository {

	public List<CifServico> listarPorCifServicoETipoVinculo(final CifServicoId cifServicoId, final TipoVinculo tipoVinculo);
	
	public List<CifServico> listarPorTipoVinculo(final TipoVinculo tipoVinculo);
	
	public List<CifServico> listarCifsServicosPrincipais();
	
}
