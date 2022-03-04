package br.gov.caixa.sid02.dominio.parametro.repository;

import java.util.List;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoVinculo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface CifServicoRepository extends PanacheRepository<CifServico>{

	public List<CifServico> consultarPorCifServicoETipoVinculo(final CifServicoId cifServicoId, final TipoVinculo tipoVinculo);
	
	public List<CifServico> consultarPorTipoVinculo(final TipoVinculo tipoVinculo);
	
	public List<CifServico> listarServicosPrincipais();
	
}
