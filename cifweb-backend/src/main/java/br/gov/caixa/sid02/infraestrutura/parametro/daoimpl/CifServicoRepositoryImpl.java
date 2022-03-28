package br.gov.caixa.sid02.infraestrutura.parametro.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.repository.CifServicoRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CifServicoRepositoryImpl implements PanacheRepository<CifServico>, CifServicoRepository {

	@Override
	public CifServico consultarPorCifServicoId(final CifServicoId cifServicoId) {
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("cifservicoid", cifServicoId);
		
		return find("SELECT "
				+ "cs "
				+ "FROM CifServico cs "
				+ "WHERE "
				+ "cs.id = :cifservicoid "
				, params).singleResult();
	}

	@Override
	public List<CifServico> listarCifsServicosPrincipais() {
		return list(
				"SELECT "
				+ "new br.gov.caixa.sid02.dominio.parametro.modelo.CifServico("
				+ "cs.id, cs.nuSubgrupo, cs.nuTipo, cs.nuSubtipo, cs.icServicoPrincipal, cs.noServico "
				+ ") "
				+ "FROM CifServico cs "
				+ "WHERE cs.icServicoPrincipal = 'S' "
				+ "ORDER BY cs.id.nuSequencialCifServico");
	}


}
