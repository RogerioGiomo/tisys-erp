package br.com.tisyserp.controller.financeiro;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
	@Produces(value = MediaType.APPLICATION_JSON)
	public CondicaoPagamento getUF(@PathParam("id") final Integer id) throws NoResultException {

		final CondicaoPagamento resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("CondicaoPagamento - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid CondicaoPagamento create(@Valid final CondicaoPagamento CondicaoPagamento) {
		Repo.persist(CondicaoPagamento);
	    return CondicaoPagamento;
    }
}
