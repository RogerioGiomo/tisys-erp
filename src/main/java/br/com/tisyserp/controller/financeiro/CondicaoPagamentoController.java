package br.com.tisyserp.controller.financeiro;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.faulttolerance.Retry;

import br.com.tisyserp.model.financeiro.CondicaoPagamento;
import br.com.tisyserp.repository.financeiro.CondicaoPagamentoRepository;

@Path("/condicaopagamento")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CondicaoPagamentoController {
	
	String sql  = "";

    @Inject
	public
    CondicaoPagamentoRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}") 
	@Retry(maxRetries = 4)
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getId(@PathParam("id")  Long id) throws NoResultException {

		 CondicaoPagamento resp = CondicaoPagamento.findById(id);
		if (resp == null) {
			throw new NoResultException("CondicaoPagamento - não encontrado - id: " + id);
		}
	                return Response.ok(resp).build();
	}

	@POST  
	@Transactional 
 	@Retry(maxRetries = 4)
    public @Valid CondicaoPagamento create(@Valid  CondicaoPagamento condicaopagamento) {
		CondicaoPagamento.persist(condicaopagamento);
	    return condicaopagamento;
    }
}
