package br.gov.caixa.sid02.infraestrutura.parametro.daoimpl;

import java.util.List;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;
import br.gov.caixa.sid02.dominio.parametro.modelo.TipoVinculo;
import br.gov.caixa.sid02.dominio.parametro.repository.CifServicoRepository;

public class CifServicoRepositoryImpl implements CifServicoRepository {

	@Override
	public List<CifServico> consultarPorCifServicoETipoVinculo(CifServicoId cifServicoId, TipoVinculo tipoVinculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CifServico> consultarPorTipoVinculo(TipoVinculo tipoVinculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CifServico> listarCifsServicosPrincipais() {
		// TODO Auto-generated method stub
		return null;
	}


}
