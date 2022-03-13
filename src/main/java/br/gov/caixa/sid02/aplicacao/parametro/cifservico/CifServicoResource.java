package br.gov.caixa.sid02.aplicacao.parametro.cifservico;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.gov.caixa.sid02.aplicacao.dto.mapper.CycleAvoidingMappingContext;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifComplementoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifServicoDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.dto.CifServicoIdDto;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.mapper.CifComplementoMapper;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.mapper.CifServicoMapper;
import br.gov.caixa.sid02.aplicacao.parametro.cifservico.service.CifServicoService;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.modelo.CifServico;

@Path("/cif-servico")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CifServicoResource {
	
	@Inject
	protected CifServicoService cifServicoService;
	
	@Inject
	protected CifServicoMapper cifServicoMapper;
	
	@Inject
	protected CifComplementoMapper cifComplementoMapper;
	
	@GET
	@Path("principais")
    public List<CifServicoDto> listarPrincipaisCifServico() {
		final List<CifServico> listaDeCifsPrincipais = this.cifServicoService.listarPrincipaisCifServico();
		final List<CifServicoDto> listaDeCifServicoDto = this.cifServicoMapper.fromListCifServico(listaDeCifsPrincipais);
        return listaDeCifServicoDto;
    }

	@POST
	@Path("detalhar")
    public CifServicoDto consultarCifServico(CifServicoIdDto cifServicoIdDto) {
		final CifServico cifServicoConsulta = this.cifServicoMapper.toCifServico(new CifServicoDto(cifServicoIdDto));
		final CifServico cifServico = this.cifServicoService.listarPorCifServicoId(cifServicoConsulta.getId());
		final CifServicoDto cifServicoDtoResposta = this.cifServicoMapper.fromCifServico(cifServico, new CycleAvoidingMappingContext());
        return cifServicoDtoResposta;
    }
	
	@POST
	@Path("complementos")
    public List<CifComplementoDto> listarComplementosCifServico(CifServicoDto cifServicoDto) {
		final CifServico cifServico = this.cifServicoMapper.toCifServico(cifServicoDto);
		final List<CifComplemento> cifComplementos = this.cifServicoService.listarComplementosCifServico(cifServico.getId());
		final List<CifComplementoDto> cifComplementosDtos = this.cifComplementoMapper.fromListCifComplemento(cifComplementos, new CycleAvoidingMappingContext());
        return cifComplementosDtos;
    }
	
	
}
