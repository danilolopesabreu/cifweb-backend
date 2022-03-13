package br.gov.caixa.sid02.infraestrutura.parametro.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoVinculo;
import br.gov.caixa.sid02.dominio.parametro.repository.CifServicoRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CifServicoRepositoryImpl implements PanacheRepository<CifServico>, CifServicoRepository {

	@Override
	public List<CifServico> listarPorCifServicoETipoVinculo(CifServicoId cifServicoId, TipoVinculo tipoVinculo) {
		return null;
	}

	@Override
	public CifServico listarPorCifServicoId(final CifServicoId cifServicoId) {
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("cifservicoid", cifServicoId);
		
		return find("select "
				+ "cs "
				+ "from CifServico cs "
				+ "join fetch cs.cifComplementosForFkD02tb201D02tb200Vnclr vnclr "
				+ "join fetch vnclr.tipoVinculo "
				+ "join fetch cs.cifCoreografias coreografia "
				+ "join fetch cs.cifSrvcoPrpreFrmros prpreFrmros "
				+ "join fetch prpreFrmros.tipoPrpreFrmro "
				+ "join fetch prpreFrmros.tipoConteudo "
				+ "left join prpreFrmros.sistemaConteudos "
				+ "left join prpreFrmros.canalConteudos "
				+ "left join prpreFrmros.saldoRsrvaSclCndos "
				+ "left join prpreFrmros.detalheDebitoCndos "
				+ "left join prpreFrmros.fncneEspecialCndos "
				+ "left join prpreFrmros.prpreFrmroSnlSaldos "
				+ "left join prpreFrmros.tipoExtracaoCndos "
				+ "left join prpreFrmros.classificacaoCndos "
				+ "left join prpreFrmros.prioridadeConteudos "
				+ "where "
				+ "cs.id = :cifservicoid "
				+ "and vnclr.fimVigencia = null "
				+ "and coreografia.fimVigencia = null "
				+ "and prpreFrmros.fimVigencia = null "
				
				, params).singleResult();
	}

	@Override
	public List<CifServico> listarCifsServicosPrincipais() {
		return list(
				"select "
				+ "new br.gov.caixa.sid02.dominio.parametro.modelo.CifServico("
				+ "cs.id, cs.nuSubgrupo, cs.nuTipo, cs.nuSubtipo, cs.icServicoPrincipal, cs.noServico "
				+ ") "
				+ "from CifServico cs "
				+ "where cs.icServicoPrincipal = 'S' "
				+ "order by cs.id.nuSequencialCifServico");
	}


}
