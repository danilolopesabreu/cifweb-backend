package br.gov.caixa.sid02.dominio.parametro.repository;

import java.util.List;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServicoId;

public interface CifComplementoRepository {

	public List<CifComplemento> listarComplementosPorCifServicoVinculador(CifServicoId cifServicoId);
	
}
