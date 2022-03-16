package br.gov.caixa.sid02.aplicacao.exception.negocio;

import javax.persistence.NoResultException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NoResultExceptionProviderMapper implements ExceptionMapper<NoResultException> {

	@Override
	public Response toResponse(NoResultException exception) {
		return Response.status(Status.NOT_FOUND).entity(new NegocioException("Nenhum Resultado Encontrado.")).build();
	}

}