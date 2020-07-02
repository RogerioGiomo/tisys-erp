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

import br.com.tisyserp.model.financeiro.CondicaoPagamentoParcela;
import br.com.tisyserp.repository.financeiro.CondicaoPagamentoParcelaRepository;

@Path("/condicaopagamentoparcela")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CondicaoPagamentoParcelaController {
	
	String sql  = "";

    @Inject
	public
    CondicaoPagamentoParcelaRepository Repo;

    @Inject
	EntityManager entityManager;

	@GET
	@Path("/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public CondicaoPagamentoParcela getUF(@PathParam("id") final Integer id) throws NoResultException {

		final CondicaoPagamentoParcela resp = Repo.findById(id);
		if (resp == null) {
			throw new NoResultException("CondicaoPagamentoParcela - não encontrado - id: " + id);
		}
		return resp;
	}

	@POST
    public @Valid CondicaoPagamentoParcela create(@Valid final CondicaoPagamentoParcela CondicaoPagamentoParcela) {
		Repo.persist(CondicaoPagamentoParcela);
	    return CondicaoPagamentoParcela;
    }
}
