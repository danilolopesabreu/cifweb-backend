package br.gov.caixa.sid02.aplicacao.formulario.mantercif;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/formulario-cif")
public class SlctoManutencaoCifResource {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "{propriedade:'Hello SID02-CIFWEB'}";
    }
	
}
