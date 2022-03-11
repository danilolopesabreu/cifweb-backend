package br.gov.caixa.sid02.infraestrutura.parametro.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.repository.CifComplementoRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CifComplementoRepositoryImpl implements PanacheRepository<CifComplemento>, CifComplementoRepository{

	@Override
	public List<CifComplemento> listarComplementosPorCifServicoVinculador(CifServicoId cifServicoId) {
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("cifservicoid", cifServicoId);
		
		final List<CifComplemento> retorno = 
				find("select "
						+ "cc "
						+ "from CifComplemento cc "
						+ "join fetch cc.cifServicoByFkD02tb201D02tb200Vncdo vncdo "
						+ "join fetch vncdo.cifCoreografias "
						+ "join fetch vncdo.cifSrvcoPrpreFrmros "
						+ "where "
						+ "	cc.cifServicoByFkD02tb201D02tb200Vnclr.id = :cifservicoid", params).list();
		
		return retorno;
	}

}
