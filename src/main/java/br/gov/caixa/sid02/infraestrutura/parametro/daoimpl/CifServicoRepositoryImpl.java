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
		
		return find("SELECT "
				+ "cs "
				+ "FROM CifServico cs "
				+ "JOIN FETCH cs.cifComplementosForFkD02tb201D02tb200Vnclr vnclr "
				+ "JOIN FETCH vnclr.tipoVinculo "
				+ "LEFT JOIN cs.cifSrvcoPrpreFrmros prpreFrmros "
				+ "LEFT JOIN prpreFrmros.tipoPrpreFrmro "
				+ "LEFT JOIN prpreFrmros.tipoConteudo "
				+ "LEFT JOIN cs.cifCoreografias coreografia "
				+ "LEFT JOIN prpreFrmros.sistemaConteudos "
				+ "LEFT JOIN prpreFrmros.canalConteudos "
				+ "LEFT JOIN prpreFrmros.saldoRsrvaSclCndos "
				+ "LEFT JOIN prpreFrmros.detalheDebitoCndos "
				+ "LEFT JOIN prpreFrmros.fncneEspecialCndos "
				+ "LEFT JOIN prpreFrmros.prpreFrmroSnlSaldos "
				+ "LEFT JOIN prpreFrmros.tipoExtracaoCndos "
				+ "LEFT JOIN prpreFrmros.classificacaoCndos "
				+ "LEFT JOIN prpreFrmros.prioridadeConteudos "
				+ "WHERE "
				+ "cs.id = :cifservicoid "
				+ "AND vnclr.fimVigencia = null "
				+ "AND coreografia.fimVigencia = null "
				+ "AND prpreFrmros.fimVigencia = null "
				
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
